package Velocity_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting
{
	WebDriver driver;
	@Test
	@Parameters("browserName")
	public void testBrowser(String name) 
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
	
	@Test
	@Parameters({"username","password"})
	public void login(String unme,String pwd)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys(unme);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	
/*	@Test
	@Parameters("browserName")
	public void test1(String name) 
	{
		
		if(name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://google.com");}
	}
	

	@Test
	@Parameters("browserName")
	public void test2(String name) 
	{
		
		if(name.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://google.com");}
	}
	*/
	
	
}
