package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class w02_Assignment3 {

	public static  WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException{
		
		url= "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
		
		By xMark = By.cssSelector("#at-cv-lightbox-close");
		
		By message = By.xpath("//input[@id='user-message']");
		
		By showMsg = By.xpath("//button[contains(text(),'Show Message')]");
		 
		driver = ElementUtil.launchBrowser(driver, "chrome");
		 
		ElementUtil.launchURL(driver, url);
		Thread.sleep(2000);
		 
		ElementUtil.clickOn(driver, xMark);
	
		ElementUtil.getElement(driver, message).sendKeys("Aisha");
		
		ElementUtil.clickOn(driver,showMsg);
		
		String yourMsg = driver.findElement(By.xpath("//span[@id='display']")).getText()  ;
		
		if (yourMsg.equals("Aisha")) {
			System.out.println("Correct text.");
		} else {
			System.out.println("Incorrect text.");
		}

	}

}


/* xmark: 	id = at-cv-lightbox-close 
 * 		 	cssSelector("#at-cv-lightbox-close");
 * 		 	By.xpath("//a[@class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']");
 * 			("//a[@class='at4-close']");
 *			By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/a[1]");
 * no: className("at-cv-button at-cv-lightbox-yesno at-cm-no-button");
 * yes: className("at-cv-button at-cv-lightbox-yesno at-cm-no-button");
 * message = By.xpath("//button[@class='btn-default']");   X
		   = By.xpath("//input[@id='user-message']");   X
 * 			//button[contains(text(),'Show Message')]
 * 
 * 
 * 
 * 
 * 
 * */
 

