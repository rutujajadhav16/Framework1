package VelocitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeysUsingJavascriptexecutor {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		WebElement fname=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		WebElement searchButton=driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='rutuja'", fname);
		js.executeScript("arguments[0].click()", searchButton);
			
	}

}
