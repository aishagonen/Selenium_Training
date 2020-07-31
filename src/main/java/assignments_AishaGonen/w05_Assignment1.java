package assignments_AishaGonen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class w05_Assignment1 {

	public static WebDriver driver;
	public static String url;
	public static WebElement element;
	
	public static void main(String[] args) {
		
		url = "http://demo.guru99.com/insurance/v1/index.php";
				
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavaScriptUtil.sendKeysUsingJSWithID(driver, "email", "kralshakirr@gmail.com");
		JavaScriptUtil.sendKeysUsingJSWithID(driver, "password", "lompen");
		
		element = driver.findElement(By.name("submit"));
		JavaScriptUtil.clickElementByJS(element, driver);
		
		element = driver.findElement(By.xpath("//b[contains(text(),'Enter your Email address and password correct')]"));
		String expectedText = "Enter your Email address and password correct";
		
		JavaScriptUtil.getVerifyTextByJS(driver, element, expectedText);
	
	}
	
//	public static void getVerifyTextByJS(WebDriver driver, WebElement element, String expectedText ) {
//		String text = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML", element);
//		if (text.equals(expectedText)) {
//			System.out.println("Text is correct.");
//		} else {
//			System.out.println("Text is not correct.");
//		}
//	}	
	
}








