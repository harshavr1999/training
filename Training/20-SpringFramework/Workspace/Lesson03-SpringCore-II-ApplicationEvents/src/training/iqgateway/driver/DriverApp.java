package training.iqgateway.driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverApp {
	public static void main(String[] args) {
		BeanFactory beanFactoryRef = new ClassPathXmlApplicationContext("beans.xml");
		
		// We performed this activity to track the Lify Cycle Events
		ConfigurableApplicationContext configAppContext = (ConfigurableApplicationContext)beanFactoryRef;
		
		// Now we can Invoke Life Cycle Event Methods
		configAppContext.start();
		configAppContext.stop();
		configAppContext.close();
	}
}
