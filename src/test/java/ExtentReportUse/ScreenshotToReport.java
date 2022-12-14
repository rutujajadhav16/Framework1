package ExtentReportUse;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ScreenshotToReport {

	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter sparkreporter= new ExtentSparkReporter("E:\\Rutuja study\\Velocity\\Automation\\Files\\report5.html");
		extent.attachReporter(sparkreporter);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		Thread.sleep(1000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Rutuja study\\Velocity\\Automation\\Screecnshot\\Google.jpg");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		String path=dest.getAbsolutePath();
		
		ExtentTest test1=extent.createTest("Screesnhot to Report","Attaching screenshot to test at test level")
			  .pass("Screenshot added")
			  .addScreenCaptureFromPath(path);
		
		ExtentTest test2=extent.createTest("Screesnhot to Report","Attaching screenshot to test at test level")
				  .pass("Screenshot added")
				  .addScreenCaptureFromPath(path,"Google Message")
				.addScreenCaptureFromPath(path,"Google Message 2");
		
		ExtentTest test3=extent.createTest("Screesnhot to Report","Attaching screenshot to test at test level")
				  .pass("Screenshot added")
				  .addScreenCaptureFromPath(path,"Google Message")
				.addScreenCaptureFromPath(path,"Google Message 2")
				.fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build())
				.pass(MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		extent.flush();


	}

}
