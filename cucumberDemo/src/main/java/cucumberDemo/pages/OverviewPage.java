package cucumberDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
	
final WebDriver driver;
	
	public OverviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement finishBtn;
	
	@FindBy(xpath="//h2[normalize-space()='Thank you for your order!']")
	WebElement thankyouMsg;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement backHomeBtn;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menuButton;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logoutBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Price Total')]")
	WebElement priceTotal;
	
	@FindBy(xpath = "//div[@class='cart_list']")
	WebElement cartList;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[1]")
	WebElement firstItem;
	
	public void clickFinish() {
		finishBtn.click();
	}
	
	public String getThankYouMsg() {
		return thankyouMsg.getText();
	}
	
	public void clickBackBtn() {
		backHomeBtn.click();
		
	}
	
	public void clickMenuBtn() {
		menuButton.click();
	}
	
	public void clickLogout() {
		logoutBtn.click();
		System.out.println("logged out successfully");
	}
	
	public boolean priceTotalDisplayed() {
		return priceTotal.isDisplayed();
	}
	
	public boolean cartListDisplayed() {
		return cartList.isDisplayed();
	}
	
	public String getFirstItemName() {
		return firstItem.getText();
	}
	
	public boolean backBtnDisplay() {
		return backHomeBtn.isDisplayed();
	}
	

}
