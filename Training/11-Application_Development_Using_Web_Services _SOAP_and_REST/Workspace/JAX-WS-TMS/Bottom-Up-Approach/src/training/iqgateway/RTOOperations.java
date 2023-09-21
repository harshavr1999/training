package training.iqgateway;

import javax.jws.WebService;

@WebService
public class RTOOperations {
    public String vehicleDetails(String vehiclenumber,String VehicleType){
        return vehiclenumber+" "+VehicleType;
    }
    public String addOwner(String ownerName){
        return ownerName+" added";
    }
    public String addOffence(String offenceType, String penalty){
        return offenceType+" with penalty "+penalty+" added";
    }
}
