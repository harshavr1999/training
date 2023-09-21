package tms.rto.transfervehicle;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository RegiRepoRef;
	
	@Override
	public RegistrationEO fectchDetailsByVehicleNumber(String VehicleNumber) {
		
		return RegiRepoRef.findByVehicleId(VehicleNumber);
		
	}

	@Override
	public Integer UpdateTransferDetails(Integer ownerId) {
		
		return RegiRepoRef.UpdateTransferDetails(ownerId);
	}

}
