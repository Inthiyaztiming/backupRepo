package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.BaseTestifinish;

public class LoginPage extends BaseTestifinish  {
	String[] userDetails;
	
	    LoginPage() throws FileNotFoundException, IOException{
		this.userDetails= exceldata();
	}
	
	
	@Test(description = "Verify on clicking submit button without entering data in both the username and password fields")
	public void submitbuttonwithnodata() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Test(description = "Verify on clicking submit button by entering registered email and leaving password as blank")
	public void submitwithblankpassword() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userDetails[0]);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Test(description = "Verify on clicking submit button by entering registered password and leaving username as blank")
	public void submitwithblankusername() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(userDetails[2]);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Test(description = "Verify on clicking submit button by entering credentials which are not registered")
	public void submitwithinvaliddata() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.xpath("(//h6[normalize-space()='Login / Register'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userDetails[1]);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(userDetails[3]);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Test(description = "Verify on clicking submit button by entering invalid username and registered password")
	public void invaliduservalidpassword() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userDetails[1]);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(userDetails[2]);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Test(description = "Verify on clicking submit button by entering registered username and invalid password")
	public void validuserinvalidpassword() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userDetails[0]);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(userDetails[3]);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Test(description = "Verify on clicking submit button by entering registered credentials")
	public void submitwithvaliddata() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userDetails[0]);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(userDetails[2]);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	
	

	
	
	
	@Test(enabled=false)
	public void practice() throws InterruptedException {
		reusablemethods();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		List<WebElement>events= driver.findElements(By.className("row"));
		events.stream().filter(s->s.getText().contains("SKF GOA RIVER MARATHON 2023")).findFirst().ifPresent(WebElement::click);
		
}
}