package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AnotherDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement we= driver.findElement(By.xpath("/html/body/div"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.doubleClick(we).build().perform();
		Thread.sleep(3000);
		act.doubleClick(we).build().perform();
		
	}

}
