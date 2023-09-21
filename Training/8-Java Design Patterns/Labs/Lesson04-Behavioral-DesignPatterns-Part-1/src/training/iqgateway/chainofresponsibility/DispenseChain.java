/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.chainofresponsibility;

/**
 *
 * @author harshavardhan.reddy
 */
public interface DispenseChain {
    
    public void setNextChain(DispenseChain nextChain);
    public void dispense(Currency cur);
}
