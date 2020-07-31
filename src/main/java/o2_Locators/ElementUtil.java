package o2_Locators;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.xerces.internal.dom.CoreDOMImplementationImpl;

public class ElementUtil {

	/***
	 * 
	 * @param driver
	 */
	public static void allCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
		
	}

	/**
	 * click on element / to click locator
	 * 
	 * @param driver
	 * @param locator
	 */
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}

	/**
	 * @author aishagonen
	 * @param driver
	 * @param locator
	 */
	public static void clickOnW(WebDriver driver, WebElement locator) {
		locator.click();	
	}

	/**
	 * close browser
	 * 
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}

	/**
	 * @author aishagonen
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement findElement(WebDriver driver, By locator) {
	     WebElement element = driver.findElement(locator);
	     return element;
	}
	
	/**
	 * @author aishagonen
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static List<WebElement> findElements(WebDriver driver, By locator) {
		List<WebElement> elements = driver.findElements(locator);
		return elements;
	}

	/**
	 * @author aishagonen
	 * @param driver
	 */
	public static void getAlert(WebDriver driver) {
			Alert alert = driver.switchTo().alert();
			alert.accept();			
	}

	/**
	 * This method is used to get text and handle alert
	 * 
	 * @param driver
	 * @return
	 */
	public static String getAlertText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}
	
	/**
	 * @author wednesdayGroup
	 * @param driver
	 */
	public static void getAlertVerifyText(WebDriver driver, String verify) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert text is: " + text);
		if(text.equals(verify)){
			System.out.println("Your text is correct.");
		}else{
			System.out.println("Your text is incorrect.");
		}
		alert.accept();
	}
	
	/**
	 * @author aishagonen
	 * @param driver
	 */
	public static void getCancel(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();	
	}
	
	/**
	 * 
	 * @param driver
	 * @param beforeXpath
	 * @param afterXpath
	 */
	public static void getColumnData(WebDriver driver, String beforeXpath, String afterXpath) {	
		for (int rowNum = 0; rowNum <= getTableCount(driver); rowNum++) {
			String actualXpath = beforeXpath + rowNum + afterXpath;
			System.out.println(actualXpath);
			String text = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(text);
		}	
	}
	
	/**
	 * 
	 * @param driver
	 * @param beforeXpath
	 * @param afterXpath
	 * @return
	 */
	public static ArrayList<String> getColumnDataList(WebDriver driver, String beforeXpath, String afterXpath) {	
		ArrayList<String> data = new ArrayList<String>();
		for (int rowNum = 0; rowNum <= getTableCount(driver); rowNum++) {
			String actualXpath = beforeXpath + rowNum + afterXpath;
			System.out.println(actualXpath);
			String text = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(text);
			data.add(text);
		}
		return data;
	}
	
	/**
	 * get element
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	/**
	 * @ aaa
	 * @param driver
	 * @param select
	 * @return
	 */
	public static WebElement getElementW(WebDriver driver, WebElement locator) {
		WebElement element = locator;
		locator.click();
		return element;
	}
	
	public static WebElement getElementWait(WebDriver driver, By locator) {	
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element; 
	}	
	
	public static WebElement getElementWaitTime(WebDriver driver, By locator, int timeout ) {	
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element; 
	}
	
	
	
	/**
	 * 
	 * @param driver
	 */
	public static void getMaximize(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	
	/**
	 * @author aishagonen
	 * @param driver
	 */
	public static void getOk(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();	
	}
	
	/**
	 * Get title
	 * 
	 * @param driver
	 * @return
	 */
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	/**
	 * 
	 * @param driver
	 * @throws IOException
	 */
	public static void getScreenShot(WebDriver driver) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("/Users/aishagonen/Desktop/ScreenShot/pic.png"));
		
		
	}
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public static int getTableCount(WebDriver driver) {
		List<WebElement> rowList = driver.findElements(By.xpath("[@id=\'customers\']//tr"));
		int rowCount = rowList.size();
		return rowCount;
	}
	/**
	 * Lauch browser
	 * 
	 * @param driver
	 * @param browserName
	 * @return
	 */
	public static WebDriver launchBrowser(WebDriver driver, String browserName) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/aishagonen/Documents/Drivers/chromedriver"); 
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/aishagonen/Documents/Drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Browser is not avaiilable: " + browserName);
		}
		return driver;
	}

	/**
	 * get URL
	 * 
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url) {
		driver.get(url);
	}
	
	/**
	 * mouse over
	 * @param driver
	 * @param locator
	 */
	public static void mouseOver(WebDriver driver, By locator) {
		Actions action = new Actions(driver);
		WebElement mouseOverAction = driver.findElement(locator);
		action.moveToElement(mouseOverAction).perform();
	}
	
	/**
	 * aaa
	 * @param driver
	 * @param locator
	 * @param locatorClicked
	 */
	public static void mouseOverClick(WebDriver driver, By locator, WebElement locatorClicked) {
		Actions action = new Actions(driver);
		WebElement mouseOverAction = driver.findElement(locator);
		action.moveToElement(mouseOverAction).click(locatorClicked).build().perform();
		
	}
	
	/**
	 * @author aishagonen
	 * @param driver
	 * @param locator
	 * @param dropDown
	 */
	public static void multipleSingle(WebDriver driver, WebElement locator, Select dropDown) {
		dropDown = new Select(locator);
		if (dropDown.isMultiple() == true) {
			System.out.println("Dropdown menu is multiple selected.");
		} else {
			System.out.println("Dropdown menu is single selected");
		}
	}

	/**
	 * @author aishagonen
	 * @param linkList
	 */
	public static void printAllLinks(List<WebElement>linkList) { // includes empty links.
		for (int i = 0; i < linkList.size(); i++) {
			String text = linkList.get(i).getText();
			System.out.println(text);
		}
	}

	/**
	 * @author aishagonen
	 * @param linkList
	 */
	public static void printAvailableLinks(List<WebElement>linkList) { // not includes empty links, only available links.
		for (int i = 0; i < linkList.size(); i++) {
			String text = linkList.get(i).getText();
			if (!text.isEmpty()) {  	
				System.out.println(text);
			}
		}
		
	}

	/**
	 * @author aishagonen
	 * @param driver
	 * @param list
	 * @param locator
	 */
	public static void printOutList(WebDriver driver, List<WebElement> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText()); 	
		}
	}
	
	/**
	 * quit browser
	 * 
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	/**
	 * aaa
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropDownValueByIndex(WebDriver driver, By locator, int value) {
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByIndex(value);	
	}
	
	/**
	 * 
	 * @param element
	 * @param value
	 */
	public static void selectDropDownValueByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	/**
	 * aaa
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropDownValueByTextW(WebDriver driver, WebElement locator, String value) {
		WebElement element = getElementW(driver, locator);
		Select select = new Select(element);
		select.selectByVisibleText(value);	
	}	
	
	/**
	 * aaa
	 * @param driver
	 * @param value
	 */
	public static void selectMultipleValue(WebDriver driver, List<WebElement> element, String... value) { // 'String...' args consept. cunku birden fazla value sececegiz. 
		List<WebElement> dropList = element;
		System.out.println(dropList.size());
		
		for(int i = 0; i < dropList.size(); i++){
			String text = dropList.get(i).getText();
			System.out.println(text);

			// to select multiple value we use Array concept :  Single value icin we don't need that, cuz only one value sectik. But now multiple value sececegiz.  		
			for (int j = 0; j < value.length; j++) {
				try {
					if(!text.isEmpty()){
						if(text.equals(value[j])){
							dropList.get(i).click();
							break;
						}
					}
				} catch (Exception e) {}
			}	
		}			
	}
	
	/**
	 * aaa
	 * @param driver
	 * @param value
	 * @throws InterruptedException 
	 */
	public static void selectSingleValue(WebDriver driver, By element,  String value) throws InterruptedException {
		List<WebElement> dropList = findElements(driver, element); //option'larin listesinin locator'i 
		Thread.sleep(5000);
		for(int i = 0; i < dropList.size(); i++){
			String text = dropList.get(i).getText();
					if(text.equals(value)){
						System.out.println(text);
						dropList.get(i).click();
						System.out.println(text + " is selected.");
						break;
					} //else {System.out.println("Not selected.");}
		}	
	}
	
	/**
	 * This method is used to send characters into a textbox
	 * @author cemilkoch
	 * @param driver
	 * @param locator
	 * @param keys
	 */
	public static void sendKeys(WebDriver driver, By locator, CharSequence... keys) {
		driver.findElement(locator).sendKeys(keys);
	}
	
	/**
	 * @author aishagonen
	 * @param driver
	 * @param locator
	 * @param key
	 */
	public static void sendKeys(WebDriver driver, By locator, String key) {
		driver.findElement(locator).sendKeys(key);
		
	}
	
	/**
	 * @author aishagonen
	 * @param driver
	 * @param destination
	 * @throws IOException
	 */
	public static void simpleScreenShot(WebDriver driver, String destination) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(destination));
	}

	/**
	 *
	 * @param driver
	 * @param text
	 * @param locator
	 * @param verifyText
	 */
	public static void verifyGetText(WebDriver driver, By locator, String verifyText ) {
		String text = driver.findElement(locator).getText();
		if (text.equals(verifyText)) {
			System.out.println("Text is correct.");
		} else {
			System.out.println("Text is not correct.");
		}
	}	
	
	/**
	 * @author aishagonen
	 * @param driver
	 * @param locator
	 * @param verifyText
	 */
	public static void verifyGetTextW(WebDriver driver, WebElement locator, String verifyText ) {
		String text = locator.getText();
		if (text.equals(verifyText)) {
			System.out.println("Text is correct.");
		} else {
			System.out.println("Text is not correct.");
		}
	}
	
	/**
	 * @author aishagonen
	 * @param element
	 */
	public static void verifySelected(WebElement element) {
		String value = element.getText();
		if (element.isSelected()) {
			System.out.println(value + " is selected.");
		} else {
			System.out.println(value + " is NOT selected.");
		}
	}

	/**
	 * @author aishagonen
	 * @param driver
	 * @param url
	 */
	public static void verifyUrl(WebDriver driver, String url) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if (currentUrl.equals(url)) {
			System.out.println("You are on the correct page.");
		} else {
			System.out.println("You are on the wrong page.");
		}
	}

	public static void waitForPresenceOfElement(WebDriver driver, By locator, int timeout) {	
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	}
	
	
}


/*
  	 * Generic methods are in this class.
	 * ElementUtil class is Utilities class. You can give any name it.
	 * We create common methods for all test cases.
	 * We can use these methods again and again. Polymorphism.
	 * We define all common methods in Selenium in this class. 
	 * For example; getAlert(), click(), sendKeys(), launchUrl()..etc. 
	   These are common methods. If we need it we can call the method from here and use it. 
	   Very practical.
 
 */