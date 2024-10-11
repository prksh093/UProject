package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//a[@title='My Account']")
	WebElement LinkMyAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement LinkRegistration;
	
	@FindBy(linkText = "Login")
	WebElement LinkLogin;
	
	
	public void ClickMyaccount()
	{
		LinkMyAccount.click();
	}

	public void ClickRegistration()
	{
		LinkRegistration.click();
	}
	public void ClickLogin()
	{
		LinkLogin.click();
	}
}
