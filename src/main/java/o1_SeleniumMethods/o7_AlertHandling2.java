package o1_SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class o7_AlertHandling2 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aishagonen/Documents/Drivers/chromedriver"); 

		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);

//1.way:
//		getAlertText();

//2.way:
		if (ElementUtil.getAlertText(driver).equals("Please enter a valid user name")) {
			System.out.println("Correct text.");
		} else {
			System.out.println("Incorrect text.");
		}
		
		driver.quit();
		
	}
//Generic method === common methods :
//	public static String getAlertText() {				// in 2. way, we put this method in the ElementUtil class. 
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
//		return text;
//	}
	
		
}

/* 
  1.way - Outp: Please enter a valid user name 
  2.way - Outp: Please enter a valid user name
				Correct text.
*/







