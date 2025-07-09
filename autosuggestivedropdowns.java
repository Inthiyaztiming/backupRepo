package Tests;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class autosuggestivedropdowns {

	public static void main(String[] args) throws InterruptedException {
		String username = "abirudh.r@thoughtgreen.com";
		String password = "01011990";
		String url = "https://staging.samssuite.com/";

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();

		Actions actions = new Actions(driver);
		actions.moveToElement(
				driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[4]/a/span[2]")));
		actions.moveToElement(
				driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[4]/ul/li[2]/a")));
		actions.click().build().perform();

		Select dropdown = new Select(driver.findElement(By.id("batch_id")));
		dropdown.selectByIndex(0);

		driver.findElement(By.id("roll_no")).sendKeys("anu");
		Thread.sleep(1000);

		List<WebElement> options = driver.findElements(
				By.cssSelector("ul[class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front'] li"));

		// Instead of using for loops and if loops we can use streams as below to
		// extract values from autosuggestive dropdown and perform click

		options.stream().filter(s -> s.getText().equalsIgnoreCase("Anurag Daru")).findFirst()
				.ifPresent(WebElement::click);
		
// enhanced for loop is designed for arrays and collections because we cant perform decrement sum.. etcc kind of actions which we perform in for
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("anukriti sharma")) {
				option.click();
				break;
			}
		}

	}

}
