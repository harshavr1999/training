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
@Path("clerk")
public class ClerkOperations {
    private static String welcomeMSG = "No vehilce found to generate report";
    
    @GET
    public String getReport(){
        return welcomeMSG;
    }
    
    @PUT
    public void setReport(String newMessage){
        welcomeMSG="Report generated for : "+ newMessage;
    }
    
}
