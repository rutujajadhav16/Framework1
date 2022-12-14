package NeoStoxPom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import NeoStoxBase_New.Base;
public class NeoStoxUtility extends Base 
{

	public static void screenShot(WebDriver driver,String screenshotName) throws IOException
	{
		wait(driver,1000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+screenshotName+".png");
		FileHandler.copy(src, dest);
		Reporter.log("taking screenshot", true);
	}

	public static void scrolling(WebDriver driver,WebElement element)
	{
		wait(driver,1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("Taking screenshot",true);
	}
	
	public static String readData(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File file=new File("E:\\Rutuja study\\Velocity\\Automation\\adminfile.xlsx");
		String cell_value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("reading data from excel",true);
		return cell_value;
		
	}
	
	public static void wait(WebDriver driver,int milisecond)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(milisecond));
		Reporter.log("Giving wait time",true);
	}
}
