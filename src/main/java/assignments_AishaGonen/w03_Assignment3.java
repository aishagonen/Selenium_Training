package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class w03_Assignment3 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.testandquiz.com/selenium/testing.html";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		WebElement dropDown = driver.findElement(By.id("testingDropdown"));
		
		Select	select = new Select(dropDown);
		
		multipleSingle(driver, dropDown, select);
		
	}
	
	public static void multipleSingle(WebDriver driver, WebElement locator, Select dropDown) {
		dropDown = new Select(locator);
		if (dropDown.isMultiple() == true) {
			System.out.println("Dropdown menu is multiple selected.");
		} else {
			System.out.println("Dropdown menu is single selected");
		}
	}
	
}
