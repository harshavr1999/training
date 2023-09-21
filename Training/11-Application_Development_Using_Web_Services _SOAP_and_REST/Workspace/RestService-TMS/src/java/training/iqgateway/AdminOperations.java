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
@Path("admin")
public class AdminOperations {
    private static String welcomeMSG = "No Username";
    
    @GET
    public String getUsername(){
        return welcomeMSG;
    }
    
    @PUT
    public void setUsername(String newMessage){
        welcomeMSG="Username is : "+ newMessage;
    }
    
}
