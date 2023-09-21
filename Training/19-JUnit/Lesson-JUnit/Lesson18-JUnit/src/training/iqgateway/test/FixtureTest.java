package training.iqgateway.test;
import static org.junit.Assert.assertTrue;
import org.junit.*;
import org.junit.Test;
import junit.framework.*;
public class FixtureTest {
	 protected int value1, value2;
	   
	   @Before  // assigning the values
	   public void setUp(){
	      value1 = 3;
	      value2 = 3;
	   }

	   @Test // test method to add two values
	   public void testAdd(){
	      double result = value1 + value2;
	      assertTrue(result == 6);
	   }
}
