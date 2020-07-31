package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class o9_LoginPageDemo {
	
	public static WebDriver driver;
	static By email = By.id("username");
	static By password = By.xpath("//input[@id='username']");
	static By loginBtn = By.cssSelector("#loginBtn");
	

	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://app.hubspot.com/login";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchBrowser(driver, url);
		Thread.sleep(3000);

		ElementUtil.getElement(driver, email).sendKeys("peyami@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("Lompen");
		ElementUtil.getElement(driver, loginBtn).click();
		ElementUtil.quitBrowser(driver);
		
	}

}
