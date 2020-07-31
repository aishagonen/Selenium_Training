package o1_SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class o6_AlertHandling1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/aishagonen/Documents/Drivers/chromedriver"); 

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Locator concept :
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert(); 	// calling alert interface
		
		String text = alert.getText();
		System.out.println(text);
		
		//verifying :
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

/* Outp: Please enter a valid user name
		 Correct text: Please enter a valid user name 

		*Alert class has 4 methods : 
		void accept();  --> If there is 'OK' on the alert frame use this method. It means ok.
		void dismiss(); --> If there is 'Cancel' on the alert frame use this method. It means cancel. 
	   	String getText(); --> String : gets text in the alert bok.
	   	void sendKeys(String keysToSend); --> sends any value 

	* Generic Methods : Common methods : we created ElementUtil class for these methods. 
	



*/
