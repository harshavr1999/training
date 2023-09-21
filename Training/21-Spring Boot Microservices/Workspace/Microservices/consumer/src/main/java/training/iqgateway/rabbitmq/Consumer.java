package training.iqgateway.rabbitmq;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

 

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

 

public class Consumer {
   private static String QUEUE = "MyFirstQueue";

 

   public static void main(String[] args) throws IOException, TimeoutException {
      ConnectionFactory factory = new ConnectionFactory();
      factory.setHost("localhost");
      Connection connection = factory.newConnection();
      Channel channel = connection.createChannel();

 

      channel.queueDeclare(QUEUE, false, false, false, null);
      System.out.println("Waiting for messages. To exit press CTRL+C");

 

      DeliverCallback deliverCallback = (consumerTag, delivery) -> {
         String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
         System.out.println("Received '" + message + "'");
      };
      channel.basicConsume(QUEUE, true, deliverCallback, consumerTag -> { });
   }
}
