package Velocity_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo
{
	WebDriver driver;
	
	@BeforeClass
	public void openURL() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public  void login()
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority = 1)
	public void myTest() throws InterruptedException 
	{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
	  
	}
	@AfterMethod
	public void cancel() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
	}
	
	
	@BeforeMethod
	public void myInfo() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
	}
	@Test(priority = 2)
	public void validateInfo() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	}
	@AfterMethod
	public void info() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Cancel ']")).click();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{Thread.sleep(2000);
	driver.close();
	}
}
