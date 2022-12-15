package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		 
		driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Thread.sleep(300);
		Actions act=new Actions(driver);
		act.moveToElement(element).dragAndDropBy(element,500, 600).build().perform();
		
		
		
		
	}

}
