package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import TestComponents.BaseTestUPPRPB;

public class DataDrivenupprpb extends BaseTestUPPRPB

{
	@Test
	public void upprpbmethod() throws InterruptedException {

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

		// Read data from Excel
		String excelFilePath = "C:\\Users\\TTIPL\\Documents\\DataDrivenTesting.xlsx";
		try (FileInputStream fis = new FileInputStream(excelFilePath); 
			Workbook workbook = new XSSFWorkbook(fis)) {

			Iterable<Row> sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				if (row.getRowNum() == 0)
					continue; // Skip header row

				// Assuming columns correspond to input fields by their order
				String firstname = row.getCell(0).getStringCellValue();
				
				String fathername = row.getCell(1).getStringCellValue();
				String mothername = row.getCell(2).getStringCellValue();
				String dob = row.getCell(3).getStringCellValue();
				
				String mobno =row.getCell(4).getStringCellValue();
				
				String email = row.getCell(5).getStringCellValue();
				String address1 = row.getCell(6).getStringCellValue();
				String address2 = row.getCell(7).getStringCellValue();
				String village = row.getCell(8).getStringCellValue();
				String postoffice = row.getCell(9).getStringCellValue();
				String policestation = row.getCell(10).getStringCellValue();
				String zipcode = row.getCell(11).getStringCellValue();
				String aadhar = row.getCell(12).getStringCellValue();
				String mark1 = row.getCell(13).getStringCellValue();
				String mark2 = row.getCell(14).getStringCellValue();
				String boardtenth = row.getCell(15).getStringCellValue();
				String rolltenth = row.getCell(16).getStringCellValue();
				String certtenth = row.getCell(17).getStringCellValue();
				String board12 = row.getCell(18).getStringCellValue();
				String roll12 = row.getCell(19).getStringCellValue();
				String cert12 = row.getCell(20).getStringCellValue();
				String boardgrad = row.getCell(21).getStringCellValue();
				String rollgrad = row.getCell(22).getStringCellValue();
				String certgrad = row.getCell(23).getStringCellValue();
				String captcha = row.getCell(24).getStringCellValue();
				

//				String[] cellValues = new String[24];
//				for (int i = 0; i < cellValues.length; i++) {
//				    cellValues[i] = row.getCell(i).getStringCellValue();
//				}
				
				driver.findElement(By.id("firstName")).sendKeys(firstname);
				driver.findElement(By.id("fathername")).sendKeys(fathername);
				driver.findElement(By.id("mothername")).sendKeys(mothername);
				driver.findElement(By.id("recordClientDob")).sendKeys(dob);
				driver.findElement(By.cssSelector(".datepick-cmd.datepick-cmd-close ")).click();
				driver.findElement(By.id("sexid")).click();
				driver.switchTo().alert().accept();
				js.executeScript("window.scrollBy(0,350)", "");

				Select nationality = new Select(driver.findElement(By.id("nationality")));
				nationality.selectByValue("Indian");
				// Mob no

				driver.findElement(By.id("recordClientPhone")).sendKeys(mobno);
				driver.findElement(By.id("recordClientPhone2")).sendKeys(mobno);
				// Email

				driver.findElement(By.id("recordClientEmail")).sendKeys(email);
				driver.findElement(By.id("recordClientEmail2")).sendKeys(email);
				js.executeScript("window.scrollBy(0,350)", "");

				driver.findElement(By.id("address_line1")).sendKeys(address1);
				driver.findElement(By.id("address_line2")).sendKeys(address2);

				driver.findElement(By.id("village")).sendKeys(village);
				driver.findElement(By.id("postoffice")).sendKeys(postoffice);
				driver.findElement(By.id("policestation")).sendKeys(policestation);
				Select state = new Select(driver.findElement(By.id("state")));
				state.selectByIndex(2);
				Thread.sleep(3000);

				Select district = new Select(driver.findElement(By.id("district")));
				district.selectByIndex(2);
				driver.findElement(By.id("recordZipcode")).sendKeys(zipcode);

				driver.findElement(By.id("correspondence_address")).click();

				Select identity = new Select(driver.findElement(By.id("identity_type")));
				identity.selectByIndex(1);

				// identification
				driver.findElement(By.id("aadharNo")).sendKeys(aadhar);

				driver.findElement(By.id("aadharNo_opt")).sendKeys(aadhar);

				js.executeScript("window.scrollBy(0,350)", "");

				driver.findElement(By.id("personalMoal")).sendKeys(mark1);

				driver.findElement(By.id("personalMoal2")).sendKeys(mark2);

				driver.findElement(By.xpath("(//input[@name='up_domiciled'])[2]")).click();
				driver.findElement(By.xpath("(//input[@name='employee_ssb'])[2]")).click();
				js.executeScript("window.scrollBy(0,350)", "");

				driver.findElement(By.id("firstDivNext")).click();

				// Education page

				driver.findElement(By.id("university_1")).sendKeys(boardtenth);

				driver.findElement(By.xpath("(//input[@name='edu_rollno_1'])[1]")).sendKeys(rolltenth);

				driver.findElement(By.xpath("(//input[@name='edu_certno_1'])[1]")).sendKeys(certtenth);

				Select month = new Select(driver.findElement(By.id("month")));
				month.selectByIndex(2);
				Select year = new Select(driver.findElement(By.id("year")));
				year.selectByValue("2019");

				driver.findElement(By.id("university_plus2")).sendKeys(board12);

				driver.findElement(By.xpath("(//input[@name='edu_rollno_plus2'])[1]")).sendKeys(roll12);

				driver.findElement(By.xpath("(//input[@name='edu_certno_plus2'])[1]")).sendKeys(cert12);

				Select month12 = new Select(driver.findElement(By.xpath("(//select[@id='month'])[2]")));
				month12.selectByIndex(2);

				Select year12 = new Select(driver.findElement(By.xpath("(//select[@id='year'])[2]")));
				year12.selectByValue("2021");

				Select grad = new Select(driver.findElement(By.id("graduation_type")));
				grad.selectByIndex(3);

				driver.findElement(By.id("university_3")).sendKeys(boardgrad);

				driver.findElement(By.xpath("(//input[@name='edu_rollno_3'])[1]")).sendKeys(rollgrad);

				driver.findElement(By.xpath("(//input[@name='edu_certno_3'])[1]")).sendKeys(certgrad);

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
				driver.findElement(By.xpath("(//input[@name='answer'])[1]")).sendKeys(captcha);
				Proceedbutton.click();
				for (int i = 0; i < 2; i++) {
					driver.switchTo().alert().accept();

				}

				Thread.sleep(3000);
				driver.findElement(By.cssSelector(".nextbutton")).click();

				Thread.sleep(3000);

//				Set<String> windowhandles = driver.getWindowHandles();
//				Iterator<String> it = windowhandles.iterator();
//				String parentwindow = it.next();
//				String childwindow = it.next();
//				driver.switchTo().window(childwindow);
				
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

				WebElement proceed = driver.findElement(By.cssSelector(".open3"));
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
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}