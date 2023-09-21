package training.iqgateway.driver;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.iqgateway.business.AdminOperations;
import training.iqgateway.entities.DepartmentEO;

public class DriverApp {
	public static void main(String[] args) {
		BeanFactory beanFactoryRef = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AdminOperations adminOperRef = (AdminOperations)beanFactoryRef.getBean("adminOperBean");
		
		// Invoke the Business Operations
//		DepartmentEO deptEO = new DepartmentEO(334,"New Finance",100,1700);
//		Integer result = adminOperRef.addDepartment(deptEO);
//		System.out.println(result);
		
//		List<DepartmentEO> returnDeptList = adminOperRef.fetchAllDepartments();
//		for (Iterator iterator = returnDeptList.iterator(); iterator.hasNext();) {
//			DepartmentEO departmentEO = (DepartmentEO) iterator.next();
//			System.out.println(departmentEO);
//		}
		
		List<DepartmentEO> returnDeptList = adminOperRef.fetchDepartmentsBasedonLocation(1700);
		for (Iterator iterator = returnDeptList.iterator(); iterator.hasNext();) {
			DepartmentEO departmentEO = (DepartmentEO) iterator.next();
			System.out.println(departmentEO);
		}
		
	}
}
