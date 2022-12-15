package VelocitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2_WebElementMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	//	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//driver.findElement(By.xpath("//a[@class='_8esh']")).click();

	}

}
