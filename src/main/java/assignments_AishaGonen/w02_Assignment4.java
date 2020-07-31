package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class w02_Assignment4 {

	public static  WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
		
		By xMark = By.cssSelector("#at-cv-lightbox-close");
		
		By valueA = By.xpath("//input[@id='sum1']");
		
		By valueB = By.xpath("//input[@id='sum2']");	
		
		By getTotal = By.xpath("//button[contains(text(),'Get Total')]");	
	
		driver = ElementUtil.launchBrowser(driver, "chrome");
		 
		ElementUtil.launchURL(driver, url);
		Thread.sleep(2000);

		ElementUtil.clickOn(driver, xMark);
		
		ElementUtil.getElement(driver, valueA).sendKeys("2");

		ElementUtil.getElement(driver, valueB).sendKeys("37");
		
		ElementUtil.clickOn(driver, getTotal);
		
		String total = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
		
		if (total.equals("39")) {
			System.out.println("Total value is correct.");
		} else {
			System.out.println("Total value is not correct.");
		}
		
	}

}
