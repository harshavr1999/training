package training.iqgateway.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.iqgateway.business.AdminOperations;

public class DriverApp {
	
	public static void main(String[] args) {
		
		// Bringing IOC Container into Action
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/beans.xml");
		
		// We Can Lookup for the Bean Instances
		AdminOperations adminOprRef = (AdminOperations) appContext.getBean("adminOprBean");
		
		// We Can invoke the Business Logic
		System.out.println(adminOprRef.addRole());
	
	}
}
