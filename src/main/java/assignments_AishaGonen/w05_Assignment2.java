package assignments_AishaGonen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class w05_Assignment2 {

	public static WebDriver driver;
	public static String url;
	public static WebElement element;
	public static String expectedText;
	public static String actualText;
	
	public static void main(String[] args) {
		
		url = "http://demo.guru99.com/payment-gateway/index.php";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.switchTo().frame(driver.findElement(By.id("flow_close_btn_iframe")));		
//		element = driver.findElement(By.id("closeBtn"));
//		JavaScriptUtil.clickElementByJS(element, driver);
//		driver.switchTo().defaultContent();
		
		expectedText = "Price: $20";
		element = driver.findElement(By.tagName("h3"));
		JavaScriptUtil.getVerifyTextByJS(driver, element, expectedText);
		
		element = driver.findElement(By.tagName("select"));
		ElementUtil.selectDropDownValueByTextW(driver, element, "3");
		
		element = driver.findElement(By.tagName("input"));
		JavaScriptUtil.clickElementByJS(element, driver);
		
		expectedText = " $60.00";
		element = driver.findElement(By.xpath("//font[contains(text(),'$60.00')]"));
		JavaScriptUtil.getVerifyTextByJS(driver, element, expectedText);
		
		
		expectedText = "Pay $60.00";
		element = driver.findElement(By.name("submit"));		
		actualText = element.getAttribute("value");

		Assert.assertEquals(actualText, expectedText); 
		// or 
		verifyText(actualText, expectedText);
		
	}
	
	public static void verifyText(String actualText, String expectedText) {
		if (actualText.equals(expectedText)) {
			System.out.println("Final price is correct.");
		} else {
			System.out.println("Do the math! Final price is not correct");
		}	
	}
}
/*
		
	- Asagidaki iki method da attributun textini veriyor. '.getText()'le alamadigim yerlerde bunlari kullaniyorum. 
		
			System.out.println(element.getAttribute("value"));
			
			System.out.println(element.getCssValue("value"));
			
	- Assert.assertEquals(actualText, expectedText); methodu AssertionError  throw etmiyorsa esitlik dogrudur.
		
		

*/
