package tms.rto.Registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository RegRepositoryRef;
	
	@Override
	public void addRegistration(RegistrationEO registrationEO) {
		// TODO Auto-generated method stub
		RegRepositoryRef.save(registrationEO);
	}

	@Override
	public Integer findByVehicleNumber(String vehicleNumber) {
		// TODO Auto-generated method stub
		return RegRepositoryRef.findByVehicleNumber(vehicleNumber);
	}

	@Override
	public List<String> allVehicleNumbers() {
		// TODO Auto-generated method stub
		List<String> vehicleNumberList = new ArrayList<String>();
		RegRepositoryRef.allVehicleNumbers().forEach(vehicleNumberList::add);
		return vehicleNumberList;
	}


}
