package base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import datahandler.ReadfromExcel;

public  class Confbase {

	 public WebDriver driver; 
	 protected ExtentReports extent;
	 protected ExtentTest test;
	ReadfromExcel Read = new ReadfromExcel();

	
	@BeforeSuite
	public  void start() throws InterruptedException
    {
		 driver = new FirefoxDriver();
		 driver.get("https://www.google.com");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 extent = new ExtentReports("D:\\workspace\\Machintes\\Machintest.html");
}
	
	@BeforeMethod
	public void beforemethod(Method method)
	{
		test = extent.startTest(method.getName());
		test.log(LogStatus.INFO,"Executing test case  --   "+method.getName() );
		
	}
	
	
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException, InterruptedException {
		if (result.getStatus() == ITestResult.FAILURE) {
			// Call method to capture screenshot
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			String path ="D:\\workspace\\Machintes\\Screenshot\\";
			FileUtils.copyFile(source, new File(path+result.getName()+".png"));
			String image= test.addScreenCapture(path+result.getName()+".png");
			test.log(LogStatus.FAIL, "ScreenShot", image);
			test.log(LogStatus.FAIL, "Exception Details \n"+result.getThrowable());
			
		}

		
		extent.endTest(test);        
        extent.flush();
		
	}
	
	@AfterSuite
	public  void end()
    {
		// report.flush();
		 driver.close();
}
	
	
}
