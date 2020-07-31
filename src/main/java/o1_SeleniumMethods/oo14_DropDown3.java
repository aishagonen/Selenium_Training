package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class oo14_DropDown3 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.facebook.com/";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);

// 1.way : 
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select	select1 = new Select(day);
		select1.selectByIndex(7);
		
		Select	select2 = new Select(month);
		select2.selectByIndex(7);
		
		Select	select3 = new Select(year);
		select3.selectByIndex(7);
	
	}

}