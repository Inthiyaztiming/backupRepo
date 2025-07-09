package BaseTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseTestifinish implements ITestListener {
	public Listeners() throws FileNotFoundException, IOException {
		super();

	}

	ExtentTest test;
	ExtentReports extent = BaseTestifinish.getExtentReportObject();

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());

		String filepath = null;
		try {
			// Ensure driver is not null
			if (driver == null) {
				throw new IllegalStateException("WebDriver cannot be null during test failure");
			}

			// Capture screenshot and get the relative path
			filepath = getscreenshot(result.getMethod().getMethodName(), driver);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Only add screenshot if the file path is not null
		if (filepath != null) {
			// Make sure to use a relative path for the screenshot
			test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		} else {
			System.err.println("Screenshot capture failed, no screenshot added.");
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}