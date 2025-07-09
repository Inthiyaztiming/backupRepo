package PracticePackage;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NewTestNG
{
	
	@Test(priority=1)
	public void z() {
		System.out.println("z");
	}

	@Test
	public void y() {
		System.out.println("y");
	}

	@Ignore
	@Test(enabled=true)
	public void x() {
		System.out.println("x");
	}

	
	@Test
	public void w() {
		System.out.println("w");
	}

	@Test(priority=1)
	public void v() {
		System.out.println("v");
	}
}