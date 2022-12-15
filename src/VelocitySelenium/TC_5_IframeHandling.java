package VelocitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_5_IframeHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top");
		//driver.switchTo().frame("frameset-middle");
		driver.switchTo().frame("frame-left");
		String s=driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		System.out.println(s);

	
		
		
	}

}
