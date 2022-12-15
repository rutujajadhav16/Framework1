package Seleniumtesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String path="E://Rutuja study//udemy//Data driven testing//caldata.xlsx";
		FileHandlingExample.setExcelFile(path,"Sheet1");
		
		int rowcount= FileHandlingExample.getrowCount(path,"Sheet1");
		
		for(int i=0;i<=rowcount;i++)
		{
		
			int principal= Integer.parseInt(FileHandlingExample.getCellData(path, "Sheet1", i, 1));
			int roi=Integer.parseInt(FileHandlingExample.getCellData(path, "Sheet1", i,2));
			int yrs=Integer.parseInt(FileHandlingExample.getCellData(path, "Sheet1", i, 3));
			String Frequency= FileHandlingExample.getCellData(path, "Sheet1",i, 4);
			double maturity=Double.parseDouble(FileHandlingExample.getCellData(path, "Sheet1", i, 5));
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(principal));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(roi));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(yrs));
			
			Select period=new Select(driver.findElement(By.id("tenurePeriod")));
			period.selectByVisibleText("year(s)");
			
			Select freq=new Select(driver.findElement(By.id("frequency")));
			freq.selectByVisibleText(Frequency);
			
			
			
		}
		
		
		
		
		
	}

}
