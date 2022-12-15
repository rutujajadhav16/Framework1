package Seleniumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement speed=driver.findElement(By.xpath("//select[@name='speed']"));
		Select speed_select=new Select(speed);
		speed_select.selectByVisibleText("Medium");
		
		WebElement file=driver.findElement(By.xpath("//select[@id='files']"));
		Select file_select=new Select(file);
		List<WebElement> filetypes=file_select.getOptions();
	  
		for(WebElement options:filetypes)
		{
			if(options.getText().equals("DOC file"))
			{
				options.click();
			}
			System.out.println("clicked");
		}
		
	/*	for(int i=0;i<filetypes.size();i++)
		{
			System.out.println("inside loop");
			if(filetypes.get(i).equals("DOC file"))
			{
				filetypes.get(i).click();
				System.out.println("Clicked");
			}
		}*/
	}

}
