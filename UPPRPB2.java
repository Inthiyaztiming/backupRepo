package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import TestComponents.BaseTestUPPRPB;

public class UPPRPB2 extends BaseTestUPPRPB {

	@Test(description="Positive flow with Yes")
	public void yestestmethod() throws InterruptedException {

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
		driver.findElement(By.id("firstName")).sendKeys("test first name");
		driver.findElement(By.id("fathername")).sendKeys("test father name");
		driver.findElement(By.id("mothername")).sendKeys("test mother name");
		driver.findElement(By.id("recordClientDob")).sendKeys("01-07-2003");
		driver.findElement(By.cssSelector(".datepick-cmd.datepick-cmd-close ")).click();
		driver.findElement(By.id("sexid")).click();
		driver.switchTo().alert().accept();

		js.executeScript("window.scrollBy(0,350)", "");

		Select nationality = new Select(driver.findElement(By.id("nationality")));
		nationality.selectByValue("Indian");

		driver.findElement(By.id("recordClientPhone")).sendKeys("9080706050");
		driver.findElement(By.id("recordClientPhone2")).sendKeys("9080706050");

		driver.findElement(By.id("recordClientEmail")).sendKeys("testupprb@yopmail.com");
		driver.findElement(By.id("recordClientEmail2")).sendKeys("testupprb@yopmail.com");

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

		driver.findElement(By.id("aadharNo")).sendKeys("987654321091");

		driver.findElement(By.id("aadharNo_opt")).sendKeys("987654321091");

		js.executeScript("window.scrollBy(0,350)", "");

		driver.findElement(By.id("personalMoal")).sendKeys("test marks");
		driver.findElement(By.id("personalMoal2")).sendKeys("test marks two");

		driver.findElement(By.xpath("(//input[@name='up_domiciled'])[1]")).click();
		js.executeScript("window.scrollBy(0,350)", "");

		Select category = new Select(driver.findElement(By.id("community")));
		category.selectByIndex(3);

		driver.switchTo().alert().accept();

		Select catauthority = new Select(driver.findElement(By.id("cat_issue_authority")));
		catauthority.selectByIndex(1);

		Select catdistrict = new Select(driver.findElement(By.id("cat_issue_district")));
		catdistrict.selectByIndex(1);

		driver.findElement(By.id("cat_cert_no")).sendKeys("321312321");
		driver.findElement(By.id("recordClientCatDateIssue")).click();

		Select calenmon = new Select(driver.findElement(By.xpath("(//select[@title='Change the month'])[1]")));
		calenmon.selectByIndex(0);

		Thread.sleep(2000);

		Select calenyear = new Select(driver.findElement(By.cssSelector("select[title='Change the year']")));
		calenyear.selectByVisibleText("2020");

		driver.findElement(By.xpath("(//tbody)[25]/tr/td[4]/a[contains(text(),'1')]")).click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// upload docs page

		String jpgfile = "C:\\Users\\TTIPL\\Downloads\\Sample-jpg-image-100kb.jpg";
		String pdffile = "C:\\Users\\TTIPL\\Downloads\\report.pdf";
		WebElement photo = driver.findElement(By.id("photosrc"));
		WebElement signature = driver.findElement(By.id("sigsrc"));
		WebElement ssc = driver.findElement(By.id("matricsrc"));
		WebElement plustwo = driver.findElement(By.id("plus2src"));
		WebElement graduation = driver.findElement(By.id("gradsrc"));
		WebElement identitydoc = driver.findElement(By.id("identitysrc"));
		WebElement domicile = driver.findElement(By.id("domicilesrc"));
		WebElement categorydoc = driver.findElement(By.id("categorysrc"));
		WebElement ff = driver.findElement(By.id("ffwsrc"));
		WebElement exservice = driver.findElement(By.id("exmansrc"));
		WebElement upgovt = driver.findElement(By.id("upgovtsrc"));
		WebElement olevel = driver.findElement(By.id("olevelsrc"));
		WebElement tarmy = driver.findElement(By.id("tarmysrc"));
		WebElement ncc = driver.findElement(By.id("nccsrc"));

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

		js.executeScript("arguments[0].scrollIntoView();", domicile);
		domicile.sendKeys(pdffile);

		js.executeScript("arguments[0].scrollIntoView();", category);
		categorydoc.sendKeys(pdffile);

		js.executeScript("arguments[0].scrollIntoView();", ff);
		ff.sendKeys(pdffile);

		js.executeScript("arguments[0].scrollIntoView();", exservice);
		exservice.sendKeys(pdffile);

		js.executeScript("arguments[0].scrollIntoView();", upgovt);
		upgovt.sendKeys(pdffile);

		js.executeScript("arguments[0].scrollIntoView();", olevel);
		olevel.sendKeys(pdffile);

		js.executeScript("arguments[0].scrollIntoView();", tarmy);
		tarmy.sendKeys(pdffile);

		js.executeScript("arguments[0].scrollIntoView();", ncc);
		ncc.sendKeys(pdffile);

		driver.findElement(By.id("agree_save1")).click();
		driver.findElement(By.id("agree_save")).click();
		driver.findElement(By.id("agree_save2")).click();
		driver.findElement(By.id("agree_save3")).click();
		driver.findElement(By.id("agree_save4")).click();
		driver.findElement(By.id("agree_save5")).click();
		driver.findElement(By.id("agree_save6")).click();
		driver.findElement(By.id("agree_save7")).click();
		driver.findElement(By.id("agree_save8")).click();
	}
}
