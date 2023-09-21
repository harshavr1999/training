package training.iqgateway;

import javax.jws.WebService;

@WebService
public class ClerkOperations {
    public String addOffencetoVehicle(String vehicleNumber, Integer penalty){
        return "Added "+penalty+" for "+vehicleNumber;
    }
    public String generateReport(String vehicleNumber){
        return "Report Generated for "+vehicleNumber;
    }
}
