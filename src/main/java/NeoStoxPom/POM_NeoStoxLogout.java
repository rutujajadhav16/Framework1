package NeoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import NeoStoxUtility_New.NeoStoxUtility;

public class POM_NeoStoxLogout 
{
	@FindBy(xpath="//a[@id='navbarDropdown']")
	WebElement logout_menu;
	
	@FindBy(xpath="//a[@id='lnk_logout']")
	WebElement logout;
	
	public POM_NeoStoxLogout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void clickOnLogout(WebDriver driver) throws InterruptedException
	{
		NeoStoxUtility.wait(driver,1000);
		logout_menu.click();
		Thread.sleep(1000);
		logout.click();
	}
}
