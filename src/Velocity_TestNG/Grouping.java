package Velocity_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grouping 
{
	WebDriver driver;
  @Test(groups= {"smoke","sanity"}, priority = 1)
  public void launchBrowser() 
  {
	 
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://google.com");
  }
  
  @Test(groups="sanity", priority=2)
  public void sendText() throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  
  }
  
  @Test(groups= {"smoke"}, priority = 3)
  public void closeBrowser()
  {
	  driver.close();
  }
}
