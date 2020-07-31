package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import o1_SeleniumMethods.ElementUtil;

public class w03_Assignment1 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.testandquiz.com/selenium/testing.html";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
				
		WebElement select =  driver.findElement(By.id("testingDropdown"));
		WebElement askedElement = driver.findElement(By.id("database"));
		
		selectDropDownValueByText(driver, select, "Database Testing");
		
		verifySelected(askedElement);
		
	}
	
	public static WebElement getElement(WebDriver driver, WebElement select) {
		WebElement element = select;
		return element;
	}
	
	public static void selectDropDownValueByText(WebDriver driver, WebElement selects, String value) {
		WebElement element = getElement(driver, selects);
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void verifySelected(WebElement element) {
		String value = element.getText();
		if (element.isSelected()) {
			System.out.println(value + " is selected.");
		} else {
			System.out.println(value + " is NOT selected.");
		}		
	}
	
}


/*
	

*/
