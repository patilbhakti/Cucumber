package cucumberDemo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ProductPage {
	

	public WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}



	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement product1;

     
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement product2;
	
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement product3;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement product4;
	
	@FindBy(id = "remove-sauce-labs-bike-light")
	WebElement removeProduct3;

	@FindBy(id = "remove-sauce-labs-fleece-jacket")
	WebElement removeProduct4;

	@FindBy(id = "shopping_cart_container")
	WebElement cartButton;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menuBtn;
	
	@FindBy(css = "a[id='inventory_sidebar_link']")
	WebElement allItem;
	
	@FindBy(xpath = "//a[@id='about_sidebar_link']")
	WebElement aboutUs;
	
	@FindBy(xpath = "//a[@id='reset_sidebar_link']")
	WebElement reset;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	@FindBy(xpath = "//select[@data-test='product_sort_container']")
    WebElement filters;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[1]")
	WebElement firtsItemAfterSort;
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	WebElement cartNumber;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[1]")
	WebElement prod1Name;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[2]")
	WebElement prod2Name;
	
	// adding products to cart
	public void addToCart() {
		product1.click();
		product2.click();
		product3.click();
		product4.click();
		System.out.println("Products added");

	}
	
	public void removeProduct() {
		removeProduct3.click();
		removeProduct4.click();
		System.out.println("Products removed successfully");
	}
    
	public String prod1Text() {
		return prod1Name.getText();
	}
	
	public String prod2Text() {
		return prod2Name.getText();
	}
	

	// click on cartButton
	public void clickCartButton() {
		cartButton.click();
	}
	
	public String cartText() {
		return cartButton.getText();
	}
	
	
	
    public void sortProducts(String visibleText) {
    	new Select(filters).selectByVisibleText(visibleText);
    }
    
    public String firstItemAfterSorting() {
    	return firtsItemAfterSort.getText();
    	
    }
    
    public String getCartNumber() {
    	return cartNumber.getText();
    }
    
    public boolean menuBtnDisplayed() {
    	return menuBtn.isDisplayed();
    }
    
    public void clickMenuBtn() {
    	menuBtn.click();
    }
    
    public String clickAllItem() {
    	allItem.click();
    	return driver.getCurrentUrl();
    }
    
    public void clickAboutUs() {
    	aboutUs.click();
    	driver.navigate().back();
    }
    
    public void clickReset() {
    	reset.click();
    }
    
    public String clickLogout() {
    	logout.click();
    	return driver.getCurrentUrl();
    }
    
    public void navigateBack() {
    	driver.navigate().back();
    }

}



















