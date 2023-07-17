package cucumberDemo.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

public class YourCartPage {
	
	final WebDriver driver;

	public YourCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkoutBtn;
	
	
    @FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
	WebElement prod1;
	
	@FindBy(xpath = "(//div[@class='inventory_item_name'])[2]")
	WebElement prod2;
	
	   
    public void clickCheckoutBtn() {
    	checkoutBtn.click();
    }
    
    public String prod1Name() {
    	return prod1.getText();
    }
    
    public String prod2Name() {
    	return prod2.getText();
    }

	
	

}
