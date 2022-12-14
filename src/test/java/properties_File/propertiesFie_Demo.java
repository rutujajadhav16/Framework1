package properties_File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertiesFie_Demo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		readConfigFile p=new readConfigFile();
		driver.get(p.getURL());
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(p.getUsername());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(p.getPassword());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}

}
