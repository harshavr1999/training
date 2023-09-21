package tms.rto.Registration;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="TM_REGDETAILS")
public class RegistrationEO {
	
	@SequenceGenerator(name="TM_APP_NO_SEQ", sequenceName="TM_APP_NO_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TM_APP_NO_SEQ")
	@Column(name="APP_NO")
	private Integer applicationNumber;
	
	@Id
	@Column(name="VEH_NO")
	private String vehicleNumber;
	
	@Column(name="VEH_ID")
	private Integer vehicleId;
	
	@Column(name="OWNER_ID")
	private Integer ownerId;
	
	@Column(name="DATE_OF_PURCHASE")
	private Date dateOfPurchase;
	
	@Column(name="DISTRUBUTER_NAME")
	private String distributerName;
	
	public RegistrationEO() {
		// TODO Auto-generated constructor stub
	}

	public RegistrationEO(String vehicleNumber, Integer applicationNumber, Integer vehicleId, Integer ownerId,
			Date dateOfPurchase, String distributerName) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.applicationNumber = applicationNumber;
		this.vehicleId = vehicleId;
		this.ownerId = ownerId;
		this.dateOfPurchase = dateOfPurchase;
		this.distributerName = distributerName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Integer getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(Integer applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getDistributerName() {
		return distributerName;
	}

	public void setDistributerName(String distributerName) {
		this.distributerName = distributerName;
	}

	@Override
	public String toString() {
		return "RegistrationEO [vehicleNumber=" + vehicleNumber + ", applicationNumber=" + applicationNumber
				+ ", vehicleId=" + vehicleId + ", ownerId=" + ownerId + ", dateOfPurchase=" + dateOfPurchase
				+ ", distributerName=" + distributerName + "]";
	}
	
	
	
	
}
