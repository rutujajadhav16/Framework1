package Seleniumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElements_method {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/demo");
		
		List<WebElement> links=driver.findElements(By.xpath("//*[@id=\"demo-page\"]/body/div[7]/footer/div[1]//a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		List<WebElement> link=driver.findElements(By.xpath("(//a[text()='Get started'])[3]"));
		System.out.println(link.size());

	}

}
