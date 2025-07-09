package Tests;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class doctorlogin {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://staging.samssuite.com/");

        driver.manage().window().maximize();

        

        driver.findElement(By.id("email")).sendKeys("doctor@gmail.com");

        driver.findElement(By.id("password")).sendKeys("01011990");

        driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[2]/div[2]/button")).click();

        Thread.sleep(2000);

        //Appointments
        driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[2]/a/span[2]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/ul/li[2]/a")).click();

        //inpatients
        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[3]/a/span[2]")));

        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[3]/div/ul/li/a")));

        actions.click().build().perform();

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div/div/table/tbody/tr/td[2]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div/div/ul/li[2]/a")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div/div/ul/li[3]/a")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div/div/ul/li[4]/a")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div/div/ul/li[5]/a")).click();
        Thread.sleep(1000);

        //Medical examination
        driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[4]/a/span[2]")).click();

        

        //dynamic drop down for roll no/name in add new

        driver.findElement(By.id("roll_no")).sendKeys("anu");
        Thread.sleep(2000);
        
        /*List<WebElement> options= driver.findElements(By.cssSelector("ul[class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front'] li"));
        
        for(WebElement option:options) 
        {
        	if(option.getText().equalsIgnoreCase("anukriti sharma")) 
        	{
        		option.click();
        		break;
        	}
        }
      

        Thread.sleep(3000);
        */
        
        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[6]/a/span[2]")));
        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[6]/ul/li/a")));
        actions.click().build().perform();
        
        driver.findElement(By.cssSelector("input[id='roll_no']")).sendKeys("anu");
        Thread.sleep(2000);
        
        List<WebElement> dropoptions= driver.findElements(By.cssSelector("ul[class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front'] li"));
        
        for(WebElement opt:dropoptions) 
        {
        	if(opt.getText().equalsIgnoreCase("anukriti sharma")) 
        	{
        		opt.click();
        		break;
        	}
        }
      
   

        /*driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/form[2]/div[1]/div[3]/div/input")).click();

        driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[5]/td[5]/a")).click();

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/form[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("101");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/form[2]/div[2]/div[1]/div[2]/input")).sendKeys("Negative");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/form[2]/div[2]/div[1]/div[3]/input")).sendKeys("Negative");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/form[2]/div[2]/div[1]/div[4]/input")).sendKeys("30");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/form[2]/div[2]/div[1]/div[5]/input")).sendKeys("101");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/form[2]/div[2]/div[1]/div[6]/input")).sendKeys("50");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/form[2]/div[2]/div[1]/div[7]/input")).sendKeys("60");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/form[2]/div[2]/div[3]/div[1]/textarea")).sendKeys("No");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/form[2]/div[2]/div[3]/div[2]/input")).sendKeys("NO");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[1]/form[2]/div[3]/button")).click();

        

        

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[2]/form/div/div[2]/div/div/input")).click();

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[2]/form/div/div[2]/div/div/input")).click();

        

        

        //dynamic drop down IN VIEW MEDICAL RECORDS

       driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[3]/div[2]/form/div/div[4]/div/button")).click();

   

        WebElement Adddata= driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[5]/a/span[2]"));

        

        actions.moveToElement(Adddata);

        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[5]/ul/li[1]/a")));

        actions.click().build().perform();

        

        

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/form/div[1]/input")).sendKeys("lab test");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[1]/form/div[2]/div/button")).click();

        Thread.sleep(3000);

        

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/form/div[1]/input")).sendKeys("test name");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/form/div[2]/input")).sendKeys("test content");

        

        

        Select type= new Select(driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/form/div[3]/select")));

        type.selectByIndex(0);

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/form/div[4]/input")).sendKeys("test manufacturer");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/form/div[5]/input")).sendKeys("test dosage");

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div/div[2]/form/div[6]/div/button")).click();//submit button in add medical data page

        

        

        actions.moveToElement(Adddata);

        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[5]/ul/li[2]/a")));

        actions.click().build().perform();

        

        // dynamic drop down

        Select tablettype= new Select(driver.findElement(By.xpath("/html/body/div[2]/section/div/form/div/div/div/div/div[2]/select")));

        tablettype.selectByIndex(1);

        driver.findElement(By.xpath("/html/body/div[2]/section/div/form/div/div/div/div/div[3]/button")).click();

        

        actions.moveToElement(Adddata);

        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[5]/ul/li[3]/a")));

        actions.click().build().perform();

        

        actions.moveToElement(Adddata);

        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[5]/ul/li[4]/a")));

        actions.click().build().perform();

        

        

        Select batch= new Select(driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div/div/form/div[1]/div[1]/div/select")));

        batch.selectByIndex(1);

        

        Select squad= new Select(driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div/div/form/div[1]/div[2]/div/select")));

        squad.selectByIndex(1);

        

        Select prob= new Select(driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div/div/form/div[1]/div[3]/div/select")));

        prob.selectByIndex(1);

        

        driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div/div/form/div[2]/div/div/div/button")).click();

        

        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[6]/a/span[2]")));

        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/aside/div/div/div[2]/ul/li[6]/ul/li/a")));

        actions.click().build().perform();

        

        //dynamic drop down in health profiles



      //get button

      driver.findElement(By.xpath("/html/body/div[2]/section/div/div[1]/div/div/div/div[1]/form/span/button")).click();

       */



               

        



        

	}







	}


