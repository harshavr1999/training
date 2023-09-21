package training.iqgateway.factory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harshavardhan.reddy
 */
public class WorkStationFactory {
    
    public static WorkStation getWorkStation(String givenType, String givenRam, String givenSsd, String givenCpu){
        
        if("Laptop".equalsIgnoreCase(givenType)){
            return new Laptop(givenRam, givenSsd, givenCpu);
        }else if("Server".equalsIgnoreCase(givenType)){
            return new Server(givenRam, givenSsd, givenCpu);
        }
        
        return null;
    }
    
}
