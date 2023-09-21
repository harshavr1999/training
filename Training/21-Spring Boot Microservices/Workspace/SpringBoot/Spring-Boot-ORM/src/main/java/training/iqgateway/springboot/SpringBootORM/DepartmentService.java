package training.iqgateway.springboot.SpringBootORM;

import java.util.List;

public interface DepartmentService {

	public List<DepartmentEO> getAllDepartments();
	
	public void addDepartment(DepartmentEO deptEO);
	
	public DepartmentEO getDepartmentByName(String gName);
}
