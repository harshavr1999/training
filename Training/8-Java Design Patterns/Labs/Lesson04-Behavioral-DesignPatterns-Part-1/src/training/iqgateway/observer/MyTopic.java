/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshavardhan.reddy
 */
public class MyTopic implements Subject {
    
    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obs) {
        if(obs==null){
            throw new NullPointerException("Null Observer");
        }
        synchronized(MUTEX){
            if(!observers.contains(obs)){
                observers.add(obs);
            }
        }
    }

    @Override
    public void unregister(Observer obs) {
        synchronized(MUTEX){
            observers.remove(obs);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observerLocal = null;
        synchronized(MUTEX){
            if(!changed){
                return;
            }
            observerLocal = new ArrayList<>(this.observers);
            this.changed=false;
        }
        for(Observer obj : observerLocal){
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obs) {
        return this.message;
    }
    
    //Method to post Message to the topic
    public void postMessage(String msg){
        System.out.println("Message Posted to Topic : "+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }
    
}
