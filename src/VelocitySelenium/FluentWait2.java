package VelocitySelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait2 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(3000)).pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class);
		WebElement text=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[text()='Up to 60% off | Styles for Men']"))));
		System.out.println(text.getText());
	}
		

	

}
