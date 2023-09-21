package backend.medicalservice.Messages.services.impl;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import backend.medicalservice.Messages.controllers.RabbitMQConfig;

@Component
public class MessageProducerServiceImpl {

	@Autowired
	AmqpTemplate amqpTemplate;
	
	
	public void sendMessageWithTTL(String message, int ttlInMilliseconds) {
		amqpTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, RabbitMQConfig.ROUTING_KEY, message, messagePostProcessor -> {
            messagePostProcessor.getMessageProperties().setExpiration(String.valueOf(ttlInMilliseconds));
            return messagePostProcessor;
        });
    }
	
	public void publishMessage(String message) {
        amqpTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, RabbitMQConfig.ROUTING_KEY, message);
        System.out.println("Sent");
    }

}
