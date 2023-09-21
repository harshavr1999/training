package training.iqgateway.test;

import org.junit.Test;
import org.junit.Assert;
public class TestJUnit {
	
	@Test
	public void testSetup(){
		String str = "I am done with JUnit Setup";
		Assert.assertEquals("I am done with JUnit Setup",str);
	}
}
