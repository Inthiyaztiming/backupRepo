package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseTestifinish;

public class MarathonSelectionPage extends BaseTestifinish {

	public MarathonSelectionPage() throws FileNotFoundException, IOException {
		// TODO Auto-generated constructor stub
	}

	@Test(description = "Verify the same clicked event is getting opened")
	public void eventselection() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		Thread.sleep(2000);
	}

	@Test(description = "Verify the same clicked marathon is getting opened")
	public void marathonselectiontext() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		driver.findElement(By.xpath("(//div[contains(@class,'EventPriceCard_priceCard__O1xHB cursor-pointer')])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(1000);
		WebElement marathonname = driver.findElement(By.xpath("//p[normalize-space()='Full Marathon']"));
		String marathontext = marathonname.getText();
		marathonname.click();
		String marathontextin = driver.findElement(By.xpath("//h1[normalize-space()='Full Marathon']")).getText();
		Assert.assertEquals(marathontext, marathontextin);
		Thread.sleep(2000);
	}

	@Test(description = "Verify user is able to add the marathon")
	public void addmarathon() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		Thread.sleep(2000);
	}

	@Test(description = "Verify the price of the marathon shown on the price card")
	public void checkpriceoncardmarathon() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		String price = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[2]"))
				.getText();
		System.out.println(price);
		Assert.assertEquals(price, "₹2390/-");

	}

	@Test(description = "Verify the price of the marathon shown on the total card")
	public void checkpricetotalcardmarathon() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		String pricetotal = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/p[1]"))
				.getText();
		System.out.println(pricetotal);
		Assert.assertEquals(pricetotal, "Total₹2390");
		Thread.sleep(2000);
	}

	@Test(description = "Verify user can add the marathon count using add button")
	public void maxmarathoncount() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.xpath("//img[@alt='plus']")).click();
		}
		Thread.sleep(2000);
	}

	@Test(description = "Verify user can minimise the count of the marathons using remove button")
	public void minmarathoncount() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.xpath("//img[@alt='plus']")).click();
		}
		Thread.sleep(1000);
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.cssSelector("img[alt='minus']")).click();
		}
		Thread.sleep(2000);
	}

	@Test(description = "Verify user can select the count of the marathon from the dropdown")
	public void selectmarathoncount() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		Select countdropdown = new Select(
				driver.findElement(By.cssSelector(".form-select.AddToCartButton_qtySelect__ihXFD")));
		countdropdown.selectByVisibleText("6");
		Thread.sleep(2000);
	}

	@Test(description = "Verify user participants panel is shown after clicking proceed button	")
	public void proceedmarathon() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		Select countdropdown = new Select(
				driver.findElement(By.cssSelector(".form-select.AddToCartButton_qtySelect__ihXFD")));
		countdropdown.selectByVisibleText("1");
		driver.findElement(By.xpath(
				"(//button[@class='default-action-button d-none d-sm-block fw-bold text-white ms-4 btn btn-primary'])[1]"))
				.click();
		Thread.sleep(2000);

	}

	@Test(description = "Verify registration count shown in the sticky panel is as same in the participants panel")
	public void regcountcomparison() throws InterruptedException {
		reusablemethods();
		eventselectionreusable();
		marathonselectionreusable();
		Select countdropdown = new Select(
				driver.findElement(By.cssSelector(".form-select.AddToCartButton_qtySelect__ihXFD")));
		countdropdown.selectByVisibleText("6");
		Thread.sleep(1000);
		String regcounttext = driver
				.findElement(By.xpath("(//p[@class='EventDetailsPage_textDark__IziUb fs-16 mb-0'])[1]")).getText();
		System.out.println(regcounttext);
		driver.findElement(By.xpath(
				"(//button[@class='default-action-button d-none d-sm-block fw-bold text-white ms-4 btn btn-primary'])[1]"))
				.click();
		Thread.sleep(1000);
		String regcounttext2 = driver
				.findElement(By.xpath("(//p[@class='undefined d-flex align-items-center fs-14 fw-bold mb-0'])[1]"))
				.getText();
		System.out.println(regcounttext2);
	}

}