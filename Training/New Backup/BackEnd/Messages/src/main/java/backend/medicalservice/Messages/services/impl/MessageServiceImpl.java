package backend.medicalservice.Messages.services.impl;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.medicalservice.Messages.entities.MessageEO;
import backend.medicalservice.Messages.repositories.MessageRepository;
import backend.medicalservice.Messages.services.MessageService;

import org.springframework.amqp.AmqpIOException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import com.rabbitmq.client.Delivery;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;

/**
 * Service implementation for managing messages within the application.
 * This class provides methods to send and receive messages and retrieve
 * information about message queues.
 */
@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	MessageRepository messageRepRef;
	
	@Autowired(required=false)
	private RabbitAdmin rabbitAdminRef;

	/**
	 * Sends a message to a specified queue.
	 *
	 * @param message The content of the message to be sent.
	 * @param QUEUE The name of the queue to which the message should be sent.
	 * @return True if the message was successfully sent, false otherwise.
	 * @throws IOException if an I/O error occurs during message sending.
	 * @throws TimeoutException if a timeout occurs during the operation.
	 */
	@Override
	public boolean sendMessage(String message, String QUEUE)throws IOException, TimeoutException {
		LocalDateTime timestamp = LocalDateTime.now();
        LocalTime currentTime = LocalTime.now();

        // Format the current time as [hh:mm]
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("[HH:mm]"));

        // Modify message content to include formatted time
        String updatedMessageContent = formattedTime + " " + message + "\n"; // Append new line

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.queueDeclare(QUEUE, true, false, false, null);

            AMQP.BasicProperties properties = new AMQP.BasicProperties.Builder()
            	    .deliveryMode(2) // Make message persistent
            	    .build();

            	channel.basicPublish("", QUEUE, properties, updatedMessageContent.getBytes());

//            channel.basicPublish("", QUEUE, null, updatedMessageContent.getBytes());

            return true; // Return true since the message was sent successfully
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if an exception occurred and the message wasn't sent
        }
    }

	/**
	 * Receives messages from a specified queue.
	 *
	 * @param QUEUE The name of the queue from which to receive messages.
	 * @return A string containing received messages, or "No messages available" if none.
	 * @throws IOException if an I/O error occurs during message receiving.
	 * @throws TimeoutException if a timeout occurs during the operation.
	 */
	@Override
	public String recieveMessage(String QUEUE) throws IOException, TimeoutException {
		ConnectionFactory factory = new ConnectionFactory();
	    factory.setHost("localhost");

	    int NUM_CONSUMERS = 6;
	    // Use CountDownLatch for synchronization
	    CountDownLatch latch = new CountDownLatch(NUM_CONSUMERS);

	    List<String> receivedMessages = Collections.synchronizedList(new ArrayList<>());

	    List<Connection> connections = new ArrayList<>(); // Store connections
	    List<Channel> channels = new ArrayList<>();
	    
	    for (int i = 0; i < NUM_CONSUMERS; i++) {
	        new Thread(() -> {
	            try {
	            	Connection connection = factory.newConnection();
	                Channel channel = connection.createChannel();
	                channel.queueDeclare(QUEUE, true, false, false, null);

	                DeliverCallback deliverCallback = (consumerTag, delivery) -> {
	                    String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
	                    receivedMessages.add(message);
	                };

	                channel.basicConsume(QUEUE, true, deliverCallback, consumerTag -> {});

	                connections.add(connection);
	                channels.add(channel);
	                
	                latch.countDown(); // Signal that a consumer is active
	            } catch (IOException | TimeoutException e) {
	                e.printStackTrace();
	            }
	        }).start();
	    }

	    try {
	        latch.await();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    } // Wait until all consumers are active

	    // Wait for consumers to process messages
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    } 
	    
	    for (Channel channel : channels) {
	        try {
	            channel.close();
	        } catch (IOException | TimeoutException e) {
	            e.printStackTrace();
	        }
	    }

	    for (Connection connection : connections) {
	        try {
	            connection.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    
	    if (receivedMessages.isEmpty()) {
	        return "No messages available";
	    } else {
	        return String.join("\n", receivedMessages);
	    }
	}
	
	/**
	 * Retrieves the size of a specified queue.
	 *
	 * @param Queue The name of the queue for which to retrieve the size.
	 * @return The current size of the specified queue, or -1 if an error occurs.
	 */
	@Override
	public Integer getQueueSize(String Queue) {
		ConnectionFactory factory = new ConnectionFactory();
		try {
			Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
		        // Declare the queue passively to get its properties, including message count
		        AMQP.Queue.DeclareOk queueDeclareOk = channel.queueDeclarePassive(Queue);

		        return queueDeclareOk.getMessageCount();
		    } catch (IOException | TimeoutException e) {
		        e.printStackTrace();
		        return -1; // Error occurred while getting queue properties
		    }
	}

}
