package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseTest.BaseTestifinish;

public class ParticipantsEditDeletePage extends BaseTestifinish {

	public ParticipantsEditDeletePage() throws FileNotFoundException, IOException {
		// TODO Auto-generated constructor stub
	}

	@Test(description = "Verify the edit page should be opened after clicking edit button in adding the participants")
	public void editparticipants() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		Thread.sleep(2000);
	}

	@Test(description = "Verify the edit page should be closed on clicking close button in edit participant details page")
	public void closeeditparticipants() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the email in participants details")
	public void editemail() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.clear();
		emailid.sendKeys("testqa@yopmail.com");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the gender in participants details")
	public void editgender() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByIndex(2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the mobile number in participants details")
	public void editmobilenumber() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		WebElement mobno = driver.findElement(By.id("mobile_number"));
		mobno.clear();
		mobno.sendKeys("7654321098");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the DOB in participants details")
	public void editdob() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		WebElement dob = driver.findElement(By.id("date_of_birth"));
		dob.clear();
		dob.sendKeys("11-09-1990");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the firstname in participants details")
	public void editfirstname() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.clear();
		firstname.sendKeys("first qa name");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the lastname in participants details")
	public void editlastname() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.clear();
		lastname.sendKeys("last qa name");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the Area in participants details")
	public void editArea() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		WebElement area = driver.findElement(By.id("area"));
		area.clear();
		area.sendKeys("area test qa");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the streetaddress in participants details")
	public void editstreetaddress() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		WebElement streetaddress = driver.findElement(By.id("street_address"));
		streetaddress.clear();
		streetaddress.sendKeys("street test qa");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the pincode in participants details")
	public void editpincode() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		WebElement pincode = driver.findElement(By.id("pincode"));
		pincode.clear();
		pincode.sendKeys("333333");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the nationality in participants details")
	public void editnationality() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		WebElement nationality = driver.findElement(By.id("nationality"));
		nationality.clear();
		nationality.sendKeys("American");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the country in participants details")
	public void editcountry() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		WebElement country = driver.findElement(By.id("country"));
		country.clear();
		country.sendKeys("USA");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the state in participants details")
	public void editstate() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		WebElement state = driver.findElement(By.id("state"));
		state.clear();
		state.sendKeys("Texas");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the bloodgroup in participants details")
	public void editbloodgroup() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		Select bloodgroup = new Select(driver.findElement(By.id("blood_group")));
		bloodgroup.selectByIndex(2);
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the tshirtsize in participants details")
	public void edittshirtsize() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		Select tshirtsize = new Select(driver.findElement(By.id("tshirt_size")));
		tshirtsize.selectByIndex(2);
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the phychallenged in participants details")
	public void editphychallenged() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the healthhistory in participants details")
	public void edithealthhistory() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.click();
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify clicking on save details button by editing the idproof in participants details")
	public void editidproof() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		editparticipantsreusbale();
		driver.findElement(By.id("upload_id_proof")).sendKeys("C:\\Users\\TTIPL\\Downloads\\SamplePNGImage_1mbmb.png");
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
	}

	@Test(description = "Verify the added participant should be deleted on clicking delete button")
	public void deleteparticipants() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		addparticipantreusable();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[1]")).click();
		Thread.sleep(2000);
	}
}