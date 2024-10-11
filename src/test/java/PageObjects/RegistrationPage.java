package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "input-firstname")
	WebElement txtfirstName;

	@FindBy(id = "input-lastname")
	WebElement txtlastname;

	@FindBy(id = "input-email")
	WebElement txtemail;

	@FindBy(id = "input-telephone")
	WebElement txttelephone;

	@FindBy(id = "input-password")
	WebElement txtPwd;

	@FindBy(id = "input-confirm")
	WebElement txtConfirmPwd;

	@FindBy(name = "agree")
	WebElement btncheckPolicy;

	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement msgConfirmation;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnclkContinue;

	public void SetFirstName(String fname) {
		txtfirstName.sendKeys(fname);
	}

	public void SetLastName(String SerName) {
		txtlastname.sendKeys(SerName);
	}

	public void SetMail(String Email) {
		txtemail.sendKeys(Email);
	}

	public void SetPassword(String Password) {
		txtPwd.sendKeys(Password);
	}

	public void SetConfPassword(String Password) {
		txtConfirmPwd.sendKeys(Password);
	}

	public void SetTelephone(String phone) {
		txttelephone.sendKeys(phone);
	}

	public void SetPolicyCheck() {
		btncheckPolicy.click();

	}

	public void clickContinue() {
		btnclkContinue.click();
	}

	public String getConfirmationMessage() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

	}
}
