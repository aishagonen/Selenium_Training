package o1_SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class o3_WebDriverManager {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();

		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		
	}

}
/* 
 Webdrive manager developed by Boni Garcia. 
 Webdrive manager is not a part of Selenium. This is an alternatif usage.  
 
 */