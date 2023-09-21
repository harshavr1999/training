package tms.rto.Registration;

import java.util.List;

public interface RegistrationService {

	public void addRegistration(RegistrationEO registrationEO);
	
	public Integer findByVehicleNumber(String vehicleNumber);
	
	public List<String> allVehicleNumbers();
}
