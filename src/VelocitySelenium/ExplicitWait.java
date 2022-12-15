package VelocitySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
		element.click();

	}

}
