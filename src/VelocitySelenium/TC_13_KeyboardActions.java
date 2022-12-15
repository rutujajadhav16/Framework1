package VelocitySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Key;

public class TC_13_KeyboardActions {

	public static void main(String[] args) throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:\\www.google.com");
		Thread.sleep(3000);
		
		//WebElement search=driver.findElement(By.name("q"));
		
		Actions a=new Actions(driver);
		//a.moveToElement(search).click().build().perform();
		a.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.amazon.in");
        driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
        driver.findElement(By.id("ap_email")).sendKeys("seleniumoar1234@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("*****");
        driver.findElement(By.id("signInSubmit")).click();
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
        driver.get("http://www.gmail.com");

	}

}
