package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
	WebElement admin=	driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
	WebElement usermanagement=	driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
	WebElement users=	driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		
	Actions act=new Actions(driver);
	act.moveToElement(admin).moveToElement(usermanagement).moveToElement(users).click().build().perform();

	}

}
