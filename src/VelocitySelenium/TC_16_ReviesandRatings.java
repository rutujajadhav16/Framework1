package VelocitySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.hotkey.Keys;

public class TC_16_ReviesandRatings {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Iphone pro max 14");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		String text=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Pro Max (Silver, 128 GB)']")).getText();
		
	
		String review=driver.findElement(By.xpath("((//div[@class='col col-7-12'])[2]//span)[4]")).getText();
		System.out.println(review);
		/*Actions a=new Actions(driver);
		a.moveToElement(glass);
		Thread.sleep(1000);
		a.keyDown(Keys.ENTER).perform();*/
		//driver.close();
		
	}

}
