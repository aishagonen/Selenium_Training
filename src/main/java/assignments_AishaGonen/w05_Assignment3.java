package assignments_AishaGonen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class w05_Assignment3 {

	public static WebDriver driver;
	public static String url;
	public static WebElement element;
	public static WebElement frameElement;
	public static By locator;
	public static String expectedText;
	public static String actualText;
	
	public static void main(String[] args) {

		url = "http://demo.guru99.com/payment-gateway/process_purchasetoy.php";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.id("flow_close_btn_iframe")));		
		WebDriverWait wait  = new WebDriverWait(driver, 15);		
		element = driver.findElement(By.id("closeBtn"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		JavaScriptUtil.clickElementByJS(element, driver);
		driver.switchTo().defaultContent();
		
		
		JavaScriptUtil.sendKeysUsingJSWithID(driver, "card_nmuber", "1010101010");
		
		locator = By.id("month");
		ElementUtil.selectDropDownValueByIndex(driver, locator, 5);
		
		locator = By.id("year");
		ElementUtil.selectDropDownValueByIndex(driver, locator, 2);

		JavaScriptUtil.sendKeysUsingJSWithID(driver, "cvv_code", "123");
		
		element = driver.findElement(By.name("submit")); 
		JavaScriptUtil.clickElementByJS(element, driver);
		
		expectedText = "Check card number is 16 digits!";
		ElementUtil.getAlertVerifyText(driver, expectedText);
	
	}
	

}
