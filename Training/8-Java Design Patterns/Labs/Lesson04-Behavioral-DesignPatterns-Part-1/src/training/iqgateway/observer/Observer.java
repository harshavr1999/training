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
public interface Observer {
    //Method to update the Observer, Used by subject
    public void update();
    
    //Attach with subject to observe
    public void setSubject(Subject sub);
}
