package VelocitySelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_15_AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		driver.switchTo().alert().accept();*/
		
		/*==========================================================================*/
		
	//	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	
		
		
	/*	=============================================================================*/
		
		
		
	/*	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		driver.switchTo().alert().accept();*/
		
		/*============================================================================*/
		
		/*driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();*/
		
		/*
		/*===========================================================================*/
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		String parent1=driver.getWindowHandle();
		
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(1000);
		
		String child1=driver.getWindowHandle();
		
		/*Set<String> ids=driver.getWindowHandles();
		
		Iterator<String> it=ids.iterator();
		String parent=it.next();
		String child=it.next();*/
		
		Thread.sleep(1000);
	
		driver.switchTo().window(child1);
		Thread.sleep(2000);
		
		String name=driver.findElement(By.id("Header1_headerimg")).getText();
		System.out.println(name);
	//	driver.manage().window().maximize();

	//	Thread.sleep(1000);
	//	driver.close();
		
		
		
		
		
		
		

	}

}
