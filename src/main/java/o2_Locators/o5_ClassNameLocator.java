package o2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class o5_ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		Thread.sleep(3000);
		
/*		By username = By.className("form-control private-form__control login-email");
							   (-grandparentClass-    -parentClass-    -subClass-   ): aradaki space means now new different class.
		This is full className. We use last className -->  login-email. Also, we can use full className. But sometime it doesn't work. You need to find out. 
		
*/		
		By username = By.className("login-email");
		ElementUtil.getElement(driver, username).sendKeys("zekicanan@gmail.com");
		
		
		
		
		
		
		
	}

}
