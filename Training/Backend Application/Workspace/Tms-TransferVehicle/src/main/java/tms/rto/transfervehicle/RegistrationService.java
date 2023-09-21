package tms.rto.transfervehicle;



public interface RegistrationService {
	
	public RegistrationEO fectchDetailsByVehicleNumber(String VehicleNumber);

	public Integer UpdateTransferDetails(Integer ownerId);
}
