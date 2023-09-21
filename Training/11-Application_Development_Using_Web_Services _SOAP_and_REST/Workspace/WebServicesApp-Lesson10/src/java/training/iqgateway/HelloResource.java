/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author harshavardhan.reddy
 */
@Path("hello")
public class HelloResource {
    private static String welcomeMSG = "Welcome";
    
//    @GET
//    public String sayHello(){
//        return welcomeMSG;
//    }
    
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getMessage(){
        return this.welcomeMSG;
    }
    
    
    @GET
    @Produces({MediaType.TEXT_HTML})
    public String getHTMLMessage(){
        return "<h1>" +this.welcomeMSG+"</h1>";
    }
    @GET
    @Path("{name}")
    @Produces({MediaType.TEXT_HTML})
    public String getMessageWithPathParam(@PathParam("name") String givenName){
        return "<h1>" +this.welcomeMSG+" "+givenName+"</h1>";
    }
    
    @PUT
    public void setMessage(String newMessage){
        welcomeMSG=newMessage;
    }
}
