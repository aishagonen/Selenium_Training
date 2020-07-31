package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class oo13_DropDown2 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.facebook.com/";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);

		By day =  By.id("day");
		By month =  By.id("month");
		By year =  By.id("year");
		
		selectDropDownValueByText(driver, day, "15");
		selectDropDownValueByText(driver, month, "Jun");
		selectDropDownValueByText(driver, year, "2015");
		
	}
	
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public static void selectDropDownValueByText(WebDriver driver, By locator, String value) {
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByVisibleText(value);	
	}
	
	
	
}
