package training.iqgateway.springboot.SpringBootMongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired DepartmentRepository deptRepRef;

	@Override
	public List<DepartmentEO> getAllDepartments() {
		// TODO Auto-generated method stub
		List<DepartmentEO> deptList = new ArrayList<>();
		deptRepRef.findAll().forEach(deptList::add);
		return deptList;
	}

	@Override
	public void addDepartment(DepartmentEO deptEO) {
		// TODO Auto-generated method stub
		deptRepRef.save(deptEO);

	}

}
