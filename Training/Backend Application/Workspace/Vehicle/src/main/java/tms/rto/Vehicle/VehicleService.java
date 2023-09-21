package tms.rto.Vehicle;

import java.util.List;

public interface VehicleService {

	public List<VehicleEO> getAllVehicles();
	
	public void addVehicle(VehicleEO vehicleEO);
	
	public void updateVehicle(VehicleEO vehicleEO);
	
	public void deleteVehicle(Integer vehicleId);
	
	public VehicleEO getVehicleByVehicleId(Integer vehicleId);
	
	public List<Integer> allVehicleIds();
	
	
}
