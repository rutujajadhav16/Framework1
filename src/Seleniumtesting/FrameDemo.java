package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement we=driver.findElement(By.xpath("//*[@id=\"frame-one1434677811\"]"));
		
		driver.switchTo().frame(we);
		
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("sam");
		
		
		
	}

}
