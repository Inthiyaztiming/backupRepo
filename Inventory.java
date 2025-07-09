package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Inventory {
	@Test
	public void firstmethod() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://10.10.10.20:81/");
		driver.manage().window().maximize();

		// loginpage
		driver.findElement(By.xpath("//div[normalize-space()='MASTER WAREHOUSE']")).click();
		driver.findElement(By.id("username")).sendKeys("master2@mail.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.className("digFirstPages")).click();
		Thread.sleep(1000);

		// dashboard
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[normalize-space()='Challan Management']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Delivery challans']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(8) div:nth-child(1) svg path")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[normalize-space()='Data cable']")).click();

		Select dropdown = new Select(driver.findElement(By.id("barcode")));
		dropdown.selectByIndex(1);
		driver.findElement(By.id("itemSubCount")).sendKeys("5");
		driver.findElement(By.id("button")).click();

		WebElement upload = driver.findElement(By.cssSelector("label[for='shipmentImage1']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", upload);
		upload.sendKeys("C:\\Users\\TTIPL\\Downloads\\Skype_Picture_2024_07_05T11_34_45_748Z.jpeg");

		// String filepath =
		// "C:\\Users\\TTIPL\\Downloads\\Skype_Picture_2024_07_05T11_34_45_748Z.jpeg";
		// WebElement upload =
		// driver.findElement(By.cssSelector("label[for='shipmentImage1']"));

	}
//surya software developer
}
