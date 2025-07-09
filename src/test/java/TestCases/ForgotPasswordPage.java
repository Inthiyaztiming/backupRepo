package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseTest.BaseTestifinish;

public class ForgotPasswordPage extends BaseTestifinish {
	
      String[] userDetails;
	
        ForgotPasswordPage() throws FileNotFoundException, IOException{
		this.userDetails= exceldata();
	}
	@Test(description = "Verify by clicking on forgot password ")
	public void forgotpassword() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".cursor-pointer.text-purple.font-saira")).click();

	}

	@Test(description = "Verify by clicking on close button in forgot password popup ")
	public void closeforgotpassword() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".cursor-pointer.text-purple.font-saira")).click();
		driver.findElement(By.cssSelector("button[class='default-action-button px-md-5 btn btn-outline-primary']"))
				.click();

	}

	@Test(description = "Verify clicking on submit button without entering email in forgot password popup ")
	public void submitwithoutemailforgotpassword() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".cursor-pointer.text-purple.font-saira")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	}

	@Test(description = "Verify clicking on submit button by entering email which is not registered in forgot password popup page ")
	public void notregemailforgotpassword() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".cursor-pointer.text-purple.font-saira")).click();
		driver.findElement(By.cssSelector("input[placeholder=' ']")).sendKeys(userDetails[1]);
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	}

	@Test(description = "Verify clicking on submit button by entering already registered email in forgot password popup page ")
	public void regemailforgotpassword() throws InterruptedException {
		reusablemethods();
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".cursor-pointer.text-purple.font-saira")).click();
		driver.findElement(By.cssSelector("input[placeholder=' ']")).sendKeys(userDetails[0]);
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	}

}