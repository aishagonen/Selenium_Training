package o1_SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oo22_ChromeOptions {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().browserVersion("81.0.4044.69").setup(); // My chrome browser version is 83, but we want to use another version. 
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.facebook.com/");
 
		
		
		
		
	}

}


/*
	
	Chrome Options:
	
	- it's a class that comes from openqa.selenium. 
	- it has a lot of methods. 
	
	
	
	
	
	
	
	
	
	
	

*/