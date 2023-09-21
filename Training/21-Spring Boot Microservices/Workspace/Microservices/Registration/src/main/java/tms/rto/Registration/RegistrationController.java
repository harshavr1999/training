package tms.rto.Registration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
@CrossOrigin
public class RegistrationController {

	@Autowired 
	private RegistrationService regServiceRef;
	
	@PostMapping("/addRegistration")
	public void addRegistration(@RequestBody RegistrationEO registrationEO){
		regServiceRef.addRegistration(registrationEO);
	}
	
	@GetMapping("/vehicleIdByNumber/{vehicleNumber}")
	public Integer getVehicleIdByVehicleNumber(@PathVariable("vehicleNumber") String vehicleNumber){
		return regServiceRef.findByVehicleNumber(vehicleNumber);
	}
	
	@GetMapping("/allVehicleNumbers")
	public List<String> fetchAllVehicleNumbers(){
		return regServiceRef.allVehicleNumbers();
	}
	
}
