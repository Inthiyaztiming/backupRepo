package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actions 
{
	@Test
	public void testing() 
	    {
	    	WebDriver driver= new ChromeDriver();
	    	driver.get("https://staging.samssuite.com/login");
	    	driver.findElement(By.id("email")).sendKeys("abirudh.r@thoughtgreen.com");
	    	WebElement el= driver.findElement(By.id("password"));
	    	el.sendKeys("01011990");
	    	el.sendKeys(Keys.ENTER);
	    	
	    	Actions ac= new Actions(driver);
	    	ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	    	ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	    	                //or 
	    	ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	    	
	    	//keyDown(Keys.CONTROL): For pressing the Control key
	    	//sendKeys("a"): typing the letter a for selecting all content or c for copy or v for paste
	    	//keyUp(Keys.CONTROL):  For releasing the Control key
	    	
	    }

	
}