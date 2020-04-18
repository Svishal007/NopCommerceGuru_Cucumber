package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class LoginStep {
	public WebDriver driver;
	 public LoginPage lp;
	
	@Given("Launch Chrome Browser")
	public void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\TestAutomation\\NopCommerceGuruCucumber\\Driver\\Chrome\\chromedriver.exe");
	     driver = new ChromeDriver();
	     lp= new LoginPage(driver);
		
	}
	
	@When("Open URL {string}")
	public void openURL(String url) {
		driver.get(url);
	}
	
	@When(" Enter email {string} and password as {string}")
	public void enterEmail_password(String email, String pwd) {
		lp.setEmailID(email);
		lp.setPassword(pwd);
		
	}
	
	@When("Click on Login")
	public void clickLogin() {
		lp.clickLogin();
	}
	
	@Then("Page title should be {String}")
	public void pageTitle() {
		if (driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
		}
	}
	
	@When("Click on Logout")
	public void clickLogout() {
		lp.clickLogout();
		
	}
	
	@Then("Close Browser")
	public void closeBrowser() {
		driver.quit();
	}
}
