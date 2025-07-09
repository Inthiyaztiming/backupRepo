package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class xmlpractice extends xmlpractice2 {

	@AfterTest
	public void testmethod1() {
		System.out.println("This has be executed last");
	}

	@BeforeTest
	public void testmethod2() {
		System.out.println("This has be executed  first");
	}

	@AfterMethod
	public void aftertest() {
		System.out.println("This will be executed after every test class");
	}

	@Test(enabled = false)
	public void testmethod3() {
		System.out.println("This has be skipped");

	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("This will be executed before every test method");
	}

	@Test(groups = { "sanity" })
	public void testmethod() {
		System.out.println("sanitytest");
	}

	@Test(dataProvider = "testdata")
	public void testdataprovider(String username, String password) {
		
		System.out.println(username);
		System.out.println(password);

	}

	@DataProvider(name = "testdata")

	public String[][] dataprovider() {
		 return new String[][] 
				 {
			 { "row1col1", "row1col2" },  // First row of data
	            { "row2col1", "row2col2" }
				 };
		
}}
