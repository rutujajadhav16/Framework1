package NeoStoxPom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends NeoStoxBase_New.Base  implements ITestListener 
{

	//WebDriver driver;
	public void onTestFailure(ITestResult result)
	{
		System.out.println("TC failed screenshot captued");
		try 
		{
			NeoStoxUtility.screenShot(driver, result.getName());
			System.out.println("TC failed screenshot captued");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
