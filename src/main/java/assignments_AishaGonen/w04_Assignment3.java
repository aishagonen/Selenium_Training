package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class w04_Assignment3 {
	
	public static WebDriver driver;
	public static String url;
	public static By element;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://rahulshettyacademy.com/AutomationPractice/";
			
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		element = By.xpath("//select[@id='dropdown-class-example']");
		WebElement selects  = driver.findElement(element);
		
		waitGetElement(driver, element, 10);

		selectDropDownValueByTextW(driver, selects, "Option1");
					
		Select	dropDown = new Select(selects);
		multipleSingle(selects, dropDown);
		
	}
	
	public static WebElement getElementW(WebDriver driver, WebElement locator) {
		WebElement element = locator;
		locator.click();
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
	
	public static void selectDropDownValueByTextW(WebDriver driver, WebElement locator, String value) {
		WebElement element = getElementW(driver, locator);
		Select select = new Select(element);
		select.selectByVisibleText(value);	
	}
	
	public static void multipleSingle(WebElement locator, Select dropDown) {
		dropDown = new Select(locator);
		if (dropDown.isMultiple() == true) {
			System.out.println("Dropdown menu is multiple selected.");
		} else {
			System.out.println("Dropdown menu is single selected");
		}
	}
	
}

/*
		Select	dropDown = new Select(select);	
		if (dropDown.isMultiple() == true) {
			System.out.println("Multiple items are selected");
		} else {
			System.out.println("Single item is selected");
		}







*/