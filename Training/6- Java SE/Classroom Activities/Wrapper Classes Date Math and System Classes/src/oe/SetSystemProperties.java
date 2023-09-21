package oe;

import java.io.FileInputStream;
import java.util.Properties;

public class SetSystemProperties {
	
	public static void main(String[] args) throws Exception {
		
		//set up new properties object from file "myProperties.txt"
		FileInputStream propFile = new FileInputStream("D:\\Training\\6- Java SE\\Classroom Activities\\Topic - Wrapper\\myProperties.txt");
		
		Properties p = new Properties(System.getProperties());
		
		p.load(propFile);
		
		// set a property through setProperty() method
		p.setProperty("myKey1", "myValue1");
		
		// set the system properties
		System.setProperties(p);
		
		// display new properties		
		System.getProperties().list(System.out);
	}
}