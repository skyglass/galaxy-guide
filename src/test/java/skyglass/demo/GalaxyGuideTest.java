package skyglass.demo;
 

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
 
public class GalaxyGuideTest {
 
	@Test
	public void testingCrunchifyAddition() {
		assertEquals("Here is test for Addition Result: ", 30, addition(27, 3));
	}
 
	@Test
	public void testingHelloWorld() {
		assertEquals("Here is test for Hello World String: ", "Hello + World", helloWorld());
	}
 
	public int addition(int x, int y) {
		return x + y;
	}
 
	public String helloWorld() {
		String helloWorld = "Hello +" + " World";
		return helloWorld;
	}
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(GalaxyGuideTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Both Tests finished successfully...");
		}
	}	
}
