package cucmberDemo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Info;

import cucumberDemo.pages.LoginPage;
import cucumberDemo.pages.OverviewPage;
import cucumberDemo.pages.ProductPage;
import cucumberDemo.pages.YourCartPage;
import cucumberDemo.pages.YourInfoPage;
import io.netty.util.concurrent.ThreadProperties;

public class BaseTest {
	WebDriver driver;
	public LoginPage loginPage;
	public ProductPage productPage;
	public YourCartPage cartPage;
	public YourInfoPage infoPage;
	public OverviewPage overviewPage;
	
    public static Properties prop=readPropertiesFile("src/test/resources/env/env.properties");	
	public void setUp() {
	    System.setProperty("webdriver.chrome.driver", prop.getProperty("location"));
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		pageInitialization();
		
	}
    
    public static Properties readPropertiesFile(String fileName)  {
    	FileInputStream file=null;
    	Properties prop= new Properties();
    	try {
        	file=new FileInputStream(fileName);
        	prop.load(file);
    	}
    	catch(FileNotFoundException fe) {
    		fe.printStackTrace();
    	}catch(IOException ie) {
    		ie.printStackTrace();
    	}
    	return prop;
    	
    }
    
    public void pageInitialization() {
    	loginPage = PageFactory.initElements(driver, LoginPage.class);
    	productPage = PageFactory.initElements(driver, ProductPage.class);
    	cartPage = PageFactory.initElements(driver, YourCartPage.class);
    	infoPage = PageFactory.initElements(driver, YourInfoPage.class);
    	overviewPage = PageFactory.initElements(driver, OverviewPage.class);
    }
    
    public void quitDriver() {
    	driver.quit();
    }
	

}
