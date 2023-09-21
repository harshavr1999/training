package training.iqgateway.test;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class FixtureTest {

	protected int value1, value2;
	
	@Before
	public void setUp(){
		value1=3;
		value2=3;
	}
	
	@Test
	public void testAdd(){
		double result = value1+ value2;
		Assert.assertTrue(result==6);
	}
}
