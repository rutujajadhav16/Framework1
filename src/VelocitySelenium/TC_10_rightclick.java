package VelocitySelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_10_rightclick {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a=new Actions(driver);
		a.contextClick(right_click).perform();
		
		List<WebElement> lst=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li"));
		for(WebElement e:lst)
		{
			if(e.getText().equals("Edit"))
			{
				e.click();
				break;
			}
		}
	}

}
