package BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTestifinish {
	protected WebDriver driver;		
	private Properties properties = new Properties();
	static ExtentReports extent;
	
	protected String[] userDetails;
	public BaseTestifinish() throws FileNotFoundException, IOException {
		// TODO Auto-generated constructor stub
		this.userDetails=exceldata();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		// Load properties file

		FileInputStream input = new FileInputStream(
				"C:\\Users\\TTIPL\\eclipse-workspace\\ifinish\\src\\main\\resources\\config.properties");
		properties.load(input);

		

		String browser = properties.getProperty("browser");
		String username= properties.getProperty("username");// If we want to Fetch username
		String password= properties.getProperty("password");// If we want to Fetch password

		//  We can also use switch case inplace of if,else if

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			

		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();

		} else {
			throw new IllegalArgumentException("Browser not supported: " + browser);
		}

	}

	public String[] exceldata() throws FileNotFoundException, IOException {
		String excelFilePath = "C:\\Users\\TTIPL\\Downloads\\DataDrivenifinish.xlsx";

		FileInputStream fis = new FileInputStream(excelFilePath);
		try (XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
			XSSFSheet sheet = workbook.getSheetAt(0);
			Row row = sheet.getRow(1);

			//DataFormatter formatter = new DataFormatter();
			String[] userDetails = new String[row.getPhysicalNumberOfCells()];
			for (int i = 0; i < userDetails.length; i++) {
				//Cell cell = row.getCell(i);
				//userDetails[i] = formatter.formatCellValue(cell); // handles all types safely
				userDetails[i] = row.getCell(i).getStringCellValue();
				//System.out.println(userDetails[i]);
			}
			return userDetails;

		}
	}
	public void reusablemethods() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://user2staging.ifinish.co.in/");
		Thread.sleep(2000);
	}

	public void eventselectionreusable() throws InterruptedException 
	{
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".text-primary.mb-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userDetails[0]);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(userDetails[2]);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		WebElement event = driver.findElement(By.cssSelector(
				"body > div:nth-child(2) > div:nth-child(5) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(1000);
		event.click();
		String eventtext = driver.findElement(By.cssSelector(".mb-0.fw-bold.fs-32.font-saira")).getText();
		Assert.assertEquals(eventtext, "SKF GOA RIVER MARATHON 2023");
	}

	public void marathonselectionreusable() throws InterruptedException {
		driver.findElement(By.xpath("(//div[contains(@class,'EventPriceCard_priceCard__O1xHB cursor-pointer')])[1]"));
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"(//button[contains(@class,'AddToCartButton_initialCartButton__-clPQ mb-2 fs-14 font-noto')][normalize-space()='add'])[1]"))
				.click();
	}

	public void editparticipantsreusbale() throws InterruptedException {
		Select countdropdown = new Select(
				driver.findElement(By.cssSelector(".form-select.AddToCartButton_qtySelect__ihXFD")));
		countdropdown.selectByVisibleText("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"(//button[@class='default-action-button d-none d-sm-block fw-bold text-white ms-4 btn btn-primary'])[1]"))
				.click();
		driver.findElement(By.cssSelector("button[class='default-action-button btn btn-outline-primary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='upload_id_proof'])[1]"))
				.sendKeys("C:/Users/TTIPL/Downloads/report.pdf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
	}

	public void addparticipantreusable() throws InterruptedException {
		Select countdropdown = new Select(
				driver.findElement(By.cssSelector(".form-select.AddToCartButton_qtySelect__ihXFD")));
		countdropdown.selectByVisibleText("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"(//button[@class='default-action-button d-none d-sm-block fw-bold text-white ms-4 btn btn-primary'])[1]"))
				.click();
		driver.findElement(By.cssSelector("button[class='default-action-button btn btn-outline-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)"))
				.click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userDetails[0]);
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("Male");
		driver.findElement(By.id("mobile_number")).sendKeys(userDetails[5]);
		driver.findElement(By.id("date_of_birth")).sendKeys(userDetails[6]);
		driver.findElement(By.id("first_name")).sendKeys(userDetails[7]);
		driver.findElement(By.id("last_name")).sendKeys(userDetails[8]);
		driver.findElement(By.id("area")).sendKeys(userDetails[9]);
		driver.findElement(By.id("street_address")).sendKeys(userDetails[10]);
		driver.findElement(By.id("pincode")).sendKeys(userDetails[11]);
		driver.findElement(By.id("nationality")).sendKeys(userDetails[12]);
		driver.findElement(By.id("country")).sendKeys(userDetails[13]);
		driver.findElement(By.id("state")).sendKeys(userDetails[14]);
		Select bloodgroup = new Select(driver.findElement(By.id("blood_group")));
		bloodgroup.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.id(
				"Are You Physically Challenged ? *"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.id(
				"History of Health Issues(If any) *"))
				.click();
		Thread.sleep(1000);
		Select tshirtsize = new Select(driver.findElement(By.id("tshirt_size")));
		tshirtsize.selectByIndex(1);
		driver.findElement(By.xpath("(//input[@id='upload_id_proof'])[1]"))
				.sendKeys("C:/Users/TTIPL/Downloads/Reg.pdf");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save Details']")).click();
	}
		
	
	
	public String getscreenshot(String TestCaseName, WebDriver driver) throws IOException {
	    if (driver == null) {
	        throw new IllegalArgumentException("WebDriver cannot be null");
	    }

	    // Capture the screenshot
	    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	    // Define a destination path to save the screenshot
	    String screenshotDir = "screenshots"; // You can change this to any valid directory
	    File dir = new File(screenshotDir);
	    if (!dir.exists()) {
	        dir.mkdirs(); // Create the directory if it does not exist
	    }

	    // Create the screenshot file with a unique name
	    String screenshotPath = screenshotDir + File.separator + TestCaseName + "_" + System.currentTimeMillis() + ".png";
	    File destFile = new File(screenshotPath);

	    // Copy the screenshot to the destination file
	    FileUtils.copyFile(srcFile, destFile);

	    return screenshotPath; // Return the file path of the saved screenshot
	}

	@AfterMethod
	public void teardown() 
	{
		if(driver != null) 
		{
			driver.quit();
		}
}
	
	 @BeforeTest
	    public static ExtentReports getExtentReportObject() {
	        // Define the report file path using File.separator for cross-platform compatibility
	        String reportPath = System.getProperty("user.dir") + File.separator + "reports" + File.separator + "index.html";
	        
	        // Create the report directory if it does not exist
	        File reportDir = new File(System.getProperty("user.dir") + File.separator + "reports");
	        if (!reportDir.exists()) {
	            reportDir.mkdirs(); // Create the directory if it doesn't exist
	        }

	        // Create an ExtentSparkReporter instance and set up the report configuration
	        ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
	        reporter.config().setDocumentTitle("Ifinish Automation Results"); // Title of the document
	        reporter.config().setReportName("Ifinish Test Cases Result");   // Name of the report
	        
	        // Initialize ExtentReports and attach the reporter
	        extent = new ExtentReports();
	        extent.attachReporter(reporter);
	        
	        // Set system information (optional)
	        extent.setSystemInfo("Tester", "Inthiyaz");
	        
	        // Return the ExtentReports object
	        return extent;
	    }
	}

	





