package backend.medicalservice.Messages.controllers;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for setting up RabbitMQ components and bindings.
 */
@Configuration
public class RabbitMQConfig {
	
	public static final String EXCHANGE_NAME = "message_exchange";
    public static final String QUEUE_NAME = "message_queue";
    public static final String ROUTING_KEY = "message_routing_key";
	
    /**
     * Creates and configures a DirectExchange bean.
     *
     * @return A configured DirectExchange bean.
     */
    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }

    /**
     * Creates and configures a Queue bean for message storage.
     *
     * @return A configured Queue bean.
     */
    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME);
    }

    /**
     * Creates and configures a binding between the queue and the exchange using the specified routing key.
     *
     * @param queue    The message queue to bind.
     * @param exchange The exchange to bind the queue to.
     * @return A configured Binding object representing the binding between the queue and the exchange.
     */
    @Bean
    public Binding binding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }
}
	

