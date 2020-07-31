package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class oo15_DropDown4 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.facebook.com/";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
// 2. way :	
		
		By day =  By.id("day");
		By month =  By.id("month");
		By year =  By.id("year");
		
		selectDropDownValueByIndex(driver, day, 7);
		selectDropDownValueByIndex(driver, month, 7);
		selectDropDownValueByIndex(driver, year, 7);
	
	}
	
	public static void selectDropDownValueByIndex(WebDriver driver, By locator, int value) {
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByIndex(value);	
	}
	
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

}
