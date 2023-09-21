/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.factorymethod.test;

import training.iqgateway.factory.WorkStation;
import training.iqgateway.factory.WorkStationFactory;

/**
 *
 * @author harshavardhan.reddy
 */
public class FactoryMethodPatternTest {
    
    public static void main(String[] args) {
        //Laptop laptopRef = new Laptop()
        WorkStation laptopRef = WorkStationFactory.getWorkStation("Laptop", "8 GB", "512 GB", "2.4 GHz");
        
        WorkStation serverRef = WorkStationFactory.getWorkStation("server", "32 GB", "1024 GB", "3.0 GHz");
     
        System.out.println("Factory Laptop Config Details : "+laptopRef);
        System.out.println("Factory Server Config Details : "+serverRef);
    }
    
}
