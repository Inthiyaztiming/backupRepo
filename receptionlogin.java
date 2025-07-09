package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class receptionlogin {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://staging.samssuite.com/");



		driver.manage().window().maximize();



		driver.findElement(By.id("email")).sendKeys("recp@gmail.com");

		driver.findElement(By.id("password")).sendKeys("01011990");

		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();





		//dynamic drop down

		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div/div/form/div[1]/div[1]/div[1]/div/div/input")).click();





		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div/div/form/div[1]/div[1]/div[1]/div/div/input")).click();



		Select doctorname= new Select(driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div/div/form/div[3]/div[1]/select")));



		doctorname.selectByVisibleText("tgt doctor");



		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div/div/form/div[3]/div[2]/input")).sendKeys("test symptoms");

		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div/div/form/div[4]/div/div/div/input")).click();

		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div/div/form/div[4]/div/div/div/input")).click();

		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div/div/form/div[5]/div/div/div/button")).click();



		driver.findElement(By.xpath("/html/body/div/section[2]/div[1]/div/button[1]")).click();

		Thread.sleep(2000);



		driver.navigate().back();



		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/section[2]/div[1]/div/button[2]")).click();



		Thread.sleep(1000);



		//dynamic drop down Patient ID



		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[1]/div[1]/div/input[1]")).click();



		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[1]/div[2]/button")).click();



		Select doctype= new Select(driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[3]/form/div[1]/div/select")));



		doctype.selectByVisibleText("Prescription");



		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[3]/form/div[2]/div[1]/input")).sendKeys("test doctor");



		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[3]/form/div[2]/div[2]/input")).sendKeys("test hospital");



		// need to upload window based file on clicking browse button needs to work with AutoIT it seems



		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[3]/form/div[3]/div/div[2]/div[2]/button")).click();



		Select doctype1= new Select(driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[3]/form/div[1]/div/select")));



		doctype.selectByVisibleText("Investigation Report");



		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[3]/form/div[3]/div/div[1]/input")).sendKeys("test name");



		//need to upload window based file on clicking browse button needs to work with AutoIT it seems



		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[3]/form/div[3]/div/div[2]/div[2]/button")).click();



		Select doctype2= new Select(driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[3]/form/div[1]/div/select")));



		doctype.selectByVisibleText("Others");



		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[3]/form/div[3]/div/div[1]/input")).sendKeys("test name");



		//need to upload window based file on clicking browse button needs to work with AutoIT it seems



		driver.findElement(By.xpath("/html/body/div/section[2]/div[2]/div[3]/form/div[3]/div/div[2]/div[2]/button")).click();

		Thread.sleep(2000);



		driver.findElement(By.xpath("/html/body/div/section[2]/div[1]/div[2]/a")).click();



			



		

	}

}
