package Velocity_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnableDisable
{
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void sendurl()
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	
	@Test
	public void login() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	
	/*@Test
	public void validate() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean text = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
		System.out.println(text);
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
	}
	*/
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
