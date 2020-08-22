package o1_SeleniumMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	/**
	 * it provides remarkable elements / when you present project to customer you can use it
	 * @param element
	 * @param driver
	 */
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 20; i++) {									// 'i<20' means 20 kere yanip soner. you can change it. 
			changeColor("rgb(0,200,0)", element, driver);				// 'rgb(0,200,0)' is color code. you can change it.
			changeColor(bgcolor, element, driver);
		}
	}
	
	/**
	 * it is related the flash method.
	 * @param color
	 * @param element
	 * @param driver
	 */
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

	/**
	 * 
	 * @param element
	 * @param driver
	 */
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	/**
	 * 
	 * @param driver
	 * @param message
	 */
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	/**
	 * 
	 * @param element
	 * @param driver
	 */
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

	/**
	 * 
	 * @param driver
	 */
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	/**
	 * 
	 * @param driver
	 * @return
	 */
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	/**
	 * it is for all text in the page, like 'getText()' method.
	 * @param driver
	 * @return
	 */
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}

	/**
	 * it goes to bottom of the page
	 * @param driver
	 */
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	/**
	 * it goes down but at the specific location
	 * @param driver
	 */
	public static void specificScrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("scroll(0, 750);");
	}

	/**
	 * it goes down to the element
	 * @param element
	 * @param driver
	 */
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public static String getBrowserInfo(WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String uAgent = js.executeScript("return navigator.userAgent;").toString();     
		return uAgent;
	}
	
	/**
	 * 
	 * @param driver
	 * @param id
	 * @param value
	 */
	public static void sendKeysUsingJSWithID(WebDriver driver, String id, String value){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementById('" + id + "').value='"+value+"'");
	}
	
	/**
	 * 
	 * @param driver
	 * @param className
	 * @param value
	 */
	public static void sendKeysUsingJSWithClassName(WebDriver driver, String className, String value){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementsByClassName('" + className + "').value='"+value+"'");
	}
	
	/**
	 * 
	 * @param driver
	 * @param name
	 * @param value
	 */
	public static void sendKeysUsingJSWithName(WebDriver driver, String name, String value){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementsByName('" + name + "')[0].value='"+value+"'");
	}

}


/*






*/