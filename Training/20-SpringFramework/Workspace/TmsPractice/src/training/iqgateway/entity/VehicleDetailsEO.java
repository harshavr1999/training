package training.iqgateway.entity;

import java.sql.Date;

public class VehicleDetailsEO {
    private Integer vehicleId;
    private String vehicleType;
    private String vehicleName;
    private String model;
    private String vehicleColor;
    private String manufacturerName;
    private Date dateOfManufacture;
    private String engineNumber;
    private String chasisNumber;
    private Integer cubicCapacity;
    private String fuelUsed;
    
    public VehicleDetailsEO(){
    }

	public VehicleDetailsEO(Integer vehicleId, String vehicleType, String vehicleName, String model,
			String vehicleColor, String manufacturerName, Date dateOfManufacture, String engineNumber,
			String chasisNumber, Integer cubicCapacity, String fuelUsed) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
		this.model = model;
		this.vehicleColor = vehicleColor;
		this.manufacturerName = manufacturerName;
		this.dateOfManufacture = dateOfManufacture;
		this.engineNumber = engineNumber;
		this.chasisNumber = chasisNumber;
		this.cubicCapacity = cubicCapacity;
		this.fuelUsed = fuelUsed;
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

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public Integer getCubicCapacity() {
		return cubicCapacity;
	}

	public void setCubicCapacity(Integer cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}

	public String getFuelUsed() {
		return fuelUsed;
	}

	public void setFuelUsed(String fuelUsed) {
		this.fuelUsed = fuelUsed;
	}

	@Override
	public String toString() {
		return "VehicleDetailsEO [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", vehicleName="
				+ vehicleName + ", model=" + model + ", vehicleColor=" + vehicleColor + ", manufacturerName="
				+ manufacturerName + ", dateOfManufacture=" + dateOfManufacture + ", engineNumber=" + engineNumber
				+ ", chasisNumber=" + chasisNumber + ", cubicCapacity=" + cubicCapacity + ", fuelUsed=" + fuelUsed
				+ "]";
	}
    
    
}
