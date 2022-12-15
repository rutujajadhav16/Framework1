package VelocitySelenium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TC_17_DesiredCapabilities {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
	//	DesiredCapabilities caps=new DesiredCapabilities();
	//	caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions options=new ChromeOptions();
		//options.merge(caps);
		options.addArguments("start-maximized");
		options.addArguments("--ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.selenium.dev/");

		
		
		
		
	}

}
