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
public class Rupee500Dispenser implements DispenseChain {
    
    private DispenseChain chain;
    
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=500){
            int num=cur.getAmount()/500;
            int remainder = cur.getAmount()%500;
            System.out.println("Dispensing "+num+" 500 Notes");
            if(remainder!=0){
                this.chain.dispense(new Currency(remainder));
            }
            
        }else{
            this.chain.dispense(cur);
            
        }
    }
    
}
