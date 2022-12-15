package Velocity_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsSample
{
	WebDriver driver;
	@BeforeTest
	public void initilizeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void LaunchApp ()
	{
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void LoginDetails() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void verifyMyInfo() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//span[text()='My Info']")).isDisplayed());
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
}
