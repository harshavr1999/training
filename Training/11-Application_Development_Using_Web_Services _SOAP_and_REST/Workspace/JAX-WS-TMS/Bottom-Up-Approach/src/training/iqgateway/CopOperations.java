package training.iqgateway;

import javax.jws.WebService;

@WebService
public class CopOperations {
    public String addOffencetoVehicle(String vehicleNumber, Integer penalty){
        return "Added "+penalty+" for "+vehicleNumber;
    }
}
