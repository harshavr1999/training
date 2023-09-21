package tms.rto.Vehicle;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

@Entity
@Table(name="TM_VEHICLEDETAILS")
public class VehicleEO {
	
	@Id
	@SequenceGenerator(name="TM_VEH_ID_SEQ", sequenceName="TM_VEH_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TM_VEH_ID_SEQ")
	@Column(name="VEH_ID")
	private Integer vehicleId;
	
	@Column(name="VEH_TYPE")
	private String vehicleType;
	
	@Column(name="ENGINE_NO")
	private String engineNumber;
	
	@Column(name="MODEL_NO")
	private String modelNumber;
	
	@Column(name="VEH_NAME")
	private String vehicleName;
	
	@Column(name="VEH_COLOR")
	private String vehicleColor;
	
	@Column(name="MANUFACTURER_NAME")
	private String manufacturerName;
	
	@Column(name="DATE_OF_MANUFACTURE")
	private Date dateOfManufacture;
	
	@Column(name="NO_OF_CYLINDERS")
	private Integer noOfCylinders;
	
	@Column(name="CUBIC_CAPACITY")
	private Integer cubicCapacity;
	
	@Column(name="FUEL_USED")
	private String fuelUsed;
	
	public VehicleEO() {
		// TODO Auto-generated constructor stub
	}

	public VehicleEO(Integer vehicleId, String vehicleType, String engineNumber, String modelNumber, String vehicleName,
			String vehicleColor, String manufacturerName, Date dateOfManufacture, Integer noOfCylinders,
			Integer cubicCapacity, String fuelUsed) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.engineNumber = engineNumber;
		this.modelNumber = modelNumber;
		this.vehicleName = vehicleName;
		this.vehicleColor = vehicleColor;
		this.manufacturerName = manufacturerName;
		this.dateOfManufacture = dateOfManufacture;
		this.noOfCylinders = noOfCylinders;
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

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
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

	public Integer getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setNoOfCylinders(Integer noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
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
		return "VehicleEO [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", engineNumber=" + engineNumber
				+ ", modelNumber=" + modelNumber + ", vehicleName=" + vehicleName + ", vehicleColor=" + vehicleColor
				+ ", manufacturerName=" + manufacturerName + ", dateOfManufacture=" + dateOfManufacture
				+ ", noOfCylinders=" + noOfCylinders + ", cubicCapacity=" + cubicCapacity + ", fuelUsed=" + fuelUsed
				+ "]";
	}
	
	
	
}
