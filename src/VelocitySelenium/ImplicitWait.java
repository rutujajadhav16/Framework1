package VelocitySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		String s=driver.findElement(By.xpath("//h2[text()='Up to 60% off | Styles for Men']")).getText();
		System.out.println(s);
	}

}
