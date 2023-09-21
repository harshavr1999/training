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
@Path("cop")
public class CopOperations {
    private static String welcomeMSG = "No Offences found for vehicle ";
    
    @GET
    public String getOffence(){
        return welcomeMSG;
    }
    
    @PUT
    public void setOffence(String newMessage){
        welcomeMSG="Offences found for : "+ newMessage;
    }
}
