package PracticePackage;

import org.testng.annotations.Test;

public class practiceclass 
{
	@Test
	public void c() 
	{	
		System.out.println("c");
}
	@Test
	public void d() 
	{	System.out.println("d");
}
	@Test(priority=0)
	public void b() 
	{	System.out.println("b");
}
	@Test(priority=0)
	public void a() 
	{	System.out.println("a");
}
}
