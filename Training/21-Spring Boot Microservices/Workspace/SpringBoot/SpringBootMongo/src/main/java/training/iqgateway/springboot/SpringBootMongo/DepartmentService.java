package training.iqgateway.springboot.SpringBootMongo;

import java.util.List;

import org.springframework.stereotype.Service;

public interface DepartmentService {
	
	public List<DepartmentEO> getAllDepartments();
	
	public void addDepartment(DepartmentEO deptEO);
}
