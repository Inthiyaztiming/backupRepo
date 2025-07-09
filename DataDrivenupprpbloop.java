package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class DataDrivenupprpbloop extends BaseTestUPPRPB

{
	@Test
	public void upprpbmethod() throws InterruptedException, FileNotFoundException, IOException {

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
		String excelFilePath = "C:\\Users\\TTIPL\\Documents\\test.xlsx";
		try (FileInputStream fis = new FileInputStream(excelFilePath); 
		     Workbook workbook = new XSSFWorkbook(fis)) {

			Iterable<Row> sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				if (row.getRowNum() == 0)
					continue; // Skip header row

				String[] cellValues = new String[25];
				for (int i = 0; i < cellValues.length; i++) {
					cellValues[i] = row.getCell(i).getStringCellValue();
				}

				driver.findElement(By.id("firstName")).sendKeys(cellValues[0]);
				driver.findElement(By.id("fathername")).sendKeys(cellValues[1]);
				driver.findElement(By.id("mothername")).sendKeys(cellValues[2]);
				driver.findElement(By.id("recordClientDob")).sendKeys(cellValues[3]);
				driver.findElement(By.cssSelector(".datepick-cmd.datepick-cmd-close ")).click();
				driver.findElement(By.id("sexid")).click();
				driver.switchTo().alert().accept();
				js.executeScript("window.scrollBy(0,350)", "");

				Select nationality = new Select(driver.findElement(By.id("nationality")));
				nationality.selectByValue("Indian");

				// Mob no
				driver.findElement(By.id("recordClientPhone")).sendKeys(cellValues[4]);
				driver.findElement(By.id("recordClientPhone2")).sendKeys(cellValues[4]);

				// Email
				driver.findElement(By.id("recordClientEmail")).sendKeys(cellValues[5]);
				driver.findElement(By.id("recordClientEmail2")).sendKeys(cellValues[5]);
				js.executeScript("window.scrollBy(0,350)", "");

				driver.findElement(By.id("address_line1")).sendKeys(cellValues[6]);
				driver.findElement(By.id("address_line2")).sendKeys(cellValues[7]);

				driver.findElement(By.id("village")).sendKeys(cellValues[8]);
				driver.findElement(By.id("postoffice")).sendKeys(cellValues[9]);
				driver.findElement(By.id("policestation")).sendKeys(cellValues[10]);
				Select state = new Select(driver.findElement(By.id("state")));
				state.selectByIndex(2);
				Thread.sleep(1000);

				Select district = new Select(driver.findElement(By.id("district")));
				district.selectByIndex(2);
				driver.findElement(By.id("recordZipcode")).sendKeys(cellValues[11]);

				driver.findElement(By.id("correspondence_address")).click();

				Select identity = new Select(driver.findElement(By.id("identity_type")));
				identity.selectByIndex(1);

				// identification
				driver.findElement(By.id("aadharNo")).sendKeys(cellValues[12]);

				driver.findElement(By.id("aadharNo_opt")).sendKeys(cellValues[12]);

				js.executeScript("window.scrollBy(0,350)", "");

				driver.findElement(By.id("personalMoal")).sendKeys(cellValues[13]);

				driver.findElement(By.id("personalMoal2")).sendKeys(cellValues[14]);

				driver.findElement(By.xpath("(//input[@name='up_domiciled'])[2]")).click();
				driver.findElement(By.xpath("(//input[@name='employee_ssb'])[2]")).click();
				js.executeScript("window.scrollBy(0,350)", "");

				driver.findElement(By.id("firstDivNext")).click();

				// Education page

				driver.findElement(By.id("university_1")).sendKeys(cellValues[15]);

				driver.findElement(By.xpath("(//input[@name='edu_rollno_1'])[1]")).sendKeys(cellValues[16]);

				driver.findElement(By.xpath("(//input[@name='edu_certno_1'])[1]")).sendKeys(cellValues[17]);

				Select month = new Select(driver.findElement(By.id("month")));
				month.selectByIndex(2);
				Select year = new Select(driver.findElement(By.id("year")));
				year.selectByValue("2019");

				driver.findElement(By.id("university_plus2")).sendKeys(cellValues[18]);

				driver.findElement(By.xpath("(//input[@name='edu_rollno_plus2'])[1]")).sendKeys(cellValues[19]);

				driver.findElement(By.xpath("(//input[@name='edu_certno_plus2'])[1]")).sendKeys(cellValues[20]);

				Select month12 = new Select(driver.findElement(By.xpath("(//select[@id='month'])[2]")));
				month12.selectByIndex(2);

				Select year12 = new Select(driver.findElement(By.xpath("(//select[@id='year'])[2]")));
				year12.selectByValue("2021");

				Select grad = new Select(driver.findElement(By.id("graduation_type")));
				grad.selectByIndex(3);

				driver.findElement(By.id("university_3")).sendKeys(cellValues[21]);

				driver.findElement(By.xpath("(//input[@name='edu_rollno_3'])[1]")).sendKeys(cellValues[22]);

				driver.findElement(By.xpath("(//input[@name='edu_certno_3'])[1]")).sendKeys(cellValues[23]);

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
				driver.findElement(By.xpath("(//input[@name='answer'])[1]")).sendKeys(cellValues[24]);
				Proceedbutton.click();
				for (int i = 0; i < 2; i++) {
					driver.switchTo().alert().accept();

				}

				Thread.sleep(3000);
				driver.findElement(By.cssSelector(".nextbutton")).click();

				Thread.sleep(3000);

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
