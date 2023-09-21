package backend.medicalservice.Messages.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.medicalservice.Messages.entities.MessageEO;
import backend.medicalservice.Messages.services.MessageService;

/**
 * Controller class responsible for handling message-related HTTP requests.
 */
@RestController
@RequestMapping("/messages")
public class MessageController {
	
	@Autowired MessageService messageServiceRef;
	
	/**
     * Sends a message using the provided message entity.
     *
     * @param messageEO The message entity containing sender, receiver, and message content.
     * @return ResponseEntity with a success or error message.
     */
    @PostMapping("/sendMessage")
    public ResponseEntity<String> sendMessage(@RequestBody MessageEO messageEO) {
        if (messageEO == null || messageEO.getMessages() == null || messageEO.getMessages().isEmpty()) {
           System.out.println(messageEO);
        	return ResponseEntity.badRequest().body("Message content is null or empty.");
        }
        String sender = messageEO.getSenderEmail().replace("@gmail.com", "");
        String receiver = messageEO.getReceiverEmail().replace("@gmail.com", "");
        String Queue= sender+receiver;

        String messageContent = String.join("\n", messageEO.getMessages());
        try {
            boolean sent = messageServiceRef.sendMessage(messageContent, Queue);
            if (sent) {
                return ResponseEntity.ok("Message sent successfully.");
            } else {
                return ResponseEntity.status(500).body("Failed to send message.");
            }
        } catch (IOException | TimeoutException e) {
            return ResponseEntity.status(500).body("Failed to send message due to an error.");
        }
    }
    
    /**
     * Receives messages using the provided message entity.
     *
     * @param messageEO The message entity containing sender and receiver information.
     * @return ResponseEntity with received messages or an error message.
     */
    @PostMapping("/receiveMessage")
    public ResponseEntity<String> receiveMessage(@RequestBody MessageEO messageEO) {
    	String sender = messageEO.getSenderEmail().replace("@gmail.com", "");
        String receiver = messageEO.getReceiverEmail().replace("@gmail.com", "");
        String Queue= sender+receiver;
        
        try {
            String receivedMessages = messageServiceRef.recieveMessage(Queue);
            if (!receivedMessages.isEmpty()) {
//            	System.out.println("In recive "+ receivedMessages);
                return ResponseEntity.ok(receivedMessages);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException | TimeoutException e) {
            return ResponseEntity.status(500).body("Failed to receive messages due to an error.");
        }
    }
    
    /**
     * Retrieves the size of a message queue using the provided message entity.
     *
     * @param messageEO The message entity containing sender and receiver information.
     * @return ResponseEntity with the size of the queue or an error message.
     */
    @PostMapping("/getQueueSize")
    public ResponseEntity<Integer> getQueueSize(@RequestBody MessageEO messageEO) {
    	String sender = messageEO.getSenderEmail().replace("@gmail.com", "");
        String receiver = messageEO.getReceiverEmail().replace("@gmail.com", "");
        String Queue= sender+receiver;
        System.out.println(Queue);
        Integer count = messageServiceRef.getQueueSize(Queue);
        return ResponseEntity.ok(count);
    }

	
}
