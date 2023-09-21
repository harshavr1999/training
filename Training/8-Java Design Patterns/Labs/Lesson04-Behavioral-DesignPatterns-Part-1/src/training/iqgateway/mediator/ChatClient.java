/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.mediator;

/**
 *
 * @author harshavardhan.reddy
 */
public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        
        User user1 = new UserImpl(mediator, "Harsha");
        User user2 = new UserImpl(mediator, "Rahul");
        User user3 = new UserImpl(mediator, "Dharma");
        User user4 = new UserImpl(mediator, "Vijay");
        
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        
        user1.send("Hello Everyone....");
    }
}
