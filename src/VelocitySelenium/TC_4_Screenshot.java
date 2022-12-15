package VelocitySelenium;

import java.io.File;
//import java.util.logging.FileHandler;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

import org.openqa.selenium.*;

public class TC_4_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("abc");
		//driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Jadhav");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abc@123");
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select day_select=new Select(day);
		day_select.selectByVisibleText("16");
		
		WebElement month=driver.findElement(By.id("month"));
		Select month_select=new Select(month);
		month_select.selectByValue("9");
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select year_select=new Select(year);
		year_select.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_2_2_')]")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		Thread.sleep(5000);
		
		String random=RandomString.make(3);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File file1=new File("E:\\Rutuja study\\Velocity\\Automation\\Screecnshot\\File1"+random+".png");
		FileHandler.copy(src, file1);
		
		System.out.println("Screenshot  taken");
	
		
	}

}
