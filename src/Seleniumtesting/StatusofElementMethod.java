package Seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusofElementMethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.nopcommerce.com/register");
		WebElement f_name=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Status "+f_name.isDisplayed());
		
		System.out.println("Enable or not "+f_name.isEnabled());
		
		WebElement male_radio=driver.findElement(By.xpath("//input[@id='gender-male']"));
		male_radio.click();
		System.out.println("Selected is "+male_radio.isSelected());

	}

}
