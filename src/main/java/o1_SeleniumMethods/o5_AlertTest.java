package o1_SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class o5_AlertTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aishagonen/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct text: " + text);
		} 
		else {
			System.out.println("Incorrect text: " + text);
		}
		
		alert.accept(); 	// If there is 'OK' on the alert frame use this method. It means ok.
		//alert.dismiss();	// If there is 'Cancel' on the alert frame use this method. It means cancel. 
		
		driver.quit();
		

	}

}
