package assignments_AishaGonen;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class w05_Assignment6 {

	public static WebDriver driver;
	public static String url;
	public static WebElement element;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "http://demo.guru99.com/test/newtours/register.php";
			
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.id("flow_close_btn_iframe")));
		WebElement element = driver.findElement(By.id("closeBtn"));
		JavaScriptUtil.clickElementByJS(element, driver);
		driver.switchTo().defaultContent();
				
		JavaScriptUtil.sendKeysUsingJSWithName(driver, "firstName", "Kral");
					
		JavaScriptUtil.sendKeysUsingJSWithName(driver, "lastName", "Shakir");
		
		JavaScriptUtil.sendKeysUsingJSWithName(driver, "phone", "11011010101");
	
		JavaScriptUtil.sendKeysUsingJSWithID(driver, "userName", "kralshakirr@gmail.com");
		
		JavaScriptUtil.sendKeysUsingJSWithName(driver, "address1", "11011 Lompen Street");
		
		JavaScriptUtil.sendKeysUsingJSWithName(driver, "city", "Lompen");
		
		JavaScriptUtil.sendKeysUsingJSWithName(driver, "state", "Lompen Island");
		
		JavaScriptUtil.sendKeysUsingJSWithName(driver, "postalCode", "111000");
		
		element = driver.findElement(By.name("country"));
		ElementUtil.selectDropDownValueByTextW(driver, element, "COTE D'IVOIRE");

		JavaScriptUtil.sendKeysUsingJSWithID(driver, "email", "kralshakir");
		
		JavaScriptUtil.sendKeysUsingJSWithName(driver, "password", "lompenlompen");
		
		JavaScriptUtil.sendKeysUsingJSWithName(driver, "confirmPassword", "lompenlompen");
		
		element = driver.findElement(By.name("submit"));
		JavaScriptUtil.clickElementByJS(element, driver);	
		
	}
}
