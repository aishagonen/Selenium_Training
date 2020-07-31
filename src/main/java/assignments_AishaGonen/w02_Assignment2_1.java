package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class w02_Assignment2_1 {

	public static  WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
					
		 url = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
		
		By goButton = By.xpath("//button[@class='btn btn-default']");
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		
		ElementUtil.launchURL(driver, url);
		
		ElementUtil.clickOn(driver, goButton);
		
		String verify = "Hi";
		ElementUtil.getAlertVerifyText(driver, verify);
		
		driver.close();

		
	}

}
