package NeoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//import NeoStoxUtility_New.NeoStoxUtility;

public class POM_NeoStoxPopup 
{
	@FindBy(xpath="(//a[text()='OK'])[2]")
	WebElement okButton;
	
	@FindBy(xpath="(//a[text()='Close'])[5]")
	WebElement cancelButton;
	
	public POM_NeoStoxPopup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnOkButton(WebDriver driver) throws InterruptedException
	
	{
		Thread.sleep(1000);
		if(okButton.isDisplayed()) {
		//NeoStoxUtility.wait(driver, 1000);
		okButton.click();
		}
		else
			Reporter.log("no Popup",true);
	}
	
	public void clickOnCancelButton(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		//NeoStoxUtility.wait(driver,1000);
		if(cancelButton.isDisplayed()) {
		cancelButton.click();
		}
		else
			Reporter.log("no popup",true);
		
		
	}

}
