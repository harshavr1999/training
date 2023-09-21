/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.observer;

/**
 *
 * @author harshavardhan.reddy
 */
public class ObserverPatternTester {
    public static void main(String[] args) {
        //Creating the publisher
        MyTopic topic = new MyTopic();
        
        //Creating Subscribers
        Observer obs1 = new MyTopicSubscriber("Obs1");
        Observer obs2 = new MyTopicSubscriber("Obs2");
        Observer obs3 = new MyTopicSubscriber("Obs3");
    
        //Registering Subscribers to the Publisher
        topic.register(obs1);
        topic.register(obs2);
        topic.register(obs3);
        
        //Attach Publisher to the Subscriber
        obs1.setSubject(topic);
        obs2.setSubject(topic);
        obs3.setSubject(topic);
        
        obs1.update();
        
        //Sending Msg to the Subscribers
        topic.postMessage("Hello Everyone...");
        
    }
    
}
