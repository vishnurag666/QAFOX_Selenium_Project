package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
 
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath=("//h2[normalize-space()='New Customer']"))
	WebElement txtNewCustomer;
	
	@FindBy(xpath=("//a[normalize-space()='Continue']"))
	WebElement btnContinue;
	
	@FindBy(xpath=("//h2[normalize-space()='Returning Customer']"))
	WebElement txtReturnCustomer;
	
	@FindBy(xpath=("//input[@id='input-email']"))
	WebElement txtUsername;
	
	@FindBy(xpath=("//input[@id='input-password']"))
	WebElement txtPassword;
	
	@FindBy(xpath=("//input[@value='Login']"))
	WebElement btnLogin;
	
	
	@FindBy(xpath=("//h2[normalize-space()='My Account']"))
	WebElement msgLogin;
	
	
	public void setUsername(String uname) {
		txtUsername.sendKeys(uname);
	}
	
	public void setpassword(String psw)
	{
		txtPassword.sendKeys(psw);
	}
	
	public void  clickLogin()
	{
		btnLogin.click();
	}
    
	public String getconfirmation()
	{
		try {
			return (msgLogin.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}


}
