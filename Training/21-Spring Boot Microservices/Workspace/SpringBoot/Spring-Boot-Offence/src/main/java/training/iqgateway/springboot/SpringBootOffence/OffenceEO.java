package training.iqgateway.springboot.SpringBootOffence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OFFENCE")
public class OffenceEO {

	@Id
	@Column(name="OFFENCE_ID")
	private Integer offenceId;
	
	@Column(name="OFFENCE_TYPE")
	private String offenceType;
	
	@Column(name="PENALTY")
	private Integer penalty;
	
	@Column(name="VEHICLE_TYPE")
	private String vehicleType;
	
	public OffenceEO() {
		// TODO Auto-generated constructor stub
	}

	public OffenceEO(Integer offenceId, String offenceType, Integer penalty, String vehicleType) {
		super();
		this.offenceId = offenceId;
		this.offenceType = offenceType;
		this.penalty = penalty;
		this.vehicleType = vehicleType;
	}

	public Integer getOffenceId() {
		return offenceId;
	}

	public void setOffenceId(Integer offenceId) {
		this.offenceId = offenceId;
	}

	public String getOffenceType() {
		return offenceType;
	}

	public void setOffenceType(String offenceType) {
		this.offenceType = offenceType;
	}

	public Integer getPenalty() {
		return penalty;
	}

	public void setPenalty(Integer penalty) {
		this.penalty = penalty;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "OffenceEO [offenceId=" + offenceId + ", offenceType=" + offenceType + ", penalty=" + penalty
				+ ", vehicleType=" + vehicleType + "]";
	}
	
	
	
}
