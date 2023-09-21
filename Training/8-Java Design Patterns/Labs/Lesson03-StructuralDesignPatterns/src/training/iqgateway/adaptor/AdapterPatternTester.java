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
public class AdapterPatternTester {
    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    
    }
    
    private static Volt getVolt(SocketAdapter socketAdapterRef, int i){
        
        switch(i){
            case 3:return socketAdapterRef.get3Volt();
            case 12:return socketAdapterRef.get12Volt();
            case 120:return socketAdapterRef.get120Volt();
            default: return socketAdapterRef.get120Volt();
        }   
    }
    
    private static void testObjectAdapter(){
        SocketAdapter sockAdapterRef = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(sockAdapterRef, 3);
        Volt v12 = getVolt(sockAdapterRef, 12);
        Volt v120 = getVolt(sockAdapterRef, 120);
        
        System.out.println("V3 Volts using Object Adapter = "+v3.getVolts());
        System.out.println("V12 Volts using Object Adapter = "+v12.getVolts());
        System.out.println("V120 Volts using Object Adapter = "+v120.getVolts());
    }
    
    private static void testClassAdapter(){
        SocketAdapter sockAdapterRef = new SocketClassAdapterImpl();
        Volt v3 = getVolt(sockAdapterRef, 3);
        Volt v12 = getVolt(sockAdapterRef, 12);
        Volt v120 = getVolt(sockAdapterRef, 120);
        
        System.out.println("V3 Volts using Class Adapter = "+v3.getVolts());
        System.out.println("V12 Volts using Class Adapter = "+v12.getVolts());
        System.out.println("V120 Volts using Class Adapter = "+v120.getVolts());
    }
    
}
