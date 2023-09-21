/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.adaptor;

/**
 *
 * @author harshavardhan.reddy
 */
public class Volt {
    private int volts;

    public Volt(int givenVolts) {
        this.volts = givenVolts;
    }

    
    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
    
}
