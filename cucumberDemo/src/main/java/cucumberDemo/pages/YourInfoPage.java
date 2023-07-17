package cucumberDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucmberDemo.base.BaseTest;

public class YourInfoPage {
	
	final WebDriver driver;
	
	public YourInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement zipCode;
	
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueBtn;
	
	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement error;
	
	
	public void enterInfo(String firstname, String lastname, String zipcode) {
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		zipCode.sendKeys(zipcode);
		System.out.println("Information is Entered");
	}
	
	public void enterInfo() {
		enterInfo(BaseTest.prop.getProperty("firstname"), BaseTest.prop.getProperty("lastname"), BaseTest.prop.getProperty("zipcode"));
	}
	
	
	
	
	public void clickContinue() {
		continueBtn.click();
	}
	
	public String getError() {
		return error.getText();
	}
	

}
