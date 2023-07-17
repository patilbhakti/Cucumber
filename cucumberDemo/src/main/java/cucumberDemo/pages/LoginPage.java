package cucumberDemo.pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucmberDemo.base.BaseTest;

public class LoginPage {
	final WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[contains(@id,'user-name')]")
	WebElement username;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='error-message-container error']")
	WebElement errorMsg;
	
	@FindBy(xpath="//span[text()='Products']")
	WebElement homePageHeading;
	
	public void login(String usernameData, String passwordData) {
//		username.clear();
		username.sendKeys(usernameData);
//		password.clear();
		password.sendKeys(passwordData);
		
		
		
	}
	
	public void login() {
		login(BaseTest.prop.getProperty("username"), BaseTest.prop.getProperty("password"));
	}
	
	public void loginBtn() {
		loginBtn.click();

	}
	
	public String getHomePageHeading() {
		return homePageHeading.getText();
	}
	
	public String getErrorMsg() {
		return errorMsg.getText();
	}
	
	public boolean loginBtnDisplayed() {
		return loginBtn.isDisplayed();
	}
	
	

}
