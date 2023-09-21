package training.iqgateway.springboot.SpringBootORM;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService deptServiceRef;
	
	@RequestMapping
	public List<DepartmentEO> fetchAllDepartments(){
		return deptServiceRef.getAllDepartments();
	}
	
	@RequestMapping(value="/add-dept", method=RequestMethod.POST)
	public void addDept(@RequestBody DepartmentEO deptEO){
		deptServiceRef.addDepartment(deptEO);
	}

}
