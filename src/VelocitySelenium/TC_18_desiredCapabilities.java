package VelocitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_18_desiredCapabilities
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		option.addArguments("start-maximized");
		option.addArguments("disable-infobars");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.justdial.com/");
		
		
	}
}
