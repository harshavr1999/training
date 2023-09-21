package tms.rto.Vehicle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository vehicleRepositoryRef;
	
	@Override
	public List<VehicleEO> getAllVehicles() {
		// TODO Auto-generated method stub
		List<VehicleEO> vehicleList = new ArrayList<>();
		vehicleRepositoryRef.findAll().forEach(vehicleList::add);
		return vehicleList;
	}

	@Override
	public void addVehicle(VehicleEO vehicleEO) {
		// TODO Auto-generated method stub
		vehicleRepositoryRef.save(vehicleEO);

	}

	@Override
	public void updateVehicle(VehicleEO vehicleEO) {
		// TODO Auto-generated method stub
		vehicleRepositoryRef.save(vehicleEO);

	}

	@Override
	public void deleteVehicle(Integer vehicleId) {
		// TODO Auto-generated method stub
		
		vehicleRepositoryRef.deleteById(vehicleId);

	}

	@Override
	public VehicleEO getVehicleByVehicleId(Integer vehicleId) {
		// TODO Auto-generated method stub
		VehicleEO vehicleEORef = vehicleRepositoryRef.findByVehicleId(vehicleId);
		return vehicleEORef;
	}

	@Override
	public List<Integer> allVehicleIds() {
		// TODO Auto-generated method stub
		List<Integer> vehicleIdList = new ArrayList<Integer>();
		vehicleRepositoryRef.allVehicleIds().forEach(vehicleIdList::add);
		return vehicleIdList;
	}

}
