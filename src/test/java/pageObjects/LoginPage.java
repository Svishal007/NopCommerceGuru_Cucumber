package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(xpath = "//input[@class='email valid']")
	WebElement textEmail;
	
	@FindBy(id = "Password")
	WebElement textPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement btnLogout;
	
	
	
	public void setEmailID(String emailID) {
		textEmail.sendKeys(emailID);
	}
	
	public void setPassword(String password) {
		textPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		textEmail.click();
	}
}
