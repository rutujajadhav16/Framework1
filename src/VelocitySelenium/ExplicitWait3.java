package VelocitySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(5000));
		/*Boolean s = w.until(ExpectedConditions.elementSelectionStateToBe(driver.findElement(By.xpath("//h2[text()='Up to 60% off | Styles for Men']")), true));
		String s1=driver.findElement(By.xpath("\"//h2[text()='Up to 60% off | Styles for Men']\"")).getText();
		System.out.println(s);
		System.out.println(s1);*/
		WebElement text=w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[text()='Up to 60% off | Styles for Men']"))));
		System.out.println(text.getText());
	}

}
