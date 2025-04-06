package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_004_SearchTest extends BaseClass {
  
	@Test
	public void searchTest()
	{
		logger.info("******TC_004_SearchTest is Started********");
		try {
			HomePage hp=new HomePage(driver);
			hp.setSearch("Laptop");
			hp.clickSearchbtn();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Test Failed");
			Assert.fail();
		}
	}
}
