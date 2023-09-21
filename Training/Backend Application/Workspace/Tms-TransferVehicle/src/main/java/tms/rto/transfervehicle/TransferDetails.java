package tms.rto.transfervehicle;

import java.sql.Date;

import org.springframework.stereotype.Service;
@Service
public class TransferDetails {
		
	//Creating required variables to match front-end feels of vehicle details
	private Integer vehicleId;
	
	private String vehicleType;
	
	private String vehicleColor;
	
	private String modelNo;
	
	private Date  dateOfManufacture;
	
	private String manufactureName;
	
	
	//Creating required variables to match front-end feels of details
	private Integer ownerId;
	
	private String firstName;
	
	private String lastName;
	
	private String tempAddress;
	
	private String permAddress;
	
	private String mobileNumber;
	
	//No- Arg Constructor
	
	public TransferDetails()
	{
		
	}

	public TransferDetails(Integer vehicleId, String vehicleType, String vehicleColor, String modelNo,
			Date dateOfManufacture, String manufactureName, Integer ownerId, String firstName, String lastName,
			String tempAddress, String permAddress, String mobileNumber) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.vehicleColor = vehicleColor;
		this.modelNo = modelNo;
		this.dateOfManufacture = dateOfManufacture;
		this.manufactureName = manufactureName;
		this.ownerId = ownerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tempAddress = tempAddress;
		this.permAddress = permAddress;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "TransferDetails [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", vehicleColor="
				+ vehicleColor + ", modelNo=" + modelNo + ", dateOfManufacture=" + dateOfManufacture
				+ ", manufactureName=" + manufactureName + ", ownerId=" + ownerId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", tempAddress=" + tempAddress + ", permAddress=" + permAddress
				+ ", mobileNumber=" + mobileNumber + "]";
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTempAddress() {
		return tempAddress;
	}

	public void setTempAddress(String tempAddress) {
		this.tempAddress = tempAddress;
	}

	public String getPermAddress() {
		return permAddress;
	}

	public void setPermAddress(String permAddress) {
		this.permAddress = permAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	

}
