package Velocity_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class optParam
{
	WebDriver driver;
  @Test
  @Parameters("browsername")
 public void optParameter(@Optional("chrome") String name)
  {
	  
		if(name.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(name.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
  }
  
  @Test
	@Parameters("url")
	public void sendURL(String u)
	{
		driver.manage().window().maximize();
		driver.get(u);
	}
}
