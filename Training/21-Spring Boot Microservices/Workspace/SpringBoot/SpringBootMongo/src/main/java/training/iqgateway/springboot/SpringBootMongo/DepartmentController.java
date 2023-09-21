package training.iqgateway.springboot.SpringBootMongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	@Autowired DepartmentService deptServiceRef;
	
	@GetMapping("/allDepartments")
	public List<DepartmentEO> fetchAllDepartments(){
		return deptServiceRef.getAllDepartments();
	}
	
	@PostMapping("/add-dept")
	public void addDept(@RequestBody DepartmentEO deptEO){
		deptServiceRef.addDepartment(deptEO);
	}
}
