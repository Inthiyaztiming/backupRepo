package Tests;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import TestComponents.BaseTestUPPRPB;

public class UPPRPB extends BaseTestUPPRPB {

	@Test(description = "positive flow with NO")
	public void upprbtestmethod() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://etrpindia.com/upprpb_si_test/applicationHome");
		WebElement dirreg = driver.findElement(By.xpath("(//button[contains(text(),'DIRECT REGISTER')])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dirreg);
		Thread.sleep(1000);
		dirreg.click();

		Select title = new Select(driver.findElement(By.id("name_title")));
		title.selectByIndex(1);
		
		
		driver.findElement(By.id("firstName")).sendKeys("testup1 first name51");
		driver.findElement(By.id("fathername")).sendKeys("testup1 father name43");
		driver.findElement(By.id("mothername")).sendKeys("testup1 mother name43");
		driver.findElement(By.id("recordClientDob")).sendKeys("01-09-1999");
		driver.findElement(By.cssSelector(".datepick-cmd.datepick-cmd-close ")).click();
		driver.findElement(By.id("sexid")).click();
		driver.switchTo().alert().accept();

		js.executeScript("window.scrollBy(0,350)", "");

		Select nationality = new Select(driver.findElement(By.id("nationality")));
		nationality.selectByValue("Indian");

		//Mob no
		
		driver.findElement(By.id("recordClientPhone")).sendKeys("6090807243");
		driver.findElement(By.id("recordClientPhone2")).sendKeys("6090807243");

		//Email
		
		driver.findElement(By.id("recordClientEmail")).sendKeys("testup143upprpb@yopmail.com");
		driver.findElement(By.id("recordClientEmail2")).sendKeys("testup143upprpb@yopmail.com");

		js.executeScript("window.scrollBy(0,350)", "");

		driver.findElement(By.id("address_line1")).sendKeys("test address1");
		driver.findElement(By.id("address_line2")).sendKeys("test address2");

		driver.findElement(By.id("village")).sendKeys("test village");
		driver.findElement(By.id("postoffice")).sendKeys("test po");
		driver.findElement(By.id("policestation")).sendKeys("test ps");
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByIndex(2);
		Thread.sleep(3000);

		Select district = new Select(driver.findElement(By.id("district")));
		district.selectByIndex(2);
		driver.findElement(By.id("recordZipcode")).sendKeys("010101");

		driver.findElement(By.id("correspondence_address")).click();

		Select identity = new Select(driver.findElement(By.id("identity_type")));
		identity.selectByIndex(1);

		//identification
		driver.findElement(By.id("aadharNo")).sendKeys("499999999712");

		driver.findElement(By.id("aadharNo_opt")).sendKeys("499999999712");

		js.executeScript("window.scrollBy(0,350)", "");

		driver.findElement(By.id("personalMoal")).sendKeys("test marks");

		driver.findElement(By.id("personalMoal2")).sendKeys("test marks two");

		driver.findElement(By.xpath("(//input[@name='up_domiciled'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='employee_ssb'])[2]")).click();
		js.executeScript("window.scrollBy(0,350)", "");

		driver.findElement(By.id("firstDivNext")).click();

		// Education page

		driver.findElement(By.id("university_1")).sendKeys("test 10th ");
		driver.findElement(By.xpath("(//input[@name='edu_rollno_1'])[1]")).sendKeys("123454");

		driver.findElement(By.xpath("(//input[@name='edu_certno_1'])[1]")).sendKeys("321321312");

		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByIndex(2);
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("2019");

		driver.findElement(By.id("university_plus2")).sendKeys("test 12th");

		driver.findElement(By.xpath("(//input[@name='edu_rollno_plus2'])[1]")).sendKeys("321312213");

		driver.findElement(By.xpath("(//input[@name='edu_certno_plus2'])[1]")).sendKeys("32132123");

		Select month12 = new Select(driver.findElement(By.xpath("(//select[@id='month'])[2]")));
		month12.selectByIndex(2);

		Select year12 = new Select(driver.findElement(By.xpath("(//select[@id='year'])[2]")));
		year12.selectByValue("2021");

		Select grad = new Select(driver.findElement(By.id("graduation_type")));
		grad.selectByIndex(3);

		driver.findElement(By.id("university_3")).sendKeys("test grad");
		driver.findElement(By.xpath("(//input[@name='edu_rollno_3'])[1]")).sendKeys("3223321");

		driver.findElement(By.xpath("(//input[@name='edu_certno_3'])[1]")).sendKeys("32132231");

		Select monthgrad = new Select(driver.findElement(By.xpath("(//select[@id='month'])[3]")));
		monthgrad.selectByIndex(3);

		Select yeargrad = new Select(driver.findElement(By.xpath("(//select[@id='year'])[3]")));
		yeargrad.selectByValue("2024");

		driver.findElement(By.xpath("(//input[@name='olevel'])[2]")).click();

		driver.findElement(By.xpath("(//input[@name='tarmy'])[2]")).click();

		driver.findElement(By.xpath("(//input[@name='ncc'])[2]")).click();

		driver.findElement(By.id("thirdDivNext")).click();

		WebElement Proceedbutton = driver.findElement(By.id("complexConfirm"));
		js.executeScript("arguments[0].scrollIntoView();", Proceedbutton);

		driver.findElement(By.id("agree_save")).click();
		driver.findElement(By.id("agree_save1")).click();
		driver.findElement(By.xpath("(//input[@name='answer'])[1]")).sendKeys("abcdef");
		Proceedbutton.click();

		for (int i = 0; i < 2; i++) {
			driver.switchTo().alert().accept();

		}

		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".nextbutton")).click();

		Thread.sleep(3000);
		
		
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> it = windowhandles.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);

		// upload docs page

		String jpgfile = "C:\\Users\\TTIPL\\Downloads\\Sample-jpg-image-100kb.jpg";
		String pdffile = "C:\\Users\\TTIPL\\Downloads\\report.pdf";
		WebElement photo = driver.findElement(By.id("photosrc"));
		WebElement signature = driver.findElement(By.id("sigsrc"));
		WebElement ssc = driver.findElement(By.id("matricsrc"));
		WebElement plustwo = driver.findElement(By.id("plus2src"));
		WebElement graduation = driver.findElement(By.id("gradsrc"));
		WebElement identitydoc = driver.findElement(By.id("identitysrc"));

		photo.sendKeys(jpgfile);

		js.executeScript("arguments[0].scrollIntoView();", signature);
		signature.sendKeys(jpgfile);

		js.executeScript("arguments[0].scrollIntoView();", ssc);
		ssc.sendKeys(pdffile);

		js.executeScript("arguments[0].scrollIntoView();", plustwo);
		plustwo.sendKeys(pdffile);

		js.executeScript("arguments[0].scrollIntoView();", graduation);
		graduation.sendKeys(pdffile);

		js.executeScript("arguments[0].scrollIntoView();", identitydoc);
		identitydoc.sendKeys(pdffile);

		WebElement proceed= driver.findElement(By.cssSelector(".open3"));
		driver.findElement(By.id("agree_save1")).click();
		driver.findElement(By.id("agree_save")).click();
		driver.findElement(By.id("agree_save2")).click();
		driver.findElement(By.id("agree_save4")).click();
		driver.findElement(By.id("agree_save5")).click();
		driver.findElement(By.id("agree_save6")).click();
		js.executeScript("arguments[0].scrollIntoView();", proceed);
		driver.findElement(By.id("agree_save7")).click();
		driver.findElement(By.id("agree_save8")).click();
		proceed.click();

	}

}
