package assignments_AishaGonen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class w04_Assignment2 {
	
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "http://the-internet.herokuapp.com/javascript_alerts";
			
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		clickOn(driver, By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		getAlertText(driver);
		getAlert(driver);
		
		clickOn(driver, By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		getAlertText(driver);
		getAlert(driver);
		
		clickOn(driver, By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		getAlertText(driver);
		getCancel(driver);
		
	}	
	
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	
	public static void getAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();			
	}

	public static void getCancel(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();	
	}
	
	public static String getAlertText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		return text;
	}
}
/* 
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();

		




*/