package training.iqgateway.driver;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.entities.DepartmentEO;

public class DriverApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BeanFactory beanfactoryRef = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        DepartmentDAO deptDAORef=(DepartmentDAO) beanfactoryRef.getBean("departmentDAOBean");
        DepartmentEO deptEO =new DepartmentEO(333, "New Accouting",100,1700);
        
//        deptDAORef.insertDepartment(deptEO);
        List<DepartmentEO> deptList = deptDAORef.findAll();
        
        for (Iterator iterator = deptList.iterator(); iterator.hasNext();) {
			DepartmentEO departmentEO = (DepartmentEO) iterator.next();
			System.out.println(departmentEO);
		}
        
        
//        DepartmentEO resultDept = deptDAORef.findDepartmentById(333);
//        System.out.println(resultDept);
        
        
        
        
    }
}