package Seleniumtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		act.contextClick(button).build().perform();//Rightclick n button
		
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click();// click on copy
		
		
		Alert alert=driver.switchTo().alert();// it will switch to alert pop up
		Thread.sleep(3000);
		
		System.out.println("Text present on popup "+alert.getText());
		
		alert.accept();
		
		
		
	}

}
