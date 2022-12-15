package VelocitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_9_MouseAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement button=driver.findElement(By.xpath("//button[text()='Click Me']"));
		WebElement double_click=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions a=new Actions(driver);
		a.moveToElement(double_click).doubleClick().build().perform();
	//	a.doubleClick(double_click).perform();
		Thread.sleep(1000);
		a.moveToElement(button).click().build().perform();
		//a.click(button).perform();
		
	}

}
