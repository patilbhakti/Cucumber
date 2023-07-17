package cucumberDemo.stepDef;

import org.testng.Assert;
import cucmberDemo.base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdef {
	BaseTest base;

	public LoginStepdef(BaseTest base) {
		this.base = base;
	}

//validate error for invalid credentials
	@Given("I want to open sauce lab application")
	public void loadUrl() {

//		base.setUp();
		System.out.println("Url is loaded");
	}

	@When("I login to the application with {string} and {string}")
	public void loginWithInvalidInfo(String username, String password) {

		base.loginPage.login(username, password);
		base.loginPage.loginBtn();
		
	}

	@Then("I validate the login page errors {string}")
	public void ValidateError(String error) {
		String err = base.loginPage.getErrorMsg();
		Assert.assertEquals(error, err);

//		base.quitDriver();
	}

//validate login with valid credentials
	@Given("Url should be loaded")
	public void urlLoad() {
//		base.setUp();

	}


	@Given("Login page should be displayed")
	public void loginPageIsDisplayed() throws InterruptedException {
		Thread.sleep(1000);

		Assert.assertEquals(true, base.loginPage.loginBtnDisplayed());

	}

	@When("User login with valid credentials")
	public void user_login_with_valid_credentials() {

		base.loginPage.login();
		base.loginPage.loginBtn();
		
		System.out.println("User logged in successfully");
	}

	@Then("User should land on homepage")
	public void homepageDisplay() throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertEquals(true, base.productPage.menuBtnDisplayed());
//		base.quitDriver();

	}



}




























//switch (error) {
//case "Epic sadface: Username and password do not match any user in this service":
//	Assert.assertEquals(err, "Epic sadface: Username and password do not match any user in this service");
//	break;
//case "Epic sadface: Username is required":
//	Assert.assertEquals(err, "Epic sadface: Username is required");
//	break;
//case "Epic sadface: Password is required":
//	Assert.assertEquals(err, "Epic sadface: Password is required");
//	break;
//case "Epic sadface: Sorry, this user has been locked out.":
//	Assert.assertEquals(err, "Epic sadface: Sorry, this user has been locked out.");
//	break;
//}




//WebElement loginBtn = this.driver.findElement(By.xpath("//input[@id='login-button']"));
//if (base.loginPage.loginBtnDisplayed()) {
//	System.out.println("Login page is loaded successfully");
//}
