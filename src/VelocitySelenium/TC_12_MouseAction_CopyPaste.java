package VelocitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.hotkey.Keys;
import org.sikuli.script.Key;

public class TC_12_MouseAction_CopyPaste {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
		driver.switchTo().frame(frame);
		
		WebElement fname=driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
		//fname.sendKeys("Rutuja");
		WebElement lname=driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']"));
		WebElement phone=driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']"));
		WebElement country=driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(fname).click().sendKeys("Rutuja").build().perform();
		Thread.sleep(1000);
		a.keyDown(fname,org.openqa.selenium.Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	//	a.sendKeys("c").build().perform();
		
		Thread.sleep(1000);
		a.moveToElement(lname).click().build().perform();
		a.keyDown(lname, org.openqa.selenium.Keys.CONTROL).sendKeys("v").build().perform();
		Thread.sleep(1000);
		a.keyDown(lname,org.openqa.selenium.Keys.CONTROL).sendKeys("a").build().perform();
		a.keyDown(lname,org.openqa.selenium.Keys.CONTROL).sendKeys("x").build().perform();
		a.click().perform();
		
		Thread.sleep(1000);
		a.moveToElement(phone).click().build().perform();
		a.keyDown(phone, org.openqa.selenium.Keys.CONTROL).sendKeys("v").build().perform();
		//driver.switchTo().defaultContent();
		
	
		
		
		
		

	}

}
