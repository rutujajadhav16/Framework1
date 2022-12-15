package VelocitySelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_6_FindElements {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\google.com");
		
		List <WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (WebElement webElement : links)
		{
			System.out.println(webElement.getText());
		}
	}

}
