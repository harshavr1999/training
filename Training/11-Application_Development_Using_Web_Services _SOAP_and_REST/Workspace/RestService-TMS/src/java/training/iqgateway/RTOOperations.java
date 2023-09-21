/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

/**
 *
 * @author harshavardhan.reddy
 */
@Path("RTO")
public class RTOOperations {
    private static String welcomeMSG = "No Vehicle number";
    
    @GET
    public String getVehicle(){
        return welcomeMSG;
    }
    
    @PUT
    public void setVehicle(String newMessage){
        welcomeMSG="Vehicle Number is : "+ newMessage;
    }
}
