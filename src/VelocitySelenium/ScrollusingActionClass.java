package VelocitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollusingActionClass {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		//WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
		//driver.switchTo().frame(frame1);
       
		Actions a=new Actions(driver);
	   // WebElement email=driver.findElement(By.xpath("//input[@name='RESULT_TextField-6']"));
		WebElement button=driver.findElement(By.xpath("//button[text()='Click Me']"));
		a.scrollToElement(button).perform();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",button);
	}

}
