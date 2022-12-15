package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Sam");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Jadhav");
		//driver.findElement(By.xpath("//*[@id=\'photofile\']")).click();
		//driver.findElement(By.name("photofile")).click();
		WebElement element = driver.findElement(By.id("photofile"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);
	    
	    Screen s= new Screen();
	    
	    Pattern p=new Pattern("E://Rutuja study//udemy//sikuli-img//filename.jpeg");
	    Pattern p1=new Pattern("E://Rutuja study//udemy//sikuli-img//Capture.jpeg");
	    
	    s.wait(p,10);
	    s.type(p,"E://Rutuja study//udemy","Tulips.jpeg");
	    s.click(p1);
	    
	    
	    
	    
		
	}

}
