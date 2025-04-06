package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage { //This is the parent of all page object classes
WebDriver driver;

public BasePage(WebDriver driver)   // Constructor
{
	this.driver=driver;
	PageFactory.initElements(driver, this);  
}
}
/*
Usage of PageFactory.initElements(driver, this); - This initializes web elements in the extending classes,
reducing the need for driver.findElement() calls in each test.
*/