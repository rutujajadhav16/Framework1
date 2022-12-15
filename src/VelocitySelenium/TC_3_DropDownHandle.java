package VelocitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_3_DropDownHandle {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Rutuja");
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select day_select=new Select(day);
		day_select.selectByVisibleText("16");
		

		WebElement month=driver.findElement(By.id("month"));
		Select month_select=new Select(month);
		month_select.selectByIndex(7);
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select year_select=new Select(year);
		year_select.selectByValue("1996");
		
		driver.close();
		
		
				
		

	}

}
