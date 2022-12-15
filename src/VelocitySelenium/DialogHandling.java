package VelocitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DialogHandling {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/dialog/");
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
	//	WebElement dialog=driver.findElement(By.xpath("//div[@role='dialog']"));
		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-ne']"));
		WebElement button=driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']"));
		Actions a=new Actions(driver);
		a.moveToElement(resize).dragAndDropBy(resize, 100, 0).build().perform();
		Thread.sleep(1000);
		button.click();
		
		

	}

}
