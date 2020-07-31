package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class oo29_ElementVisibility {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://classic.crmpro.com/register";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
	
		WebElement submitElement = driver.findElement(By.id("submitButton"));
		
		// isDisplayed   /  isEnabled   /  isSelected :
		
		System.out.println("Before submit button is enabled: ");
		System.out.println(submitElement.isDisplayed());		// outp: true
		System.out.println(submitElement.isEnabled());			// outp: false
		System.out.println("Line 26 is: " + driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected());  // outp: Line 26 is false
			
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
		
		System.out.println("After submit button is enabled: ");
		System.out.println(submitElement.isDisplayed());		// outp: true
		System.out.println(submitElement.isEnabled());			// outp: true
		System.out.println("Line 33 is: " + driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected());  // outp: Line 33 is true
	
		
	}
}
