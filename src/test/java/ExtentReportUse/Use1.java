package ExtentReportUse;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Use1 
{

	public static void main(String[] args) 
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter sparkreporter= new ExtentSparkReporter("E:\\Rutuja study\\Velocity\\Automation\\Files\\report1.html");
		extent.attachReporter(sparkreporter);
		
		
		ExtentTest test1=extent.createTest("Test 1");
		test1.pass("Test1 passed");
		
		ExtentTest test2=extent.createTest("Test 2");
		test2.log(Status.FAIL,"This is failed");
		
		ExtentTest test3=extent.createTest("Test3");
		test3.skip("Test 3 skipped");
		extent.flush();
	
		System.out.println("Report Created");
	}
}
