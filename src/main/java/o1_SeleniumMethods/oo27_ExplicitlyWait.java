package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class oo27_ExplicitlyWait {
	
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://www.app.hubspot.com/login";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
//for non-element:
		WebDriverWait wait  = new WebDriverWait(driver, 15);		
	   
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		System.out.println("Title is: " + driver.getTitle());

		
		
		
// for element:			
		By email =  By.id("username");
		By password =  By.id("password");
		By loginBtn =  By.id("loginBtn");
		
		//WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(email));
				
		getElementWait(driver, email).sendKeys("mirket@gmail.com");
		getElementWait(driver, password).sendKeys("eureka!");
		getElementWait(driver, loginBtn).click();

		getElementWaitTime(driver, email, 5).sendKeys("mirket@gmail.com");
		getElementWaitTime(driver, password,2).sendKeys("eureka!");
		getElementWaitTime(driver, loginBtn,1).click();
		
		
		
	}
	
	
	public static WebElement getElementWait(WebDriver driver, By locator) {	
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element; 
	}
	
	public static WebElement getElementWaitTime(WebDriver driver, By locator, int timeout ) {	
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element; 
	}
	
	public static void waitForPresenceOfElement(WebDriver driver, By locator, int timeout) {	
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	}
	
	public static WebElement waitGetElement(WebDriver driver, By locator, int timeout ) {	
		waitForPresenceOfElement(driver,locator, timeout);
		WebElement element = driver.findElement(locator);
		return element; 
	}	
}

/*

		Explicitly Wait :
		
		- In TestNG we will use EW. 
		- EW is applicable to only a certain element which is specific to a certain condition. 
		- EW is used when you are not aware of the time of element visibility. It's subjected to  dynamic nature. 
		- In explicit, we can specify the wait based on a specific condition. 
		- EW represents defined code for certain conditions or behaviors to occur /happen before continued to the next step. 
		- EW is in the WebdriverWait interface. 
		- EW / WebDriverWait works with elements and non-elements. 
				
			How to define EW :
			- WebDriverWait wait  = new WebDriverWait wait(driver, 10);
			  wait.until(driver ->  driver.findElement(locator);
			  wait.until(ExpectedConditions.elementToBeClickable(locator));
			

						Synchronization in Selenium WebDriver 
			    ____________________________________________________________
			  /																 \
			 |																  |
		Unconditional							 ______________ Conditional Synchronization __________
			 |								   /				  |                  |                 \       
			 |								  |					  |					 |					|	
		Thread.sleep() 					Implicit  Wait		Explicit Wait		Fluent Wait		Page Load Time Out			
		
		
			


*/