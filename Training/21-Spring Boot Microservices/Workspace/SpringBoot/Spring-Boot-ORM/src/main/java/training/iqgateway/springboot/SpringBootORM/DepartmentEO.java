package training.iqgateway.springboot.SpringBootORM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENTS")
public class DepartmentEO {

	@Id
	@Column(name="DEPARTMENT_ID")
	private Integer departmentId;
	
	@Column(name="DEPARTMENT_NAME")
	private String departmentName;
	
	@Column(name="MANAGER_ID")
	private Integer managerId;
	
	@Column(name="LOCATION_ID")
	private Integer locationId;
	
	public DepartmentEO() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentEO(Integer departmentId, String departmentName, Integer managerId, Integer locationId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
		this.locationId = locationId;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "DepartmentEO [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
				+ managerId + ", locationId=" + locationId + "]";
	}
	
	
	
}
