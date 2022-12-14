package NeoStoxTest_New;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import NeoStoxPom.POM_NeoStoxHomepage;
import NeoStoxPom.POM_NeoStoxLogin;
import NeoStoxPom.POM_NeoStoxLogout;
import NeoStoxPom.POM_NeoStoxPassword;
import NeoStoxPom.POM_NeoStoxPopup;
import NeoStoxPom.NeoStoxUtility;
//import NeoStoxUtility_New.NeoStoxUtility;

import org.testng.annotations.Test;

import NeoStoxBase_New.Base;

@Listeners({NeoStoxPom.ITestListenerClass.class})

public class ValidateLogin extends Base
{
		POM_NeoStoxLogin login;
		POM_NeoStoxPassword pass;
		NeoStoxUtility utility;
		POM_NeoStoxPopup popup;
		POM_NeoStoxHomepage home;
		POM_NeoStoxLogout logout;
		
		@BeforeClass
		public void launchBrowser() throws InterruptedException
		{
			setBrowser();
			login=new POM_NeoStoxLogin(driver);
			pass=new POM_NeoStoxPassword(driver);
			utility=new NeoStoxUtility();
			popup=new POM_NeoStoxPopup(driver);
			home=new POM_NeoStoxHomepage(driver);
			logout=new POM_NeoStoxLogout(driver);
		}
		
		@BeforeMethod
		public void loginNeostox() throws EncryptedDocumentException, IOException, InterruptedException
		{
			login.enterNumber(driver, utility.readData(3,0));
			login.clickOnSignIN(driver);
			pass.enterPassword(driver, utility.readData(3, 1));
			Thread.sleep(3000);
			pass.clickOnSubmit(driver);
			Thread.sleep(1000);
			popup.clickOnOkButton(driver);
			popup.clickOnCancelButton(driver);
			
		}
		
		@Test(testName="validateUsername",priority = 1)
		public void validateUsername() throws EncryptedDocumentException, IOException
		{
			
			String actual_name=home.getUsername(driver);
			System.out.println(actual_name);
			String name=actual_name.substring(3);
			//utility.screenShot(driver, name);
			String expected_name=utility.readData(3,2);
			Reporter.log("validating username",true);
			Assert.fail();
			//Assert.assertEquals(actual_name, expected_name,"TC is failed actual and expected name is not matching");
		}
		
		@Test(testName="validateBalance",priority=2)
		public void validateBalance() throws EncryptedDocumentException, IOException, InterruptedException
		{
			Thread.sleep(1000);
			String balance=home.getBalance(driver);
			System.out.println(balance);
			String bal=balance.substring(3);
			//utility.screenShot(driver,"Acc balance");
			String expected_balance=utility.readData(3,3);
			Reporter.log("validating balance");
			Assert.assertEquals(bal, expected_balance,"TC failed balance is not matching");
		}
		
		@AfterMethod
		public void loggingOut() throws InterruptedException
		{
			Thread.sleep(2000);
			logout.clickOnLogout(driver);
		}
		
		@AfterClass
		public void close() throws InterruptedException
		{
			Thread.sleep(1000);
			driver.close();
		}
}
