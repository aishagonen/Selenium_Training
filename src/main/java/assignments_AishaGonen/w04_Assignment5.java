package assignments_AishaGonen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class w04_Assignment5 {
	
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://rahulshettyacademy.com/AutomationPractice/";
			
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Kral Shakir");
		
		clickOn(driver, By.xpath("//input[@id='confirmbtn']"));
		
		getAlertVerifyText(driver, "Hello Fil Necati, Are you sure you want to confirm?");
		
	}
	
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	
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
	
	
}
