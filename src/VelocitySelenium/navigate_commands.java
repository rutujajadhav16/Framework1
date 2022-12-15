package VelocitySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_commands {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.snapdeal.com/login");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
