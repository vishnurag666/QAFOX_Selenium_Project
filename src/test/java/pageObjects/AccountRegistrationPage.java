package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	JavascriptExecutor js;

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath=("//input[@id='input-firstname']"))
	WebElement txtFirstName;
	
	@FindBy(xpath=("//input[@id='input-lastname']"))
	WebElement txtLastName;
	
	@FindBy(xpath=("//input[@id='input-email']"))
	WebElement txtEmail;
	
	@FindBy(xpath=("//input[@id='input-telephone']"))
	WebElement txtPhone;
	
	@FindBy(xpath=("//input[@id='input-password']"))
	WebElement txtPassword;
	
	@FindBy(xpath=("//input[@id='input-confirm']"))
	WebElement txtConfirm;
	
	@FindBy(xpath=("//label[normalize-space()='Yes']"))
	WebElement btnSubscribe;
	
	@FindBy(xpath=("//input[@name='agree']"))
	WebElement btnPrivacyPolicy;
	
	@FindBy(xpath=("//input[@value='Continue']"))
	WebElement btnContinue;
	
	
	@FindBy(xpath=("//h1[normalize-space()='Your Account Has Been Created!']"))
	WebElement txtAccountConfirmation;

	
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPhone(String phone)
	{
		txtPhone.sendKeys(phone);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
		 js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
	}
	public void confirmPassword(String cpwd)
	{
		txtConfirm.sendKeys(cpwd);
	}
	
	public void clickSubscribe() {

		//sol 1
		btnSubscribe.click();
		
		
		// IF THE CLICK IS NOT DIRECTLY WORKING WE CAN USE ALTERNATIVE WAYS
//		//sol 2
//		btnSubscribe.submit();
//		
//		//sol 3
//		Actions act=new Actions(driver);
//		act.moveToElement(btnSubscribe).click().perform();
//		
//		//sol 4
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("argument[0].click();", btnSubscribe);
//		
//		//sol 5
//		btnSubscribe.sendKeys(Keys.RETURN);
//		
//		//sol 6
//		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		mywait.until(ExpectedCondition.elementToBeClickable(btnSubscribe)).click();
	}
	
	public void clickPrivacyPolicy() {

		btnPrivacyPolicy.click();
	}
	
	public void clickContinue() {
	
		btnContinue.click();
	}
	
	
	public String getConfirmationMsg() {  // In the page object class we do not use any validation
		try {                                 // this is for return the confirmation message
			return (txtAccountConfirmation.getText());
		} catch (Exception e) {
			// TODO: handle exception
			return(e.getMessage());
		}
	}
	
	
}
