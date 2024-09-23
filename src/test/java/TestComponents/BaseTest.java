package TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected static WebDriver driver;
	private Properties properties = new Properties();

	@BeforeMethod
	public void setUp() throws IOException {
		// Load properties file

		FileInputStream input = new FileInputStream(
				"C:\\Users\\TTIPL\\eclipse-workspace\\NPA\\src\\main\\resources\\config.properties");
		properties.load(input);

		// Get browser value from properties file

		String browser = properties.getProperty("browser").toLowerCase();

		// Initialize WebDriver based on the browser value

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
}