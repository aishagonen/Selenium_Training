package o1_SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class o2_WebDriverBasicWithFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/aishagonen/Documents/Drivers/geckodriver");

// Set browser :

		WebDriver driver = new FirefoxDriver();

// Lunch browser :

		driver.get("https://learnsdet.com/");

// Get title from the system :

		String title = driver.getTitle();
		System.out.println(title);

// Create a logic to see if the title you get is correct :

		if (title.equals("Best Certified SDET Training program - SiliconeLabs")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct.");
		}

// Check the URL is correct or not :

		String url = driver.getCurrentUrl();
		System.out.println(url);

		if (url.equals("https://learnsdet.com/")) {
			System.out.println("URL is correct");
		} else {
			System.out.println("URL is not correct.");
		}

//Closing : 
		
		//driver.close(); // closes current browser.
		//driver.quit(); // closes all browsers.

	}

}
