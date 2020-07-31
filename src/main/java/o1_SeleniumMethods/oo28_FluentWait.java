package o1_SeleniumMethods;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class oo28_FluentWait {
	
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://www.softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		driver.findElement(By.xpath("//button[contains(text(), 'Click Me - Fluent Wait')]"));

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(30))
									.pollingEvery(Duration.ofSeconds(2))
									.ignoring(NoSuchElementException.class,ElementNotVisibleException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {     				// 'fluent wait'te 'apply method'u implement ediyoruz. 
				WebElement element = driver.findElement(By.id("demo"));
				String getTextPage = element.getText();
				if (getTextPage.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println("Text: " + getTextPage);
					return element;
				} else {
					System.out.println("Title is wrong...");
					return null;
				}
			}	
		});
	
	}
	
}

/*
		Fluent Wait : 
		
		- In Cucumber we will use FW.
		- FW is used to tell the web driver to wait for a condition, as well as the frequency with which want to check 
		  the condition before throwing an 'ElementNotVisibleException'.  
		- FW defines the maximum amount of time for Selenium WebDriver.  
		- 
		
						Synchronization in Selenium WebDriver 
			    ____________________________________________________________
			  /																 \
			 |																  |
		Unconditional							 ______________ Conditional Synchronization __________
			 |								   /				  |                  |                 \       
			 |								  |					  |					 |					|	
		Thread.sleep() 					Implicit  Wait		Explicit Wait		Fluent Wait		Page Load Time Out			
		
		


*/