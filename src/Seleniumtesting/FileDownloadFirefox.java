package Seleniumtesting;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxProfile profile=new FirefoxProfile();
		
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf"); // set Mime type according to your file format
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		System.setProperty("webdriver.gecko.driver", "E://Rutuja study//Drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("textbox")).sendKeys(" automtion testing");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		Thread.sleep(3000);
		if(isFileExists("C://Users//admin//Downloads//info.txt"))
		{
			System.out.println("File Exists");
		}
		else
		{
			System.out.println("File not exists");
		}
		
		driver.findElement(By.id("pdfbox")).sendKeys("Manual testing");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		Thread.sleep(4000);
		if(isFileExists("C://Users//admin//Downloads//info.pdf"))
		{
			System.out.println("File Exists");
		}
		else
		{
			System.out.println("File not exists");
		}

	}
	static boolean isFileExists(String path) 
	{
		File f= new File(path);
		if(f.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

	
}

