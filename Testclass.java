package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import TestComponents.BaseTest;

public class Testclass extends BaseTest {

	@Test(description = "Login using valid username and invalid password", groups = { "regression" })
	public void testmethod() {

		this.reusablemethods();
		driver.findElement(By.id("email")).sendKeys("anukriti.sharma@gov.in");
		driver.findElement(By.id("password")).sendKeys("0101199");
		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();

	}

	@Test(description = "Login using invalid username and valid password", groups = { "regression" })
	public void testmethod2() {
		this.reusablemethods();
		driver.findElement(By.id("email")).sendKeys("anukritisharma@gov.in");
		driver.findElement(By.id("password")).sendKeys("01011990");
		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();
	}

	@Test(description = "Login using invalid username and invalid password", groups = { "regression" })
	public void testmethod3() {
		this.reusablemethods();
		driver.findElement(By.id("email")).sendKeys("anukritisharma@gov.in");
		driver.findElement(By.id("password")).sendKeys("0101199");
		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();
	}

	@Test(description = "Login using valid username and valid password", groups = { "regression" })
	public void testmethod4() {
		this.reusablemethods();
		driver.findElement(By.id("email")).sendKeys("anukriti.sharma@gov.in");
		driver.findElement(By.id("password")).sendKeys("01011990");
		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();
	}

	public void reusablemethods() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://staging.samssuite.com/");
	}
}