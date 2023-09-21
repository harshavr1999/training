package backend.medicalservice.Messages.services.impl;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.medicalservice.Messages.entities.MessageEO;
import backend.medicalservice.Messages.repositories.MessageRepository;
import backend.medicalservice.Messages.services.MessageService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

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

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	MessageRepository messageRepRef;

	public void receiveAndStoreMessage(String senderEmail, String receiverEmail, String messageContent) {

		MessageEO message = messageRepRef.findBySenderEmailAndReceiverEmail(senderEmail, receiverEmail);
System.out.println(messageContent+"in 1");
		if (message == null) {
			message = new MessageEO();
			message.setSenderEmail(senderEmail);
			message.setReceiverEmail(receiverEmail);
		}

//		message.getMessages().add(messageContent);
		messageRepRef.save(message);
	}

	public List<MessageEO> getMessagesBySenderAndReceiverEmails(String senderEmail, String receiverEmail) {
		return messageRepRef.findMessagesBySenderEmailAndReceiverEmail(senderEmail, receiverEmail);
	}
	
	public List<MessageEO> getMessagesBySenderEmail(String senderEmail) {
        return messageRepRef.findBySenderEmail(senderEmail);
    }

    public List<MessageEO> getMessagesByReceiverEmail(String receiverEmail) {
        return messageRepRef.findByReceiverEmail(receiverEmail);
    }

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
            channel.queueDeclare(QUEUE, false, false, false, null);

            channel.basicPublish("", QUEUE, null, updatedMessageContent.getBytes());

            return true; // Return true since the message was sent successfully
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if an exception occurred and the message wasn't sent
        }
    }

	@Override
	public String recieveMessage(String QUEUE) throws IOException, TimeoutException {
		ConnectionFactory factory = new ConnectionFactory();
	    factory.setHost("localhost");

	    int NUM_CONSUMERS = 6;
	    // Use CountDownLatch for synchronization
	    CountDownLatch latch = new CountDownLatch(NUM_CONSUMERS);

	    List<String> receivedMessages = Collections.synchronizedList(new ArrayList<>());

	    for (int i = 0; i < NUM_CONSUMERS; i++) {
	        new Thread(() -> {
	            try {
	                Channel channel = factory.newConnection().createChannel();
	                channel.queueDeclare(QUEUE, false, false, false, null);

	                DeliverCallback deliverCallback = (consumerTag, delivery) -> {
	                    String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
	                    receivedMessages.add(message);
	                };

	                channel.basicConsume(QUEUE, true, deliverCallback, consumerTag -> {});

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
	    } // Adjust this time to control the execution duration

	    // Close the channels and connection for each consumer
	    for (int i = 0; i < NUM_CONSUMERS; i++) {
	        try {
	            factory.newConnection().close();
	        } catch (IOException | TimeoutException e) {
	            e.printStackTrace();
	        }
	    }

	    if (receivedMessages.isEmpty()) {
	        return "No messages available";
	    } else {
	        return String.join("\n", receivedMessages);
	    }
	}

}
