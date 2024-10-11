package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;
import TestBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	// Testing the data in Single set not using excel Sheet data

	@Test(groups = {"Regression","Master"})
	public void verify_account_registration() {
		
		logger.info("***** Starting TC001_AccountRegistrationTest******");

		try {
		HomePage hp = new HomePage(driver);

		hp.ClickMyaccount();
		logger.info("Click My Account Link");
		hp.ClickRegistration();
		logger.info("Click Registration Link");

		RegistrationPage repage = new RegistrationPage(driver);
		
		logger.info("Providing Customer Details");
		repage.SetFirstName(randomeString().toUpperCase());
		repage.SetLastName(randomeString().toUpperCase());
		repage.SetMail(randomeString() + "@gmail.com"); // randomly generating the emails

		// we create a object because Password should be same in both place
		String Password = randomeAlphaNumberic();

		repage.SetPassword(Password);
		repage.SetConfPassword(Password);
		repage.SetTelephone(randomeNumber());
		repage.SetPolicyCheck();
		repage.clickContinue();

			logger.info("Validating expected message...");
		String conMsg = repage.getConfirmationMessage();
		if(conMsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("test failed"); 
			logger.debug("Debug logs..");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(conMsg, "Your Account Has Been Created!!!");
		}
		catch(Exception e)
		{
//			logger.error("test failed");
//			logger.debug("Debug logs..");
			Assert.fail();
		}
		logger.info("***** Finished TC001_AccountRegistrationTest******");
	}

}
