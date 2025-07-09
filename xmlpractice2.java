package Tests;

import org.testng.annotations.Test;

public class xmlpractice2 {

	@Test(invocationCount=3)// executes 3 times 
	public void xmlmethod() {
		System.out.println("testing");
	}

	@Test(groups = { "sanity" })
	public void testcase2() {
		System.out.println("sanity");
	}

	@Test(dependsOnMethods = { "testcase4", "testcase5" }) // testcase4,testcase5 will be executed first before
															// executing testcase3
	public void testcase3() {
		System.out.println("xmltestexecution3");
	}

	@Test(priority = 0)//Lower values indicate higher priority.

	public void testcase4() {
		System.out.println("xmltestexecution4");
	}

	@Test
	public void testcase5() {
		System.out.println("xmltestexecution5");
	}
}
