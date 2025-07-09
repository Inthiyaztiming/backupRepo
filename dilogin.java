package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dilogin {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://staging.samssuite.com/");



		driver.manage().window().maximize();


		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[1]/div/div[1]/input")).sendKeys("mukeshod@svpnpa.gov.in");

		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("01011990");

		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();

		Thread.sleep(2000);



		WebElement sqd1= driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/div/div/div/button[1]/img"));

		sqd1.click();



		WebElement timetable= driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[2]/a"));



		Actions actions= new Actions(driver);

		actions.moveToElement(timetable);

		actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[2]/div/ul/li[1]/a")));

		actions.click().build().perform();

		Thread.sleep(1000);

		driver.navigate().back();



		driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[4]/a/span[2]")).click();//reports

		driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[5]/a/span[2]")).click();//badges



		WebElement searchbox= driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div[1]/div[2]/div/input"));

		actions.moveToElement(searchbox);

		actions.sendKeys("PT-II(Strengthening)");



		WebElement viewchallenges= driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/table/tbody/tr[4]/td[2]/a"));

		actions.moveToElement(viewchallenges);

		actions.click().build().perform();



		Thread.sleep(1000);



		driver.navigate().back();

		driver.navigate().back();

		WebElement dashboard= driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[1]/a/span[2]"));

		dashboard.click();

		sqd1.click();



		//missed class attendance from dashboard



		driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]")).click();



		Thread.sleep(5000);



		driver.findElement(By.xpath("/html/body/div[2]/section/div[1]/div/form/div[3]/button")).click();

		driver.navigate().back();



		driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[4]/a/span[2]"));



		Select dropdown= new Select(driver.findElement(By.xpath("/html/body/div[2]/section/div/form/div/div[2]/div[1]/select")));

		dropdown.selectByVisibleText("PT");

		Thread.sleep(10000);



		driver.navigate().back();



		//charts



		WebElement charts= driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[9]/a/span[2]"));



		JavascriptExecutor js= (JavascriptExecutor)driver;



		js.executeScript("arguments[0].scrollIntoView();",charts);



		charts.click();



		Select dropdown2 = new Select(driver.findElement(By.xpath("/html/body/div[2]/section/div[1]/div/form/div[1]/div[3]/select")));



		dropdown2.selectByVisibleText("BOAC");



		Select dropdown3= new Select(driver.findElement(By.xpath("/html/body/div[2]/section/div[1]/div/form/div[1]/div[4]/select")));

		dropdown3.selectByVisibleText("BOAC");



		driver.findElement(By.xpath("/html/body/div[2]/section/div[1]/div/form/div[2]/div[3]/a/img")).click();



		driver.navigate().back();

			}		

	
}
