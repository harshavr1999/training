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
public class Currency {
    private int amount;
    
    public Currency(int amt){
        this.amount = amt;
    }
    
    public int getAmount(){
        return amount;
    }
}
