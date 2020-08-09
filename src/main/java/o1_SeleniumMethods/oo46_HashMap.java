package o1_SeleniumMethods;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class oo46_HashMap {

		public static void main(String[] args) {
			
			Map<String, String> userMap = new HashMap<String, String>();
			userMap.put("admin", "admin");
			userMap.put("patient", "tom@gmail.com_123456Test");
			userMap.put("doctor", "peter@gmail.com_test123456");
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://app.hubspot.com/login");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
//			driver.findElement(By.id("username")).sendKeys(userMap.get("doctor").split("_")[0]);
//			driver.findElement(By.id("password")).sendKeys(userMap.get("doctor").split("_")[1]);
			
			
			doLogin(driver, getUsermap(), "patient");

		}
		
		public static Map<String, String> getUsermap(){
			Map<String, String> userMap = new HashMap<String, String>();
			userMap.put("admin", "admin");
			userMap.put("patient", "tom@gmail.com_123456Test");
			userMap.put("doctor", "peter@gmail.com_test123456");
			
			return userMap;
		}
		
		public static void doLogin(WebDriver driver, Map<String, String> userMap, String userKey) {
			driver.findElement(By.id("username")).sendKeys(userMap.get(userKey).split("_")[0]);
			driver.findElement(By.id("password")).sendKeys(userMap.get(userKey).split("_")[1]);
		}

		
	}
	
	
	

