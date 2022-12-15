package VelocitySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(10000));
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"))));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

	}

}
