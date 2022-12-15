package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement we=driver.findElement(By.xpath("/html/body/p[1]/a"));
		String s=we.getAttribute("title");
		System.out.println(s);
		
		if(s.equals("That's what this widget is"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}

	}

}
