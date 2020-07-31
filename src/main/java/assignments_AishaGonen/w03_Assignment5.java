package assignments_AishaGonen;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class w03_Assignment5 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://www.testandquiz.com/selenium/testing.html";
		By confirmBox = By.xpath("//button[contains(text(),'Generate Confirm Box')]");
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		Thread.sleep(2000);
		
		clickOn(driver, confirmBox);
		Thread.sleep(2000);
		
		getAlert(driver);

	}
	
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	
	public static void getAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();	
	}
	
}