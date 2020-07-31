package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oo34_JavaScript1 {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.drive","/Users/aishagonen/Documents/Drivers/chromedriver");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://darksky.net/");
		driver.manage().window().maximize();
		
		System.out.println(JavaScriptUtil.getTitleByJS(driver));  
		//'driver.getTitle();'i da kullanabilirdik. It is up to us. But if webpage is dynamic use JS.
		
		JavaScriptUtil.scrollPageDown(driver);
		
		JavaScriptUtil.specificScrollPageDown(driver);
		
		WebElement privacy = driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
		JavaScriptUtil.scrollIntoView(privacy, driver);
		
		JavaScriptUtil.clickElementByJS(privacy, driver);
		
		System.out.println(JavaScriptUtil.getPageInnerText(driver)); 	// Webpage'teki all information'u print eder. 
		 		
		JavaScriptUtil.refreshBrowserByJS(driver);						// sayfayi refresh eder. 

		JavaScriptUtil.generateAlert(driver, "This is sign up page.");	// to get more info when present the project or reminder for us.  
		
		
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		WebElement signupLink = driver.findElement(By.linkText("Sign up"));
		
		JavaScriptUtil.clickElementByJS(signupLink, driver);
		
		JavaScriptUtil.drawBorder(signupLink, driver);

		WebElement email = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		
		JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "kralshakir@gmail.com"); 		// use directly locator id.
		
		JavaScriptUtil.flash(email, driver);
		
		email.sendKeys("kralshakirr@gmail.com");
		
		JavaScriptUtil.flash(password, driver);
		
		password.sendKeys("lompenlompen");
		
		JavaScriptUtil.flash(loginBtn, driver);
		
		loginBtn.click();
		
		JavaScriptUtil.generateAlert(driver, "This is warning from the page");

		String browserInfo = JavaScriptUtil.getBrowserInfo(driver);
		System.out.println(browserInfo);
		
		
		
		
		
		
		

	}
	

}


/*		
		JavaScript :
			
		- JavaScript is regular java class but code is related with JavaScript Language. 
		
		- Blue prints are JavaScript. Not changable. Just understand and copy-paste. 
		
		- There are 2 diffrent main method under the JavaScriptExecutor. 
			1. executeAsyncScript.  	--> it is little complex. we won't use it. just use it for scroll-down.
			2. executeScript. 			--> we use it for frameworks. 
		
		- Selenium'da olmayan futurlari JSE'den kullaniyoruz.  	
	
		Why we use JavaScript :
		- If element doesn't respond we use JSE.
		- If we have dynamic or Ajax concept we use JSE. 
 			= Updated / live web pages --> Ajax. 
			= When refresh the page locators updated --> Dynamic.
			
			

*/







