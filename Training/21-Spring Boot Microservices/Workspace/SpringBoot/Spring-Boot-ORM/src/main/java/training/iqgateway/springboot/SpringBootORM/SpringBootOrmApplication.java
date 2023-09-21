package training.iqgateway.springboot.SpringBootORM;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootOrmApplication implements CommandLineRunner{

	@Autowired
	DepartmentService deptServiceRef;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		DepartmentEO deptEO = new DepartmentEO(360,"Infrastructure",100,1700);
//	
//		deptServiceRef.addDepartment(deptEO);
//		
//		List<DepartmentEO> deptList = deptServiceRef.getAllDepartments();
//		
//		for (Iterator iterator = deptList.iterator(); iterator.hasNext();) {
//			DepartmentEO departmentEO = (DepartmentEO) iterator.next();
//			System.out.println(departmentEO);
//		}
		
		DepartmentEO deptEO = deptServiceRef.getDepartmentByName("Administration");
		System.out.println(deptEO);
	
	}

}
