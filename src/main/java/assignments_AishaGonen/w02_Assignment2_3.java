package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class w02_Assignment2_3 {
	
	public static  WebDriver driver;
	public static String url;

	public static void main(String[] args) {
					
		url = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
		
		By goBtn = By.xpath("//button[contains(text(),'Click for Prompt Box')]");
		
		driver = ElementUtil.launchBrowser(driver, "chrome");

		ElementUtil.launchURL(driver, url);
		
		ElementUtil.clickOn(driver, goBtn);
		
		String verify = "Hi";
		ElementUtil.getAlertVerifyText(driver, verify);
		
		driver.close();
		
	}

}
