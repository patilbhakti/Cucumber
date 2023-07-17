package cucumberDemo.stepDef;

import org.testng.Assert;

import cucmberDemo.base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepDef {
	
	BaseTest base;

	public CartStepDef(BaseTest base) {
		this.base = base;
	}
	
	//validate cart page
	@Given("I want to add products to the cart")
	public void i_want_to_add_products_to_the_cart() {
//		base.setUp();
	   base.loginPage.login();
	   base.loginPage.loginBtn();
	   base.productPage.addToCart();
	   base.productPage.removeProduct();
	}

	@When("open cart link")
	public void open_cart_link() {
	    base.productPage.clickCartButton();
	}

	@Then("verify added products are present or not")
	public void verify_added_products_are_present_or_not() {
	   Assert.assertEquals(base.productPage.prod1Text(), base.cartPage.prod1Name());
	   Assert.assertEquals(base.productPage.prod2Text(), base.cartPage.prod2Name());
//	   base.quitDriver();
	}
	
	
	//validate overview page
	@Given("add items to the cart")
	public void add_items_to_the_cart() {
//	   base.setUp();
	   base.loginPage.login();
	   base.loginPage.loginBtn();
	   base.productPage.addToCart();
	   base.productPage.clickCartButton();
	}

	@When("checkout to order")
	public void checkout_to_order() {
	    base.cartPage.clickCheckoutBtn();
	}
	
	@Then("give user information")
	public void give_user_information()  {
	    base.infoPage.enterInfo();
	    base.infoPage.clickContinue();
	}

	@Then("verify all the product information and checkout information is present on overview page or not")
	public void verify_all_the_product_information_and_checkout_information_is_present_on_overview_page_or_not() {
	   Assert.assertEquals(base.cartPage.prod1Name(), base.overviewPage.getFirstItemName());
	   Assert.assertTrue(base.overviewPage.cartListDisplayed());
	   Assert.assertTrue(base.overviewPage.priceTotalDisplayed());
	   
//	   base.quitDriver();
	}




}
