package NeoStoxBase_New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {

	public static WebDriver driver;
	public void setBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Reporter.log("Entering url",true);
		Reporter.log("Git installed",true);
		
		
		Reporter.log("Code added to git",true);
		Thread.sleep(1000);

	}

}
