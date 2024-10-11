package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;

public class TC002_LoginTest extends BaseClass{

	
	@Test(groups = {"Sanity","Master"})
	public void verify_Login()
	{
		logger.info("**** Starting TC002_LoginTest *****");
		try 
		{
		
		HomePage hp=new HomePage(driver);
		hp.ClickMyaccount();
		logger.info("Click on My Account Link");
		hp.ClickLogin();
		logger.info("Click Login Link");
		
		
		logger.info("Putting MY Email and Password ");
		LoginPage login=new LoginPage(driver);
		login.setemail(p.getProperty("email"));
		login.setPassword(p.getProperty("password"));
		login.clickLogin();
		
		logger.info("My account msg is expexted");
		//MyAccount
		MyAccountPage myAcc= new MyAccountPage(driver);
		boolean Targetpage =myAcc.isMyAccountPageExists();
		//Assert.assertEquals(Targetpage, true,"Login Failed");
		Assert.assertTrue(Targetpage);
		}
		catch(Exception e )
		{
			Assert.fail();
		}
		logger.info("****** Finnished TC002_LoginTest *****");
		
		
	}
	
	
}
		
		
		
	


