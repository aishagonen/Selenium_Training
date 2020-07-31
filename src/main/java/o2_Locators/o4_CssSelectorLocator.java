package o2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import o1_SeleniumMethods.ElementUtil;

public class o4_CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		Thread.sleep(3000);

		By username = By.cssSelector("#username");
		By password = By.cssSelector("#password");
		By loginBtn = By.cssSelector("#loginBtn");
		
		ElementUtil.getElement(driver, username).sendKeys("cokbilmiskadriye@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("Revani");
		ElementUtil.clickOn(driver, loginBtn);
		
		

	}

}
/*
			Customizing Css :
		
			- #id 
			- tagname[attribute='value'][...][...]...
			- contains *   : - input[name* ='xyz']
			- starts-with ^: - input[name^ ='xyz']
			- ends-with $  : - input[name$ ='xyz']

*/