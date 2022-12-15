package VelocitySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_example {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(12000));
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")),true));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

	}

}
