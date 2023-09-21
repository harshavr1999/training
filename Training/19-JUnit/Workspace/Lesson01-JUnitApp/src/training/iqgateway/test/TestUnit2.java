package training.iqgateway.test;

import org.junit.Assert;
import org.junit.Test;



public class TestUnit2 {

	String message = "Harsha";
	MessageUtil messageUtilRef = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage(){
		System.out.println("Inside testSalutationMessage()...");
		message="Hi ! "+message;
		Assert.assertEquals(message, messageUtilRef.salutationMessage());
	}
}
