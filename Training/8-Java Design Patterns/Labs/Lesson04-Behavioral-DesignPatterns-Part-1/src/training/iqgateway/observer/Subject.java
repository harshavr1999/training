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
public interface Subject {
 // Methods to Register and Unregister 
    public void register(Observer obs);
    public void unregister(Observer obs);
    
    //Methods to Notify Observers of some Change
    public void notifyObservers();
    
    //Method to get Updates from the subject
    public Object getUpdate(Observer obs);
    
}
