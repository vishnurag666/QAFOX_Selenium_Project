package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;


public class TC_001_AccountRegistrationTest extends BaseClass{ //every testcases now extends from baseclass


	
	@Test
	public void verify_account_registration() throws InterruptedException 
	{
		logger.info("starting TC_001_AccountRegistrationTest");
		try {
			
		HomePage hp=new HomePage(driver);  
		hp.clickMyAccount();
		hp.clickRegister();
		logger.info("clicked on register link");
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("Providing details");
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@gamail.com");
		regpage.setPhone(randomNumber());
		regpage.setPassword("@Test123");
		regpage.confirmPassword("@Test123");
	     Thread.sleep(2000);
		regpage.clickSubscribe();
		regpage.clickPrivacyPolicy();
		regpage.clickContinue();
	
		logger.info("Validating expected message...");
		String message=regpage.getConfirmationMsg();
		Assert.assertEquals(message, "Your Account Has Been Created!");
		
		
		}
		catch(Exception e)
		{
			logger.error("Test failed");
		    logger.debug("debug logs");
		    Assert.fail();
		}
		logger.info("finished TC_001_AccountRegistrationTest");
	}
	
	
	
}
