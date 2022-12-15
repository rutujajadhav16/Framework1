package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.GeckoDriverInfo;
//import org.openqa.selenium.firefox.GeckoDriverService;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open chrome browser
		
//		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32(1)//chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:/Users/admin/Desktop/IEDriverServer_Win32_4.2.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver(); //ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		
		
		WebElement ud=driver.findElement(By.id("txtUsername"));
		ud.sendKeys("Admin");
		
		WebElement ud1=driver.findElement(By.name("txtPassword"));
		ud1.sendKeys("admin123");
		
		WebElement ud2=driver.findElement(By.name("Submit"));
		ud.click();
		
		String s=driver.getTitle();
		String exp_title="OrangeHRM";
		
		if(s.equals(exp_title)) {
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();

	}

}
