package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import TestComponents.BaseTestRRCScouts;

public class RRC_Scouts extends BaseTestRRCScouts {
	@Test
	public void rrcscoutmethod() throws FileNotFoundException, IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://iroams.com/rrc_scr_scout2024/index.php");
		driver.findElement(By.cssSelector(".btn.registerBtn1")).click();

		String excelFilePath = "C:\\Users\\TTIPL\\Documents\\DataDrivenRRCScouts.xlsx";
		try (FileInputStream fis = new FileInputStream(excelFilePath); Workbook workbook = new XSSFWorkbook(fis)) {

			Iterable<Row> sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				if (row.getRowNum() == 0)
					continue; // Skip header row

				String[] cellValues = new String[30];
				for (int i = 0; i < cellValues.length; i++) {
					cellValues[i] = row.getCell(i).getStringCellValue();
				}

				driver.findElement(
						By.xpath("//input[@placeholder='Name must be entered same as in matric certificate']"))
						.sendKeys(cellValues[0]);
				driver.findElement(By.xpath("//input[@name='fathername']")).sendKeys(cellValues[1]);
				driver.findElement(By.xpath("//input[@name='mname']")).sendKeys(cellValues[2]);
				driver.findElement(By.xpath("//input[@name='identity_marks']")).sendKeys(cellValues[3]);
				driver.findElement(By.cssSelector("input[name='identity_marks2']")).sendKeys(cellValues[4]);
				driver.findElement(By.cssSelector("textarea[title='Please fill in proper address'][name='address']"))
						.sendKeys(cellValues[5]);
				Select state = new Select(driver.findElement(By.id("state")));
				state.selectByIndex(2);
				Thread.sleep(1000);
				Select district = new Select(driver.findElement(By.id("statebox")));
				district.selectByIndex(2);
				driver.findElement(By.id("po")).sendKeys(cellValues[6]);
				driver.findElement(By.id("ps")).sendKeys(cellValues[7]);
				driver.findElement(By.id("landmark")).sendKeys(cellValues[8]);
				driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys(cellValues[9]);
				driver.findElement(By.id("inlineRadio1")).click();
				
				//Level Of Post
				Select level = new Select(driver.findElement(By.id("cultural_discipline")));
				level.selectByIndex(1);
				
				driver.findElement(By.cssSelector("input[placeholder='Please enter 10 digit mobile number']"))
						.sendKeys(cellValues[10]);
				driver.findElement(By.cssSelector("input[placeholder='Please Enter Aadhaar Card Number']"))
						.sendKeys(cellValues[11]);
				driver.findElement(By.id("valid_email")).sendKeys(cellValues[12]);
				driver.findElement(By.id("datepicker")).sendKeys(cellValues[13]);
				
				//Gender
				driver.findElement(By.cssSelector("input[value='Male']")).click();
				
				
				//Marital Status
				driver.findElement(By.cssSelector("input[value='0'][name='marital']")).click();
				
				//Community
				Select community = new Select(driver.findElement(By.id("community")));
				community.selectByIndex(1);
				//EBC
				driver.findElement(By.cssSelector("input[value='0'][name='ebc_status']")).click();
				//PWD
				driver.findElement(By.cssSelector("input[value='0'][name='minority_status']")).click();
				//PWD
				driver.findElement(By.cssSelector("input[value='0'][name='pwd_status']")).click();
				//EXSERVICEMAN
				driver.findElement(By.cssSelector("input[value='0'][name='exserv_status']")).click();
				
				driver.findElement(By.cssSelector("input[value='0'][name='is_railway_employee']")).click();
				driver.findElement(By.cssSelector("input[value='0'][name='is_domicile']")).click();
				driver.findElement(By.cssSelector("input[value='0'][name='is_apprentice_iti']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='is_apprentice']")).click();
				driver.findElement(By.cssSelector("input[value='0'][name='is_quasi_staff']")).click();
				driver.findElement(By.id("near_rail")).sendKeys(cellValues[14]);
				Select examlang = new Select(driver.findElement(By.id("exma_lag")));
				examlang.selectByIndex(1);
				Select doccategory = new Select(driver.findElement(By.id("cer_doc")));
				doccategory.selectByIndex(1);
				Select qualification = new Select(driver.findElement(By.cssSelector("select[name='edu_qual']")));
				qualification.selectByIndex(1);
				Thread.sleep(1000);
				driver.findElement(By.id("ssc_board")).sendKeys(cellValues[15]);
				Select yop = new Select(driver.findElement(By.id("ssc_year")));
				yop.selectByIndex(1);
				Select marks = new Select(driver.findElement(By.id("ssc_grade")));
				marks.selectByIndex(1);
				driver.findElement(By.id("ob_marks")).sendKeys(cellValues[16]);
				driver.findElement(By.id("tot_marks")).sendKeys(cellValues[17]);

//				driver.findElement(By.id("iti_board")).sendKeys(cellValues[k++]);
//				Select yop2 = new Select(driver.findElement(By.id("iti_year")));
//				yop2.selectByIndex(1);
//				driver.findElement(By.id("iti_percent")).sendKeys(cellValues[k++]);

				// HWB

				driver.findElement(By.id("cul_ins")).sendKeys(cellValues[18]);
				Select year = new Select(driver.findElement(By.id("cul_year")));
				year.selectByIndex(1);

				driver.findElement(By.id("cul_recon")).sendKeys(cellValues[19]);
				driver.findElement(By.id("awards")).sendKeys(cellValues[20]);
				driver.findElement(By.id("awards_year")).sendKeys(cellValues[21]);
				driver.findElement(By.xpath("(//input[contains(@placeholder,'Certificate No')])[2]"))
						.sendKeys(cellValues[22]);
				driver.findElement(By.xpath("(//input[contains(@placeholder,'Warrant No')])[1]"))
						.sendKeys(cellValues[23]);
				driver.findElement(By.xpath("(//input[contains(@name,'awards_date[]')])[1]")).sendKeys(cellValues[24]);
				driver.findElement(By.cssSelector("input[placeholder='Please enter Bank name ']"))
						.sendKeys(cellValues[25]);
				driver.findElement(By.xpath("//input[@placeholder='Please enter Account name ']"))
						.sendKeys(cellValues[26]);
				driver.findElement(By.id("aacountd")).sendKeys(cellValues[27]);
				driver.findElement(By.id("reaccnodd")).sendKeys(cellValues[28]);
				driver.findElement(By.xpath("//input[@placeholder='Please enter Your IFSC Code ']"))
						.sendKeys(cellValues[29]);
				driver.findElement(By.cssSelector(".submit-btn")).click();
//				driver.findElement(By.xpath("(//button[normalize-space()='OK'])[1]")).click();

//				//upload documents
//				
//				driver.findElement(By.id("photosrc")).sendKeys("C:\\Users\\TTIPL\\Downloads\\jpeg-optimizer_69kb.jpg");
//				driver.findElement(By.id("signature")).sendKeys("C:\\\\Users\\\\TTIPL\\\\Downloads\\\\jpeg-optimizer_69kb.jpg");
//				driver.findElement(By.id("educqua")).sendKeys("C:\\Users\\TTIPL\\Downloads\\Reg.pdf");
//				driver.findElement(By.id("culture_achev")).sendKeys("C:\\\\Users\\\\TTIPL\\\\Downloads\\\\Reg.pdf");
//				driver.findElement(By.xpath("//input[@name='check']")).click();
//				driver.findElement(By.cssSelector(".submit-btn")).click();

			}

		}
	}
}
