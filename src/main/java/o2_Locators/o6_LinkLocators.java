package o2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class o6_LinkLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 	// to maximize web page.
		//driver.manage().deleteAllCookies();		// to clean cookies.							
		
		driver.get("http://app.hubspot.com/login");
		Thread.sleep(3000);
		
		By signUp = By.linkText("Sign up");
		ElementUtil.getElement(driver, signUp).click();
		
		By signUpp = By.partialLinkText("Sign");
		ElementUtil.getElement(driver, signUpp).click();
		
		
		

	}

}
