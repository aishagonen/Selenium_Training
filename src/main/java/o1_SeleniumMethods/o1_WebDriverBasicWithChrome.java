package o1_SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class o1_WebDriverBasicWithChrome {

	public static void main(String[] args) {

/*  How to define WebDriver on the code level? First;
	* Set  property : Property concept is in Java not relate in the Selenium.
					 We will use system file. System file is one of the main files in Java. It provides property concept. */ 

		System.setProperty("webdriver.chrome.driver","/Users/aishagonen/Documents/Drivers/chromedriver"); 	//key is driver & value is driver's path
		
// Set browser : 	
		
		WebDriver driver = new ChromeDriver();

// Lunch browser :
		
		driver.get("https://learnsdet.com/");

// Get title from the system : 
		
		String title = driver.getTitle();
		System.out.println(title);
		
// Create a logic to see if the title you get is correct :
		
		if (title.equals("Best Certified SDET Training program - SiliconeLabs")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is not correct.");
		}
		
// Check the URL is correct or not :
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.equals("https://learnsdet.com/")) {
			System.out.println("URL is correct");
		}
		else {
			System.out.println("URL is not correct.");
		}
		
		//System.out.println(driver.getPageSource());
		
		driver.close(); 	// closes current browser.
		//driver.quit(); 	 // closes all browsers.
		
// Parallel execution means --> At the same time you can open multiple browsers.  		
		
	}

}

















