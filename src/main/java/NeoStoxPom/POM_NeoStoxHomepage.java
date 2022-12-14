package NeoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import NeoStoxUtility_New.*;
//import NeoStoxUtility_New;

public class POM_NeoStoxHomepage
{
	@FindBy(xpath="//span[@id='lbl_username']")
	WebElement username;
	
	@FindBy(xpath="//span[@id='lbl_curbalancetop']")
	WebElement balance;
	
	public POM_NeoStoxHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getUsername(WebDriver driver)
	{
		NeoStoxUtility.wait(driver,1000);
		String uname=username.getText();
		return uname;
	}

	public String getBalance(WebDriver driver)
	{
		//NeoStoxUtility.wait(driver,1000);
		String bal=balance.getText();
		return bal;
		
	}
}
