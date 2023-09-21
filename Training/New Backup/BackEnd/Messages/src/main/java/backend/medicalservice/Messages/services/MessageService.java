package backend.medicalservice.Messages.services;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.springframework.stereotype.Service;

import backend.medicalservice.Messages.entities.MessageEO;

/**
 * Service interface for managing messages within the application.
 * This interface defines methods to send and receive messages and
 * obtain information about message queues.
 */
public interface MessageService {

	/**
     * Sends a message to a specified queue.
     *
     * @param messageContent The content of the message to be sent.
     * @param QUEUE The name of the queue to which the message should be sent.
     * @return A boolean indicating whether the message was successfully sent.
     * @throws IOException if an I/O error occurs during message sending.
     * @throws TimeoutException if a timeout occurs during the operation.
     */
    public boolean sendMessage(String messageContent, String QUEUE) throws IOException, TimeoutException;
    
    /**
     * Receives a message from a specified queue.
     *
     * @param QUEUE The name of the queue from which to receive the message.
     * @return The content of the received message.
     * @throws IOException if an I/O error occurs during message receiving.
     * @throws TimeoutException if a timeout occurs during the operation.
     */
    public String recieveMessage(String QUEUE)throws IOException, TimeoutException;
    
    /**
     * Retrieves the size of a specified queue.
     *
     * @param Queue The name of the queue for which to retrieve the size.
     * @return The current size of the specified queue.
     */
    public Integer getQueueSize(String Queue);
	
}
