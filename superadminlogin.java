package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class superadminlogin {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://staging.samssuite.com/");



		driver.manage().window().maximize();



		//System.out.println(driver.getTitle());



		//System.out.println(driver.getCurrentUrl());



		driver.findElement(By.id("email")).sendKeys("abirudh.r@thoughtgreen.com");

		driver.findElement(By.id("password")).sendKeys("01011990");

		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();

		Thread.sleep(2000);





		Actions actions= new Actions(driver);

		WebElement timetable = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a"));

		actions.moveToElement(timetable);



		WebElement createtimetable= driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/div/ul/li[1]/a"));

		actions.moveToElement(createtimetable);

		actions.click().build().perform();



		WebElement batchdropdown= driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[1]/div/select"));



		Select dropdown= new Select(batchdropdown);

		dropdown.selectByIndex(0);





		WebElement squaddropdown= driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div/select"));

		Select dropdown2 = new Select(squaddropdown);

		dropdown2.selectByIndex(1);



		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[3]/div/input")).click();



		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[4]/td[5]/a")).click();

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[4]/div/input")).click();

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[4]/td[5]/a")).click();



		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[2]/div/div/div/button")).click();



		Thread.sleep(5000);



		WebElement copysquad= driver.findElement(By.xpath("//*[@id=\"copy_squad_id\"]"));

		Select dropdown3= new Select(copysquad);

		dropdown3.selectByVisibleText("Squad3");

		driver.findElement(By.xpath("//*[@id=\"timetableUpdate_form\"]/table/tbody/tr/td[1]/input")).click();

		//driver.findElement(By.xpath("//*[@id=\"timetableUpdate_form\"]/table/tbody/tr/td[2]/div/div[1]/div[1]/select")).click();



		WebElement activitydropdown= driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/form/table/tbody/tr/td[2]/div/div[1]/div[1]/select"));

		Select dropdown4= new Select(activitydropdown);

		dropdown4.selectByVisibleText("PT");



		WebElement subactivitydropdown = driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/form/table/tbody/tr/td[2]/div/div[1]/div[2]/select"));

		Select dropdown5= new Select(subactivitydropdown);

		dropdown5.selectByVisibleText("PT 2 (STRENGTHENING)");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/form/div[2]/div/div/div/button")).click();



		Thread.sleep(1000);



		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[2]/div[1]/button")).click();

		driver.navigate().back();



		actions.moveToElement(timetable);



		WebElement viewtimetable= driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[2]/div/ul/li[2]/a"));

		Actions actions1 = new Actions(driver);

		actions1.moveToElement(viewtimetable);

		actions1.click().build().perform();



		dropdown.selectByVisibleText("74RR");

		dropdown2.selectByVisibleText("Squad 4");



		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[3]/div/input")).click();

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[4]/a")).click();

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[4]/div/input")).click();

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[4]/td[5]/a")).click();

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[3]/div/div/div/button")).click();

		Thread.sleep(5000);



		driver.navigate().back();



		actions.moveToElement(timetable);

		driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[2]/div/ul/li[3]/a")).click();



		WebElement batchdropmissed= driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[1]/div/select"));



		Select dropdown7= new Select(driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[1]/div/select")));

		dropdown7.selectByVisibleText("73RR");

		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/form/div[1]/div[2]/div/input")).click();


		}



	}


