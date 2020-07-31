package o1_SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class o4_Navigate {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");				// google
		
		driver.navigate().to("https://www.amazon.com");		// amazon
		Thread.sleep(2000); 								// MS==2 sec
		
		driver.navigate().back(); 							// google
		Thread.sleep(2000); 
		
		driver.navigate().forward();						// amazon
		Thread.sleep(2000);
		
		driver.navigate().back(); 							// google
		Thread.sleep(2000);
		
		driver.navigate().refresh();						//google
		
		driver.quit();
		
		 
	}

}

/* 	
Interview Question :
	Q- What is the differences betw Get and Navigate function? 
	A- 'Get' navigates to a webpage. Webdriver will wait until the page has fully 
	loaded before returning control  script. Get function doesn't have any method. 
	'Navigate', navigates URL. Webdriver will not wait the page has fully loaded. 
	Navigate function has different methods such as back, forward, refresh.  
		
*/
















