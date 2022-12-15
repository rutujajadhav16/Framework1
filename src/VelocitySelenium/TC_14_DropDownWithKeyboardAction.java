package VelocitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_14_DropDownWithKeyboardAction {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement speed=driver.findElement(By.xpath("//select[@id='speed']"));
		Actions a=new Actions(driver);
		a.moveToElement(speed).click().build().perform();
		
		for(int i=0;i<5;i++) 
		{
			a.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		}
		
		
		
	}

}
