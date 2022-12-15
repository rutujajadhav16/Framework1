package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		 
		driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		
		act.moveToElement(element).dragAndDropBy(element, 150, 0).build().perform();

}
}
