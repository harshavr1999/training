package training.iqgateway.test;

import org.junit.Assert;
import org.junit.Test;



public class TestUnit1 {

	String message = "Harsha";
	MessageUtil messageUtilRef = new MessageUtil(message);
	
	@Test
	public void testPrintMessage(){
		System.out.println("Inside testPrintMessage()...");
		Assert.assertEquals(message, messageUtilRef.printMessage());
	}
}
