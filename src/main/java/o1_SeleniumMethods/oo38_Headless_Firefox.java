package o1_SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oo38_Headless_Firefox {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");				// you have to use it that way: '--headless'. or it gives error. 
		
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://siliconelabs.com");
		
		System.out.println(driver.getTitle());


	}

}
