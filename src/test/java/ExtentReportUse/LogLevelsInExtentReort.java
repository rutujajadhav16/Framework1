package ExtentReportUse;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogLevelsInExtentReort {

	public static void main(String[] args)
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter sparkreporter= new ExtentSparkReporter("E:\\Rutuja study\\Velocity\\Automation\\Files\\report2.html");
		extent.attachReporter(sparkreporter);
		
		
		ExtentTest test1=extent.createTest("Test 1")
								.log(Status.INFO,"Info1")
								.log(Status.INFO,"Info2")
								.log(Status.PASS,"Pass1")
								.log(Status.FAIL,"Fail")
								.log(Status.SKIP,"Skip1")
								.log(Status.WARNING,"warning");
		
		extent.flush();
								
		
		
		

	}

}
