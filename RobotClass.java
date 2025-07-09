package Tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotClass 
{
	

	@Test
	public void practicemethod() throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://gdce.iroams.com/gdce_2024/acknowledge-php-reqzwtys?registerId=20007529");
		 
		 
		 Thread.sleep(1000);
		 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//	     js.executeScript("window.print();");
//		 
	     Thread.sleep(1000);
	       // Create a Robot instance
         Robot robot = new Robot();
         robot.setAutoDelay(1000);  // Add a delay to simulate human interaction

         // Press Ctrl+P (to open print dialog)
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_P);
         robot.keyRelease(KeyEvent.VK_P);
         robot.keyRelease(KeyEvent.VK_CONTROL);

         // Wait for print dialog to open
         Thread.sleep(2000);

         // Use TAB and ENTER to select "Save as PDF"
         robot.keyPress(KeyEvent.VK_TAB); // Move focus
         robot.keyRelease(KeyEvent.VK_TAB);
         robot.keyPress(KeyEvent.VK_TAB); // Move focus to printer options
         robot.keyRelease(KeyEvent.VK_TAB);
         robot.keyPress(KeyEvent.VK_TAB); // Move focus to printer options
         robot.keyRelease(KeyEvent.VK_TAB);
         robot.keyPress(KeyEvent.VK_TAB); // Move focus to printer options
         robot.keyRelease(KeyEvent.VK_TAB);
         robot.keyPress(KeyEvent.VK_TAB); // Move focus to printer options
         robot.keyRelease(KeyEvent.VK_TAB);
         robot.keyPress(KeyEvent.VK_DOWN); // Select Save as PDF
         robot.keyRelease(KeyEvent.VK_DOWN);

         // Press TAB and ENTER to confirm
         robot.keyPress(KeyEvent.VK_TAB);  // Move to Save button
         robot.keyRelease(KeyEvent.VK_TAB);	
         robot.keyPress(KeyEvent.VK_TAB);  // Move to Save button
         robot.keyRelease(KeyEvent.VK_TAB);	
         robot.keyPress(KeyEvent.VK_TAB);  // Move to Save button
         robot.keyRelease(KeyEvent.VK_TAB);	
         robot.keyPress(KeyEvent.VK_ENTER);  // Save as PDF
         robot.keyRelease(KeyEvent.VK_ENTER);

}


}




