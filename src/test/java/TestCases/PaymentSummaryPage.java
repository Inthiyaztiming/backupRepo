package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseTestifinish;

public class PaymentSummaryPage extends BaseTestifinish
{
	public PaymentSummaryPage() throws FileNotFoundException, IOException {
		// TODO Auto-generated constructor stub
	}
	@Test(description = "Verify payment summary page is opened on clicking register button")
	public void registerbutton() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(2000);
}
	
	
	@Test(description = "Verify the price shown in the payment summary page")
	public void pricecheck() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='ps-0 col-lg-3 col-4']")).getText());
		Thread.sleep(2000);
}
	@Test(description = "Verify the participants page is opened on clicking previous button")
	public void previousbutton() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(2000);
}
	
	@Test(description = "Verify the participants page is opened on clicking view details")
	public void viewdetails() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//u[normalize-space()='View Details']")).click();
		Thread.sleep(2000);
}
	
	
	@Test(description = "Verify the organiser terms and conditions popup page should be opened in the same page on clicking link")
	public void orgtermsconditions() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='d-flex align-items-center Payment_termsAdaptiveFontSize__8iapJ mb-1'] u[class='cursor-pointer']")).click();
		Thread.sleep(2000);
}
	
	@Test(description = "Verify the close icon in organiser terms and conditions popup page ")
	public void orgtermsconditionsclose() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='d-flex align-items-center Payment_termsAdaptiveFontSize__8iapJ mb-1'] u[class='cursor-pointer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[aria-label='Close']")).click();
		Thread.sleep(2000);
}
	
	@Test(description = "Verify the privacy policy tab should be opened in the same page on clicking Ifinish terms and conditions link")
	public void ifinishtermsconditionspp() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='d-flex align-items-center Payment_termsAdaptiveFontSize__8iapJ'] u[class='cursor-pointer']")).click();
		Thread.sleep(2000);
		
}	
	@Test(description = "Verify the  terms and conditions tab is opened on clicking Terms and conditions tab in Ifinish Terms and Conditions")
	public void ifinishtermsconditionstc() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='d-flex align-items-center Payment_termsAdaptiveFontSize__8iapJ'] u[class='cursor-pointer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id='event-teams-tabs-tab-terms&Conditions']")).click();
		Thread.sleep(2000);
	}
	
	@Test(description = "Verify the  refund tab is opened on clicking Refund tab in Ifinish Terms and Conditions ")
	public void ifinishtermsconditionsrefund() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='d-flex align-items-center Payment_termsAdaptiveFontSize__8iapJ'] u[class='cursor-pointer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id='event-teams-tabs-tab-terms&Conditions']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("event-teams-tabs-tab-refund")).click();
		Thread.sleep(2000);
	}
	
	
	@Test(description = "Verify the close icon in ifinish terms and conditions popup page ")
	public void ifinishtermsconditionsclose() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='d-flex align-items-center Payment_termsAdaptiveFontSize__8iapJ'] u[class='cursor-pointer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[aria-label='Close']")).click();
		Thread.sleep(2000);
}
	
	
	@Test(description = "Verify the proceed to payment button is disabled if we dont select any of the check boxes of terms and conditions")
	public void proceedpaymentbutton() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		WebElement paymentbutton=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[2]"));
		boolean isDisabled = paymentbutton.getAttribute("disabled") != null;
		Assert.assertTrue(isDisabled, "The button should be disabled.");
}
	
	@Test(description = "Verify the proceed to payment button is disabled if we select only organiser terms and conditions not the ifinish terms and conditions")
	public void proceedpaymentbuttonterms1() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='default-action-button d-none d-md-block fw-bold text-white ms-4 btn btn-primary'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		WebElement paymentbutton=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[2]"));
		boolean isDisabled = paymentbutton.getAttribute("disabled") != null;
		Assert.assertTrue(isDisabled, "The button should be disabled.");
}
	
	@Test(description = "Verify the proceed to payment button is disabled if we select only IFINISH terms and conditions not the organiser terms and conditions")
	public void proceedpaymentbuttonterms2() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='default-action-button d-none d-md-block fw-bold text-white ms-4 btn btn-primary'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		WebElement paymentbutton=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[2]"));
		boolean isDisabled = paymentbutton.getAttribute("disabled") != null;
		Assert.assertTrue(isDisabled, "The button should be disabled.");
}
	
	@Test(description = "Verify the proceed to payment button if we select both the terms and conditions check boxes")
	public void proceedpaymentbuttonbothterms() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='default-action-button d-none d-md-block fw-bold text-white ms-4 btn btn-primary'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[2]")).click();
		
}
	
	
	@Test(description = "Verify the payment should be done successfully in razorpay", enabled=false)
	public void razorpay() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.name("contact")).sendKeys("1234567890");
		driver.findElement(By.name("button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value=\"upi\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"example@okhdfcbank\"]")).sendKeys("test123@upi");
		driver.findElement(By.xpath("//button[@data-test-id=\"vpa-submit\"]")).click();	
}
}