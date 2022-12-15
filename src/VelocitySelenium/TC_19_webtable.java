package VelocitySelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_19_webtable
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> no_ofRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("Total rows:"+no_ofRows.size());
		Iterator<WebElement> it=no_ofRows.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next().getText()+" ");
			System.out.println();
		}
		
		
		List<WebElement> no_ofcols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		System.out.println("Total cols:"+no_ofcols.size());
		for (WebElement webElement : no_ofcols) 
		{
			System.out.println(webElement.getText()+" ");
		}
		
		/*System.out.println("=======================================================");
		
		for(int i=0;i<=no_ofRows.size();i++)
		{
			for(int j=0;j<=no_ofcols.size();j++)
			{
				if(i==1)
				{
					String header=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(header+" ");
				}
				else
				{
					String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(data+" ");
					
				}
			}
		}
*/		
		System.out.println("=======================================================");
		for(int i=0;i<=no_ofRows.size();i++)
		{
			for(int j=0;j<=no_ofcols.size();j++)
			{
				if(i==1)
				{
					List<WebElement> header = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
					Iterator<WebElement> it1=header.iterator();
					while(it1.hasNext())
					{
						System.out.print(it1.next().getText());
						System.out.print(" ");
					}
					
					
				}
				else
				{
					List<WebElement> data = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//td"));
					Iterator<WebElement> it2=data.iterator();
					while(it2.hasNext())
					{
						System.out.print(it2.next().getText()+" ");
					//	System.out.println();
					}
				}
			}
			
		}
	}
	
	
}






