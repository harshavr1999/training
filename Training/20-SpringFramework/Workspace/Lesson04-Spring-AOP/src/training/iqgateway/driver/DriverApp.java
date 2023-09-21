package training.iqgateway.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.iqgateway.business.CurrencyConvertor;

public class DriverApp {
	
	public static void main(String[] args) {
		
		// Bringing IOC Container into Action
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/beans.xml");
		
		// We Can Lookup for the Bean Instances
		CurrencyConvertor ccRef = (CurrencyConvertor) appContext.getBean("businessBean");
		
		// We Can invoke the Business Logic
		
		System.out.println(ccRef.dollorToRS(1000));
	
	}
}
