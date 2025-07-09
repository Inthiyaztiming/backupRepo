package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseTest.BaseTestifinish;

public class AddParticipantsPage extends BaseTestifinish
{
	public AddParticipantsPage() throws FileNotFoundException, IOException {
		// TODO Auto-generated constructor stub
	}
	
		
	@Test(description = "Verify participants count shown in the add new participant panel before adding the participant")
	public void participantcountbeforeadd() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		Select countdropdown = new Select(
				driver.findElement(By.cssSelector(".form-select.AddToCartButton_qtySelect__ihXFD")));
		countdropdown.selectByVisibleText("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"(//button[@class='default-action-button d-none d-sm-block fw-bold text-white ms-4 btn btn-primary'])[1]"))
				.click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("(//p[@class='pt-2 ps-1 text-danger'])[1]")).getText());
		Thread.sleep(2000);
		
}
	@Test(description = "Verify the close button in add participant page")
	public void addparticipantclosebutton() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		driver.findElement(By.xpath(
				"(//button[@class='default-action-button d-none d-sm-block fw-bold text-white ms-4 btn btn-primary'])[1]"))
				.click();
		driver.findElement(By.cssSelector("button[class='default-action-button btn btn-outline-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(2000);
	}
	
	@Test(description = "Verify the close icon in add participant page")
	public void addparticipantcloseicon() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		driver.findElement(By.xpath(
				"(//button[@class='default-action-button d-none d-sm-block fw-bold text-white ms-4 btn btn-primary'])[1]"))
				.click();
		driver.findElement(By.cssSelector("button[class='default-action-button btn btn-outline-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@aria-label,'Close')]")).click();
		Thread.sleep(2000);
	}
	
	@Test(description = "Verify clicking on save details button without entering any data by selecting NO in Are You filling for self?")
	public void withoutdataclickingno() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/button[1]")).click();
		driver.findElement(By.cssSelector("button[class='default-action-button btn btn-outline-primary']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	
	@Test(description = "Verify clicking on save details button without entering any new data data by selecting Yes in Are You filling for self?")
	public void withoutnewdataclickingyes() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/button[1]")).click();
		driver.findElement(By.cssSelector("button[class='default-action-button btn btn-outline-primary']")).click();
		driver.findElement(By.xpath("(//input[@id='Are You filling for self?'])[1]")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	
	@Test(description = "Verify adding the participant by selecting yes in Are You filling for self?")
	public void addparticipantyes() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		Select countdropdown = new Select(
				driver.findElement(By.cssSelector(".form-select.AddToCartButton_qtySelect__ihXFD")));
		countdropdown.selectByVisibleText("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"(//button[@class='default-action-button d-none d-sm-block fw-bold text-white ms-4 btn btn-primary'])[1]"))
				.click();
		driver.findElement(By.cssSelector("button[class='default-action-button btn btn-outline-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='Are You filling for self?'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='upload_id_proof'])[1]")).sendKeys("C:\\Users\\TTIPL\\Downloads\\testpicture.jpeg");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
		
}
	
	@Test(description = "Verify adding the participant by selecting NO in Are You filling for self?")
	public void addparticipantno() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		Thread.sleep(2000);
		
		
}
	
	@Test(description = "Verify participants count shown in the add new participant panel after adding the participant by self filling as yes")
	public void participantcountafteraddyes() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		Select countdropdown = new Select(
				driver.findElement(By.cssSelector(".form-select.AddToCartButton_qtySelect__ihXFD")));
		countdropdown.selectByVisibleText("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"(//button[@class='default-action-button d-none d-sm-block fw-bold text-white ms-4 btn btn-primary'])[1]"))
				.click();
		driver.findElement(By.cssSelector("button[class='default-action-button btn btn-outline-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='Are You filling for self?'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='upload_id_proof'])[1]")).sendKeys("C:\\Users\\TTIPL\\Downloads\\testpicture.jpeg");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("(//p[@class='pt-2 ps-1 text-success'])[1]")).getText());
		Thread.sleep(2000);
}

	@Test(description = "Verify participants count shown in the add new participant panel after adding the participant by self filling as NO")
	public void participantcountafteraddno() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		System.out.println(driver.findElement(By.xpath("(//p[@class='pt-2 ps-1 text-success'])[1]")).getText());
		Thread.sleep(2000);
}

}
