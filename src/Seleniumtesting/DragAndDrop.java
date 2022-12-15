package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.id("box6"));
		WebElement target=driver.findElement(By.id("box106"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(source, target).build().perform();
		
		WebElement source1=driver.findElement(By.id("box3"));
		WebElement target1=driver.findElement(By.id("box103"));
		Thread.sleep(3000);
		act.dragAndDrop(source1, target1).build().perform();
		
	} 

}
