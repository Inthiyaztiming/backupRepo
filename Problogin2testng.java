package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestComponents.BaseTest;

public class Problogin2testng extends BaseTest {

	@Test(groups = { "sanity" })
	public void probmainmethod() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String username = "anukriti.sharma@gov.in";
		String password = "01011990";
		String url = "https://staging.samssuite.com/";

		driver.get(url);

		// implicitly wait is applicable for all the script written wherever required it
		// will wait and if we have given 5 seconds but element found in 2 seconds it
		// will immediately find the element without waiting for 5 seconds

		// login

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys("0101199");
		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();
		System.out.println(driver.findElement(By.cssSelector("div.font-medium")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/ul/li")).getText());

		Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div/ul/li")).getText(),
				"These credentials do not match our records.");
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);

		Assert.assertEquals(driver.findElement(By.xpath("//a[@class='navbar-brand p-3 ml-5']")).getText(),
				"Probationer");
		System.out.println(driver.findElement(By.xpath("//a[@class='navbar-brand p-3 ml-5']")).getText());

		Assert.assertEquals(driver.findElement(By.cssSelector("p[class='mr-3 mt-3 font-weight-bold']")).getText(),
				"anukriti sharma");
		System.out.println(driver.findElement(By.cssSelector("p[class='mr-3 mt-3 font-weight-bold']")).getText());

		// Todays schedule

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/div/div[3]/div[1]/div/div[1]/a/img"))
				.click();

		Thread.sleep(2000);

		Select dropdown = new Select(
				driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/form/div[1]/div/div/select")));

		dropdown.selectByVisibleText("Tomorrow");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/form/div[2]/div/div/div/button")).click();

		Thread.sleep(3000);

		driver.navigate().back();

		// mytargets

		WebElement mytargets = driver
				.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[2]/a/span[2]"));
		Actions actions = new Actions(driver);
		actions.click(mytargets).build().perform();
		actions.click(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[2]/ul/li[1]/a")))
				.build().perform();

		Thread.sleep(1000);

		Select targetfor = new Select(
				driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[1]/div[1]/select")));
		targetfor.selectByIndex(1);
		Thread.sleep(1000);
		Select term = new Select(driver.findElement(By.id("term")));
		term.selectByIndex(1);
		Select activity = new Select(driver.findElement(By.id("activiti_id")));
		activity.selectByVisibleText("PT");

		Thread.sleep(1000);
		Select subactivity = new Select(
				driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[2]/div[2]/select")));
		subactivity.selectByValue("1374");
		Select component = new Select(driver.findElement(By.id("componenti_id")));

		component.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[3]/button")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/form/input[5]")).clear();
		driver.findElement(By.id("goal_value")).sendKeys("200");
		driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/form/button")).click();

		Thread.sleep(1000);
		driver.navigate().back();

		// view targets

		actions.click(mytargets).build().perform();
		actions.click(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[2]/ul/li[2]/a")))
				.build().perform();

		Select activitydrop = new Select(
				driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[1]/div[1]/div[1]/div/select")));
		activitydrop.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div[1]/div[3]/a")).click();
		Thread.sleep(1000);

		driver.navigate().back();

		// Attendance
		driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[3]/a/span[2]")).click();

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div[1]/form/div[2]/div/div/div/button"))
				.click();
		Thread.sleep(2000);

		// Monthly sessions
		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/ul/li[2]/a")).click();
		Thread.sleep(2000);

		// Missed sessions
		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/ul/li[3]/a")).click();

		Thread.sleep(2000);

		// Timetable- Extra session

		actions.click(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[4]/a/span[2]"))).build()
				.perform();
		actions.click(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[4]/ul/li[2]/a")))
				.build().perform();

		Thread.sleep(3000);
		driver.findElement(By.id("extrasession_date")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.cssSelector("button.btn.formBtn.submitBtn")).click();
		Thread.sleep(1000);

		for (int k = 0; k < 3; k++) {
			driver.navigate().back();
		}

		// Badges

		driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[5]/a/span[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("search")).sendKeys("PT-1 (Endurance)");

		driver.navigate().back();

		// Hospitalisation
		driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[6]/a/span[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/ul/li[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/ul/li[2]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/ul/li[3]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/ul/li[5]/a")).click();

		Thread.sleep(2000);

		driver.navigate().back();

		// health profiles
		driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[7]/a/span[2]")).click();
		Thread.sleep(2000);

		// Instead of writing multiple same lines we can use loops for clicking on
		// performing same activity multiple times

		// To navigate back for 2 times using while loop

		int i = 1;
		while (i < 3) {
			driver.navigate().back();
			i++;
		}

		// To navigate back for 1 time using for loop

		for (int j = 1; j < 2; j++) {
			driver.navigate().back();
		}
		Thread.sleep(1000);

		// To print the links count in the page
		System.out.println(driver.findElements(By.tagName("a")).size());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// To scroll the page
		// js.executeScript("window.scrollBy(0,500)");

		// To scroll the particular table or panel, firstly we will navigate to that
		// panel then we will use js to perform scroll
		js.executeScript("document.querySelector('.slider_scroll_container').scrollTop=500");
		Thread.sleep(1000);
		// rewards and punishments
		driver.findElement(By.xpath("//span[text()='Rewards Punishments']")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("search")).sendKeys("punishment");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.slider_scroll_container').scrollTop=500");
		actions.click(driver.findElement(By.cssSelector(" li:nth-child(9)"))).build().perform();
		actions.click(
				driver.findElement(By.xpath("//body[1]/div[1]/aside[1]/div[1]/div[1]/div[2]/ul[1]/li[9]/ul[1]/li[1]")))
				.build().perform();

		driver.findElement(By.id("fitness_month")).click();
		driver.findElement(By.cssSelector(".btn.formBtn.submitBtn")).click();
		driver.findElement(By.xpath("//a[@href='#endurance']")).click();
		driver.findElement(By.xpath("//a[@href='#strength']")).click();
		driver.findElement(By.xpath("//a[@href='#flexibility']")).click();

		// Logout
		driver.findElement(By.xpath("//img[@class='rounded-circle h-50 mr-2 mt-2']")).click();
		WebElement logout = driver.findElement(By.partialLinkText("Logout"));
		Assert.assertEquals(logout.getText(), "Logout");
		System.out.println(logout.getText());
		logout.click();
	}

}