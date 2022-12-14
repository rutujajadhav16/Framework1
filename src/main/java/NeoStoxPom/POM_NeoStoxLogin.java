package NeoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import NeoStoxUtility_New.NeoStoxUtility;

public class POM_NeoStoxLogin 
{
	@FindBy(xpath="//input[@id='MainContent_signinsignup_txt_mobilenumber']")
	private WebElement mobileNo;
	
	@FindBy(xpath="(//a[text()='Sign Up'])[2]")
	private WebElement signInButton;
	
	public POM_NeoStoxLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterNumber(WebDriver driver,String mobile)
	{
		NeoStoxUtility.wait(driver,1000);
		mobileNo.sendKeys(mobile);
		
	}
	public void clickOnSignIN(WebDriver driver)
	{
		NeoStoxUtility.wait(driver, 2000);
		signInButton.click();
	}

}
