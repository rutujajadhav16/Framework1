package VelocitySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1_TitleandURL {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C://Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String actual_title="Amazon.com. Spend less. Smile more.";
		driver.get("https://amazon.com");
		driver.manage().window().minimize();
	/*	String expected_title=driver.getTitle();
		
		if(actual_title.equals(expected_title))
		{
			System.out.println("TC_1 passed");
		}
		else
		{
			System.out.println("TC_1 failed");
		}
		
		String actual_URL="https://amazon.com";
		
		String expeced_URL=driver.getCurrentUrl();
		
		if(actual_URL.equals(expeced_URL))
		{
			System.out.println("TC_1 passed");
		}
		else
		{
			System.out.println("TC_1 failed");
		}
*/
	}

}
