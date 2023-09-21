package backend.medicalservice.Messages.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
	
	@MessageMapping("/send-message")
    @SendTo("/topic/messages")
    public String sendMessage(String message) {
        // Process the message and send to WebSocket subscribers
        return message;
    }

}
