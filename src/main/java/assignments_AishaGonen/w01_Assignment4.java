package assignments_AishaGonen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class w01_Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");				// google
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.learnsdet.com");	// learnsdet
		Thread.sleep(3000); 								
		
		driver.navigate().back(); 							// google
		Thread.sleep(3000); 
		
		driver.navigate().forward();						// learnsdet
		Thread.sleep(3000);
		
		driver.navigate().back(); 							// google
		Thread.sleep(3000);
		
		driver.navigate().refresh();						//google
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
