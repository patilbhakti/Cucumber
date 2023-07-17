package cucumberDemo.stepDef;

import org.testng.Assert;

import cucmberDemo.base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InfoStepDef {
	
	BaseTest base;

	public InfoStepDef(BaseTest base) {
		this.base = base;
	}
	
    //validating error for invalid user details
	@Given("I want to launch sauceDemo website")
	public void i_want_to_launch_sauce_demo_website() {
//		base.setUp();
	    
	}
	@When("login to the application")
	public void openApp() {
		base.loginPage.login();
		base.loginPage.loginBtn();
	}

	@When("add products to the cart")
	public void add_products_to_the_cart() {
	    base.productPage.addToCart();
	}

	@Then("open cart")
	public void open_cart() {
	   base.productPage.clickCartButton();
	}

	@Then("click checkout")
	public void click_checkout() {
	   base.cartPage.clickCheckoutBtn();
	}

	@Then("give invalid user information {string}, {string} and {string}")
	public void give_invalid_user_information_and(String firstname, String lastname, String zipcode) {
	    base.infoPage.enterInfo(firstname,lastname,zipcode);
	    base.infoPage.clickContinue();
	}

	@Then("validate error messages with {string}")
	public void validate_error_messages_with(String error) {
	    String err=base.infoPage.getError();
	    Assert.assertEquals(error, err);

	    
//	    base.quitDriver();
	}
	
	//checkout 
	@Given("login to application")
	public void login_using_user_and() {
//	    base.setUp();
	    base.loginPage.login();
	    base.loginPage.loginBtn();
	}

	@When("add items to the cart then checkout")
	public void add_items_to_the_cart_then_checkout() {
	    base.productPage.addToCart();
	    base.productPage.clickCartButton();
	    base.cartPage.clickCheckoutBtn();
	}

	@Then("give valid user information to order an items")
	public void give_valid_user_information_to_order_an_items() {
	   base.infoPage.enterInfo();
	   base.infoPage.clickContinue();
	   base.overviewPage.clickFinish();
	   base.overviewPage.clickBackBtn();
//	   base.quitDriver();
	}


}
