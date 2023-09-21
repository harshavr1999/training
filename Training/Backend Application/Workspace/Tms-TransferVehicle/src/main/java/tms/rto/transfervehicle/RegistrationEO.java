package tms.rto.transfervehicle;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//import lombok.Data;

@Entity
@Table(name="TM_REGDETAILS")
//@Data
public class RegistrationEO {
	
	@SequenceGenerator(name="TM_APP_NO_SEQ", sequenceName="TM_APP_NO_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TM_APP_NO_SEQ")
	@Column(name="APP_NO")
	private Integer ApplicationNumber;
	
	
	
	@Id
	@Column(name="VEH_NO")
	private String vehicleNumber;
	

	
	
//	@OneToMany(mappedBy ="vehicleId",cascade = CascadeType.ALL)
//   @JoinColumn(name = "VEH_ID")
//    private List<VehicleEO> vehicleEo;

	@Column(name="VEH_ID")
	private Integer VehicleId;
	
	
	
//	@OneToMany(mappedBy ="ownerId",cascade = CascadeType.ALL)
//	@JoinColumn(name = "OWNER_ID")
//    private List<OwnerEO> ownerEO;

	
	@Column(name="OWNER_ID")
	private Integer OwnerId;
	
	
	@Column(name="DATE_OF_PURCHASE")
	private Date DateOfPurchase;
	
	
	@Column(name="DISTRUBUTER_NAME")
	private String DistributorName;

	
	//No-Arg Constructor
	public RegistrationEO()
	{
		
	}
	
	
	public RegistrationEO(Integer applicationNumber, String vehicleNumber, Integer vehicleId, @NotNull Integer ownerId,
			@NotNull Date dateOfPurchase, @NotEmpty String distributorName) {
		super();
		ApplicationNumber = applicationNumber;
		this.vehicleNumber = vehicleNumber;
		VehicleId = vehicleId;
		OwnerId = ownerId;
		DateOfPurchase = dateOfPurchase;
		DistributorName = distributorName;
	}
	
	

	@Override
	public String toString() {
		return "RegistrationEO [ApplicationNumber=" + ApplicationNumber + ", vehicleNumber=" + vehicleNumber
				+ ", VehicleId=" + VehicleId + ", OwnerId=" + OwnerId + ", DateOfPurchase=" + DateOfPurchase
				+ ", DistributorName=" + DistributorName + "]";
	}





	public Integer getApplicationNumber() {
		return ApplicationNumber;
	}


	public void setApplicationNumber(Integer applicationNumber) {
		ApplicationNumber = applicationNumber;
	}


	public String getVehicleNumber() {
		return vehicleNumber;
	}


	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}


	public Integer getVehicleId() {
		return VehicleId;
	}


	public void setVehicleId(Integer vehicleId) {
		VehicleId = vehicleId;
	}


	public Integer getOwnerId() {
		return OwnerId;
	}


	public void setOwnerId(Integer ownerId) {
		OwnerId = ownerId;
	}


	public Date getDateOfPurchase() {
		return DateOfPurchase;
	}


	public void setDateOfPurchase(Date dateOfPurchase) {
		DateOfPurchase = dateOfPurchase;
	}


	public String getDistributorName() {
		return DistributorName;
	}


	public void setDistributorName(String distributorName) {
		DistributorName = distributorName;
	}
	

}
