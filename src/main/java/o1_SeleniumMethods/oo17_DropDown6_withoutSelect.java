package o1_SeleniumMethods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class oo17_DropDown6_withoutSelect {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.facebook.com/";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
	
//  		
		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']/option"));
	
		System.out.println(dayList.size()); 
		
		for (int i = 0; i < dayList.size(); i++) {
			System.out.println(dayList.get(i).getText()); 		//to see all values. 
			
			String text = dayList.get(i).getText();				// to see just specific index's value. 
			
			if (text.equals("9")) {
				dayList.get(i).click();  	 // when it gets the the value, it clicked. So we can see the webpage day 9 is selected. 
				break;						// if we don't put break, it prints all the other values on the console. Now it stops at 9. 
			}
		}

	}

}
/*
	- Interview Question :
		Q: How to handle drop down menu without Select class? 
		A: using 'findElements();' method + for loop. 
	
	- //select[@id='day]/option --> id ile xpaath alirken '/option' kismini yazmiyorduk.
									 Burada butun option'larin listesini istedigimiz icin '/option' kismini da yaziyoruz. 
	
	- For this consept you must use xpath. 
	
	
	
*/