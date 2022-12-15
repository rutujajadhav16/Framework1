package VelocitySelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_7_DynamicElementHandling {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Flipcart");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(list.size());
		
		Iterator<WebElement> it=list.iterator();
		while(it.hasNext())
		{
		
			System.out.println(it.next().getText());
		}
		
	}

}
