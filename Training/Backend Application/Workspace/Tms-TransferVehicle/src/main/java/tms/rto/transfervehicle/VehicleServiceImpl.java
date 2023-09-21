package tms.rto.transfervehicle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository vehicleRepositoryRef;

	@Override
	public VehicleEO findByvehicleId(Integer vehId) {
	
		VehicleEO vehicleDetails =vehicleRepositoryRef.findByVehicleId(vehId);
		return vehicleDetails;
	}
	
	
}
