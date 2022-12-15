package Seleniumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://goo.gl/RVdKM9");
		
		String title=driver.getTitle();
		System.out.println("Titlr of the page:"+title);
		
		String url=driver.getCurrentUrl();
		System.out.println("current url is:"+url);
		String s=driver.getPageSource();
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("sam");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("Jadhav");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("98789879");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("Kolhapur");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("samjadhav@gmail.com");

		WebElement we=driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
		Select dropdown= new Select(we);
		 
		System.out.println(dropdown.getOptions().size());
		
		List <WebElement> options=dropdown.getOptions();
		for (WebElement e:options)
		{
			System.out.println(e.getText());
		}
		//dropdown.selectByVisibleText("Morning");
		//dropdown.selectByIndex(2);
		dropdown.selectByValue("Radio-2");
		
		
		//driver.findElement(By.id("RESULT_RadioButton-7_0")).click();
		//Thread.sleep(3000);
		
		/*System.out.println(r1.isDisplayed());
		System.out.println(r1.isEnabled());
		//System.out.println("Before");
		System.out.println(r1.isSelected());
		
		//r1.click();
		System.out.println(r1.isSelected());
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_CheckBox-8_0\"]")).click();*/
	//	driver.findElement(By.id("RESULT_CheckBox-8_6")).click();
		
		driver.findElement(By.linkText("Software Testing Tutorials")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Tools Training")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();

		driver.navigate().back();
		driver.close();
		
	}

}
