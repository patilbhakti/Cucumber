package cucumberDemo.stepDef;

import org.testng.Assert;

import cucmberDemo.base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef {
	
	BaseTest base;

	public HomeStepDef(BaseTest base) {
		this.base = base;
	}
	
	//menu options validation
	@Given("open sauceDemo and login")
	public void open_sauce_demo_and_login() {
//	    base.setUp();
	    base.loginPage.login();
	    base.loginPage.loginBtn();
	}
	@When("click on menu options")
	public void click_on_menu_options() {
		base.productPage.clickMenuBtn();

	}
	@Then("validate all the options one by one")
	public void validate_all_the_options_one_by_one() throws InterruptedException {
		base.productPage.clickAllItem();
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", base.productPage.clickAllItem());
		
		base.productPage.clickAboutUs();

		Thread.sleep(2000);
		base.productPage.addToCart();
        base.productPage.clickReset();
		Assert.assertEquals(base.productPage.cartText(), "");
		
		base.productPage.clickLogout();
		Assert.assertEquals(true, base.loginPage.loginBtnDisplayed());
		
		
//		base.quitDriver();
	}

	//Sort options validation
	@Given("open sauceDemo website")
	public void open_sauce_demo_website() {
//	   base.setUp();
	}

	@When("login with valid credentials")
	public void login_with_valid_credentials() {
	  base.loginPage.login();
	   base.loginPage.loginBtn();
	}

	
	@Then("validate all sort options for {string}")
	public void validate_all_sort_options_for(String options) {
	    switch (options) {
		case "Name (A to Z)":  base.productPage.sortProducts("Name (A to Z)");
	    Assert.assertEquals("Sauce Labs Backpack",base.productPage.firstItemAfterSorting());
	              break;
		case "Name (Z to A)": base.productPage.sortProducts("Name (Z to A)");
        Assert.assertEquals("Test.allTheThings() T-Shirt (Red)",base.productPage.firstItemAfterSorting());  
        break;
        
		case "Price (low to high)": base.productPage.sortProducts("Price (low to high)");
	    Assert.assertEquals("Sauce Labs Onesie",base.productPage.firstItemAfterSorting());
	    break;
	    
		case "Price (high to low)":  base.productPage.sortProducts("Price (high to low)");
	    Assert.assertEquals("Sauce Labs Fleece Jacket",base.productPage.firstItemAfterSorting());
	    break;
		
		}
//	    base.quitDriver();
	}

}
