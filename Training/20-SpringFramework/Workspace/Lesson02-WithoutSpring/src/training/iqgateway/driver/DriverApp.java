package training.iqgateway.driver;

import training.iqgateway.business.CurrencyConvertorImpl;
import training.iqgateway.business.Customer;

public class DriverApp {
	
	// SOurce Object Creation
	Customer c1 = new Customer(1001, "Harsha", "Bengaluru", "7394849948");

	//Target Object Creation of Business Class
	CurrencyConvertorImpl ccRef = new CurrencyConvertorImpl();
	
	// Setter Level Injection[Binding Dependencies]
//	ccRef.setCustomerRef(c1);
	
	// Business Method Invocation
//	System.out.println(ccRef.dollarToRS(1000));
	
}
