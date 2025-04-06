package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_AccountLoginTest extends BaseClass{

	@Test
	public void LoginTest() {
		
		logger.info("******Starting TC_002_AccountLoginTest********");
		try {
			HomePage hp=new HomePage(driver);
			Thread.sleep(2000);
			hp.clickMyAccount();
			hp.clickLogin();
			
			logger.info("clicked on login link");
			
			LoginPage login=new LoginPage(driver);
			
			Thread.sleep(2000);
			login.setUsername(p.getProperty("email"));
			login.setpassword(p.getProperty("password"));
			login.clickLogin();
			
			Thread.sleep(2000);
			logger.info("validating confirmation message");
			String message=login.getconfirmation();
			Assert.assertEquals(message, "My Account");
			
			
		} catch (Exception e) {
			//logger.error("Test failed");
			Assert.fail();
		}
	
	}
}
