package o1_SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oo39_Headless_Chrome {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");				// you have to use it that way: '--headless'. or it gives error. 
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://siliconelabs.com");
		
		System.out.println(driver.getTitle());


	}

}
 