package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class oo12_DropDown1 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.facebook.com/";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

//Select :

// 1. way :
		
		Select	select1 = new Select(day);
		select1.selectByVisibleText("11");
		Select	select2 = new Select(month);
		select2.selectByVisibleText("May");
		Select	select3 = new Select(year);
		select3.selectByVisibleText("2011");
 
// 2. way : 		
		
		selectDropDownValueByText(day, "11");
		selectDropDownValueByText(month, "May");
		selectDropDownValueByText(year, "2011");
		 
	}
	
	public static void selectDropDownValueByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
}

/*
		- '<select...' means it has options in the HTML.
	
		- Select class has methods such as :
		
		 	- selectByVisibleText();
		 	- selectByIndex();
		 	- selectByValue();
		 	- deselectByVisibleText()
			- deselectByIndex();
			- deselectByValue();
			- deselectAll();
			- getAllSelectedOptions();
			- getFirstSelectedOption();
	
	
	
	

*/