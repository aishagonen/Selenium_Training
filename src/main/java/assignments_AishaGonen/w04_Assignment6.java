package assignments_AishaGonen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class w04_Assignment6 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://www.designmantic.com/";
			
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		verifyUrl(driver, url);
		clickOn(driver, By.xpath("//li[@class='login-link']//span[contains(text(),'Login')]"));
		sendKeys(driver, By.id("username"), "invalid@username.com");
		sendKeys(driver, By.id("password"), "invalidPassword");
		clickOn(driver, By.xpath("//input[@class='btn btn-md btn-color-1 btn-radius']"));
		verifyGetText(driver, By.xpath("//div[@class='alert alert-danger']"), "Bad credentials.");
		
	}
	
	public static void sendKeys(WebDriver driver, By locator, CharSequence... keys) {
		driver.findElement(locator).sendKeys(keys);
	}
	
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	
	public static void verifyGetText(WebDriver driver, By locator, String verifyText ) {
		String text = driver.findElement(locator).getText();
		if (text.equals(verifyText)) {
			System.out.println("Text is correct.");
		} else {
			System.out.println("Text is not correct.");
		}
	}
	
	public static void verifyUrl(WebDriver driver, String url) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if (currentUrl.equals(url)) {
			System.out.println("You are on the correct page.");
		} else {
			System.out.println("You are on the wrong page.");
		}
	}
	
}

/*

		String text = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		if (verifyText.equals("Bad credentials.")) {
			System.out.println("Text is correct.");
		} else {
			System.out.println("Text is not correct.");
		}

		
		
		
	}



*/