package Seleniumtesting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		 
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		
		act.sendKeys(Keys.CONTROL+"A").build().perform();
		System.out.println("Ctrl+a done");

	}

}
