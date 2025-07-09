package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practiceassessment 
{
	
	public static void main(String[] args) throws IOException
	{
		
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://0525-demo.apply-hssc.com/otr_hssc_newfinal/register_edit1.php#");

	}
}
		
		