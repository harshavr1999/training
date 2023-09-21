package training.iqgateway.entities;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENTS")
@NamedQueries({
    @NamedQuery(name = "DepartmentEO.findAll", 
                query = "select o from DepartmentEO o"),
    @NamedQuery(name = "DepartmentEO.findByDeptLocation", 
                query = "select o from DepartmentEO o where o.locationid = :givenLocationId")
})
public class DepartmentEO {
	
	@Id
	@Column(name="DEPARTMENT_ID")
	private Integer departmentId;
	
	@Column(name="DEPARTMENT_NAME")
	private String departmentName;
	
	@Column(name="MANAGER_ID")
	private Integer managerId;
	
	@Column(name="LOCATION_ID")
	private Integer locationid;
	
	public DepartmentEO() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentEO(Integer departmentId, String departmentName, Integer managerId, Integer locationid) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
		this.locationid = locationid;
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

	public Integer getLocationid() {
		return locationid;
	}

	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}

	@Override
	public String toString() {
		return "DepartmentEO [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
				+ managerId + ", locationid=" + locationid + "]";
	}
	
	
}
