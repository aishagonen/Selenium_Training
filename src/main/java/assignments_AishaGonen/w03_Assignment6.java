package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class w03_Assignment6 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://www.verizonwireless.com/";
			
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		By phones = By.xpath("//button[contains(text(),'Phones list')]");
		Thread.sleep(3000);
		
		WebElement smarty = driver.findElement(By.id("thirdLevel00"));
		mouseOverClick(driver, phones, smarty);
		Thread.sleep(7000);

		WebElement selected = driver.findElement(By.xpath("//div[@id='tile_dev13400024']//div[contains(@class,'NHaasTX75Bd marginBottom5')]//a"));
		
		String selectedText = selected.getText();
		System.out.println(selectedText);
		
		driver.manage().window().maximize();

		ElementUtil.clickOnW(driver, selected);
		Thread.sleep(3000);
		
		verify(selectedText, ("Samsung\n" + 
				"Galaxy S20 5G UW"));
	}

	public static void mouseOverClick(WebDriver driver, By locator, WebElement locatorClicked) {
		Actions action = new Actions(driver);
		WebElement mouseOverAction = driver.findElement(locator);
		action.moveToElement(mouseOverAction).click(locatorClicked).build().perform();	
	}
	
	public static void clickOnW(WebDriver driver, WebElement locator) {
		locator.click();	
	}
	
	public static void verify(String selectedText,String verifiedText ) {
		if (selectedText.equals(verifiedText)) {
			System.out.println("Text is correct.");
		} else {
			System.out.println("Text is not correct.");
		}
	}
	
	
}		
		
/*
  
  
  
 */
