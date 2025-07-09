package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class physiologin {

	@Test
	public void physiomethod() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://staging.samssuite.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("physio@gmail.com");

		driver.findElement(By.id("password")).sendKeys("01011990");

		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("roll_no")).sendKeys("anu");
		Thread.sleep(2000);

		List<WebElement> namedropdpown = driver.findElements(By.cssSelector(".ui-menu.ui-widget li"));

		for (WebElement IDdropdown : namedropdpown) {
			if (IDdropdown.getText().equalsIgnoreCase("anukriti sharma")) {
				IDdropdown.click();
				break;
			}

		}

		driver.findElement(By.cssSelector(".bg-success.text-light.px-3.search")).click();

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/div[2]/div[1]/input"))
				.sendKeys("test symptoms");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/div[2]/div[2]/span[2]/input")).click();

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/div[2]/div[3]/div/textarea"))
				.sendKeys("test vital signs");
		Thread.sleep(2000);

		Select dropdown = new Select(
				driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/div/select")));

		dropdown.selectByIndex(1);

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[2]/div/textarea"))
				.sendKeys("test mode of injury");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[1]/div[1]/div/input"))
				.sendKeys("test Cryotherapy");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[2]/div/div[1]/div/input"))
				.sendKeys("test stretching");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[1]/div[2]/div/input"))
				.sendKeys("test UST");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[2]/div/div[2]/div/input"))
				.sendKeys("test Strengthening");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[1]/div[3]/div/input"))
				.sendKeys("test IFT");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[2]/div/div[3]/div/input"))
				.sendKeys("test Taping");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[1]/div[4]/div/input"))
				.sendKeys("test swd");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[2]/div/div[4]/div/input"))
				.sendKeys("test MFR");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[1]/div[5]/div/input"))
				.sendKeys("test Dos");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[2]/div/div[5]/div/input"))
				.sendKeys("test gym exercise");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[1]/div[6]/div/input"))
				.sendKeys("test donts");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[2]/div/div[6]/div/input"))
				.sendKeys("test others");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[1]/div[7]/textarea"))
				.sendKeys("test comments1");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div/div[2]/div/div[7]/textarea"))
				.sendKeys("test comments2");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[2]/div/input[1]")).click();

		driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[5]/td[4]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[2]/div/input[2]")).click();

		driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[5]/td[4]/a")).click();

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[3]/div/button")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/aside/div/nav/div/ul/li[2]/a")).click();

		Thread.sleep(1000);

		Select batchdropdown = new Select(driver
				.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div[1]/div/form/div[1]/div[1]/select")));

		batchdropdown.selectByVisibleText("74RR");

		Thread.sleep(1000);

		Select squaddropdown = new Select(driver.findElement(By.id("squad_id")));

		squaddropdown.selectByIndex(1);

		Select cheifdropdown = new Select(driver
				.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div[1]/div/form/div[1]/div[3]/select")));

		cheifdropdown.selectByVisibleText("Spine-Thoracic");

		Select probdropdown = new Select(driver.findElement(By.id("probationer_id")));
		probdropdown.selectByIndex(1);

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div[1]/div/form/div[2]/button")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//tr/td[5]/a/img")).click();
		WebElement close = driver.findElement(By.xpath("//button[@onclick='closePopup()']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("document.querySelector('.modal-footer').scrollTop=5000");

		//js.executeScript("arguments[0].scrollIntoView();", close);
		close.click();

	}

}
