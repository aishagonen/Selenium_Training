package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class oo33_TestNG_2 {
	
	public static WebDriver driver;
	ElementUtil elementUtil;

// locators:	
	By email = By.id("username");
	By password = By.id("password");
	By loginBtn = By.id("loginBtn");
	By bodyText = By.xpath("//div[@class='private-alert__inner']/h5");;
	
	@BeforeMethod
	public void setUp() throws InterruptedException { 
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, "https://app.hubspot.com/login");
		Thread.sleep(5000);
	}
	
	@Test
	public void InvalidCredentials() {
		ElementUtil.waitGetElementDefault(driver, email).sendKeys("kralshakir@gmail.com");
		ElementUtil.waitGetElementDefault(driver, password).sendKeys("lompen");
		ElementUtil.waitGetElementDefault(driver, loginBtn).click();
		String text = ElementUtil.waitGetElementDefault(driver, bodyText).getText();
		Assert.assertEquals(text, "That email address doesn't exist.");
	}	
	
	@AfterMethod
	public void tearDown() {
		ElementUtil.quitBrowser(driver);
	}
	
}
