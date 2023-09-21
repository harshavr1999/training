package training.iqgateway.business;

public interface RtoOperations {
	
	// Vehicle
	public Integer addVehicleDetails();
	public Integer modifyVehicleDetails();
	public Integer vehicleRegistration();
	public void transferVehicle();
	
	//Owner
    public Integer addOwner();
    public Integer modifyOwner();
    
    //Offences
    public Integer addOffence();
    public Integer modifyOffence();
    public Integer deleteOffence();
}
