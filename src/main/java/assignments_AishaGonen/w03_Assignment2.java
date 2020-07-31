package assignments_AishaGonen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class w03_Assignment2 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.testandquiz.com/selenium/testing.html";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		List<WebElement> selectList = findElements(driver, By.id("testingDropdown"));
			
		printOut(driver, selectList, By.id("testingDropdown")); 
		
	}
	
	public static void printOut(WebDriver driver, List<WebElement> list, By locator) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText()); 	
		}
	}
	
	public static List<WebElement> findElements(WebDriver driver, By locator) {
		List<WebElement> elements = driver.findElements(locator);
		return elements;
	}
	
}


