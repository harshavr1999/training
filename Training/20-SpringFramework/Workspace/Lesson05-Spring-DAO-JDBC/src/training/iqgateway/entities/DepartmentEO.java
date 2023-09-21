package training.iqgateway.entities;

public class DepartmentEO {

	private int departmentId;
	private String departmentName;
	private int managerId;
	private int locationid;
	public DepartmentEO() {
		
	}
	public DepartmentEO(int departmentId, String departmentName, int managerId, int locationid) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
		this.locationid = locationid;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getLocationid() {
		return locationid;
	}
	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	@Override
	public String toString() {
		return "DepartmentEO [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
				+ managerId + ", locationid=" + locationid + "]";
	}
	
	
	
	
	
}
