package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) { // Inheritance - Invoking Parent class constructor using super keyword
		super(driver);
		
	}
	@FindBy(xpath=("//span[normalize-space()='My Account']"))   //MyAccount drop down locator
	WebElement MyAccount;                                                         // Added to a WebElement
	
	@FindBy(xpath=("//a[normalize-space()='Register']"))  // register locator
	WebElement lnkRegister;
	
	@FindBy(xpath=("//a[normalize-space()='Login']"))  //Login element locator
	WebElement lnkLogin;
	
	public void clickMyAccount()   //Method for clicking
	{
		MyAccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
	
	@FindBy(xpath=("//input[@placeholder='Search']"))  // Locator for search bar
	WebElement txtSearch;
	
	@FindBy(xpath=("//button[@class='btn btn-default btn-lg']"))
	WebElement btnSearch;
	
	@FindBy(xpath=("//span[normalize-space()='Wish List (0)']"))  //Wishlist
	WebElement lnkWhishlist;
	
	@FindBy(xpath=("//span[normalize-space()='Shopping Cart']"))   //Cart
	WebElement lnkCart;
	
	@FindBy(xpath=("//span[normalize-space()='Checkout']"))  //Checkout
	WebElement lnkCheckout;
	
	public void setSearch(String search)   //method for passing text in search
	{
		txtSearch.sendKeys(search);
	}
	
	public void clickWishlist()   //methods for click
	{
		lnkWhishlist.click();
	}

	public void clickCart()
	{
		lnkCart.click();
	}
	
	public void clickCheckout()
	{
		lnkCheckout.click();
	}
	
	public void clickSearchbtn()
	{
		btnSearch.click();
	}
	
	@FindBy(xpath=("//a[normalize-space()='Desktops']")) //Dynamic dropdown
	WebElement lnkDesktop;
	
	@FindBy(xpath=("//a[normalize-space()='Laptops & Notebooks']"))
	WebElement lnkLaptopsandNotebook;
	
	@FindBy(xpath=("//a[normalize-space()='Components']"))
	WebElement lnkComponents;
	
	@FindBy(xpath=("//a[normalize-space()='Tablets']"))
	WebElement lnkTablets;
	
	@FindBy(xpath=("//a[normalize-space()='Software']"))
	WebElement lnkSoftware;
	
	@FindBy(xpath=("//a[normalize-space()='Phones & PDAs']"))
	WebElement lnkPhonesandPDA;
	
	@FindBy(xpath=("//a[normalize-space()='Cameras']"))
	WebElement lnkCamera;
	
	@FindBy(xpath=("//a[normalize-space()='MP3 Players']"))
	WebElement lnkMp3Player;
	
	public void clickDesktop()
	{
		lnkDesktop.click();
	}
	
	public void clickLaptop()
	{
		lnkLaptopsandNotebook.click();
	}
	
	public void clickComponent()
	{
		lnkComponents.click();
	}
	
	public void clickTablets()
	{
		lnkTablets.click();
	}
	
	public void clickSoftware()
	{
		lnkSoftware.click();
	}
	
	public void clickPhones()
	{
		lnkPhonesandPDA.click();
	}
	
	public void clickCamera()
	{
		lnkCamera.click();
	}
	
	public void clickMp3()
	{
		lnkMp3Player.click();
	}
	
	@FindBy(xpath=("//span[normalize-space()='Currency']"))
	WebElement drpdwnCurrency;
	
	@FindBy(xpath=("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"))
	WebElement lnkAddtoCart;
	
	
	public void clickCurrency()
	{
		drpdwnCurrency.click();
	}
	
	public void clickCartBox()
	{
		lnkAddtoCart.click();
	}
	
	//Currency drpdwn
	
	@FindBy(xpath=("//button[contains(text(),'€Euro')]"))
	WebElement drpdwnEuro;
	
	public void clickEuro()
	{
		drpdwnEuro.click();
	}

	@FindBy(xpath=("//button[normalize-space()='£Pound Sterling']"))
	WebElement drpdwnPound;
	
	public void clickPound()
	{
		drpdwnPound.click();
	}
	
	@FindBy(xpath=("//button[normalize-space()='$US Dollar']"))
	WebElement drpdwnDollar;
	
	public void clickDollar()
	{
		drpdwnDollar.click();
	}
	
	@FindBy(xpath=("//strong[contains(text(),'€')]"))
	WebElement iconEuro;
	
	@FindBy(xpath=("//strong[normalize-space()='£']"))
	WebElement iconPound;
	
	@FindBy(xpath=("//strong[normalize-space()='$']"))
	WebElement iconDollar;
	
}
