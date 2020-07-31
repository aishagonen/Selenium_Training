package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class w05_Assignment4 {
	
	public static WebDriver driver;
	public static String url;
	public static WebElement element;
	
	public static void main(String[] args) {
	
		url = "http://demo.guru99.com/test/upload/";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		element = driver.findElement(By.id("uploadfile_0"));
		String fileName = "/Users/aishagonen/Desktop/Selenium/Selenium_Interview/Selenium_Interview_01.pdf";

		uploadFile(element, fileName);
		
		element = driver.findElement(By.id("terms"));
		JavaScriptUtil.clickElementByJS(element, driver);
		
		element = driver.findElement(By.id("submitbutton"));
		JavaScriptUtil.clickElementByJS(element, driver);
		
	}
	
	public static void uploadFile(WebElement element, String fileName) {
		element.sendKeys(fileName);
	}
	
}
