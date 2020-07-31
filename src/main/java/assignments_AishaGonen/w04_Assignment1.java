package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class w04_Assignment1 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "http://the-internet.herokuapp.com/dynamic_loading/1";
			
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		ElementUtil.clickOn(driver, By.xpath("//button[contains(text(),'Start')]"));

		System.out.println(getElementWaitVisibility(driver, By.xpath("//h4[contains(text(),'Hello World!')]"), 20).getText());
		verifyDisplayed(driver, By.xpath("//h4[contains(text(),'Hello World!')]"));			
	}
	
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	
	public static WebElement getElementWaitVisibility(WebDriver driver, By locator, int timeout ) {	
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element; 
	}
	
	public static void verifyDisplayed(WebDriver driver, By locator) {
		WebElement msg = driver.findElement(locator);
		if(msg.isDisplayed()) {
			System.out.println(msg.getText() + " is displayed.");
		} else {
			System.out.println("Not displayed." );
		}
	}
	
}



/* 
		WebElement msg = driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		
		if(msg.isDisplayed()) {
			System.out.println(msg.getText() + " is displayed.");
		} else {
			System.out.println("Not displayed." );
		}
	

*/