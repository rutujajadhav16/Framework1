package VelocitySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
		//driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")).click();
		//driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")).sendKeys(Keys.ARROW_DOWN);
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click();*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Cancel ']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
