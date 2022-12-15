package VelocitySelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_8_findelements2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\google.com");
		
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		Thread.sleep(2000);
		

		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		for(WebElement l:list)
		{
			System.out.println(l.getText());
		}
		
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
		Thread.sleep(1000);
		List<WebElement> img_lst=driver.findElements(By.tagName("img"));
		
		System.out.println("=======Images========");
		
		System.out.println(img_lst.size());
		
		/*Iterator<WebElement> i=img_lst.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().getText());
		}*/
	}

}
