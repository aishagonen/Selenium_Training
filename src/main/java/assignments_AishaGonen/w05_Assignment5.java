package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class w05_Assignment5 {

	public static WebDriver driver;
	public static String url;
	public static WebElement element;
	
	public static void main(String[] args) {
		
		url = "http://demo.guru99.com/test/ajax.html";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		element = driver.findElement(By.id("yes"));
		JavaScriptUtil.clickElementByJS(element, driver);
		
		element = driver.findElement(By.xpath("//body/div[@class='container']/form/p/input[1]"));
		JavaScriptUtil.clickElementByJS(element, driver);
		
		element = driver.findElement(By.id("no"));
		JavaScriptUtil.clickElementByJS(element, driver);
		
		element = driver.findElement(By.id("buttoncheck"));
		JavaScriptUtil.clickElementByJS(element, driver);
		
	}

}
