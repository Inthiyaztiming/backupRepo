package PracticePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class aclass2
{
	
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.get("aaa");
	WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(2));
	w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("a")));
	
	
	
}

}