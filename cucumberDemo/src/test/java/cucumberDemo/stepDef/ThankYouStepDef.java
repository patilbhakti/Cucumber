package cucumberDemo.stepDef;

import org.testng.Assert;

import cucmberDemo.base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ThankYouStepDef {
	BaseTest base;

	public ThankYouStepDef(BaseTest base) {
		this.base = base;
	}
	
	
	@Given("login to app")
	public void login_to_app() {
//	   base.setUp();
	   base.loginPage.login();
	   base.loginPage.loginBtn();
	}

	@When("add product to the cart")
	public void add_product_to_the_cart() {
	    base.productPage.addToCart();
	    base.productPage.clickCartButton();
	    base.cartPage.clickCheckoutBtn();
	}

	@Then("click checkout with user info firstname and lastname and zipcode")
	public void click_checkout_with_user_info_firstname_and_lastname_and_zipcode() {
	   base.infoPage.enterInfo();
	   base.infoPage.clickContinue();
	}

	@Then("click finish order")
	public void click_finish_order() {
	   base.overviewPage.clickFinish();
	}

	@Then("thank you page should be displayed with message {string}")
	public void thank_you_page_should_be_displayed_with_message(String message) {
	   Assert.assertEquals(message, base.overviewPage.getThankYouMsg());
	   Assert.assertTrue(base.overviewPage.backBtnDisplay());
//	   base.quitDriver();
	}




}
