package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_003_CurrencyChangeTest extends BaseClass {

	@Test
	public void CurrencyTest()
	{
		logger.info("***********Currency DropdownTest Started*********");
		try {
			HomePage hp=new HomePage(driver);
			hp.clickCurrency();
		//	hp.clickEuro();         //to click Euro
			hp.clickDollar();       // to click Dollar
		//	hp.clickPound();          // to click Pound
			Thread.sleep(2000);
			Boolean Currency= driver.findElement(By.xpath("//strong[normalize-space()='$']")).isDisplayed();
			Assert.assertTrue(Currency);
			logger.info("Test Passed");
		} catch (Exception e) {
			logger.error("Test Failed");
			Assert.fail();
		}
		
		logger.info("***********Currency DropdownTest Finished*********");
	}
}
