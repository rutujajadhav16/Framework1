package NeoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import NeoStoxUtility_New.NeoStoxUtility;

public class POM_NeoStoxPassword 
{

	@FindBy(xpath="//input[@id='txt_accesspin']")
	WebElement password;
	
	@FindBy(xpath="//a[@id='lnk_submitaccesspin']")
	WebElement submit;
	
	public POM_NeoStoxPassword (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(WebDriver driver,String pwd)
	{
		NeoStoxUtility.wait(driver, 2000);
		password.sendKeys(pwd);
	}

	public void clickOnSubmit(WebDriver driver)
	{
		NeoStoxUtility.wait(driver, 2000);
		submit.click();
	}
	
}
