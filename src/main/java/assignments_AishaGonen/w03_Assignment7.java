package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class w03_Assignment7 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
	
		url = "https://www.designmantic.com/";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		Thread.sleep(3000);
		
		driver.findElement(By.id("selectservice")).click();
		Thread.sleep(3000);
		
		WebElement step1 = driver.findElement(By.id("selectservice"));
		Select select1 = new Select(step1);
		select1.selectByIndex(2);
		
		ElementUtil.getElement(driver, By.id("company_name")).sendKeys("ZeroOne");
			
		WebElement step3 = driver.findElement(By.id("details_categories"));
		Select select3 = new Select(step3);
		select3.selectByVisibleText("Information Technology");
		
		driver.findElement(By.xpath("//span[contains(text(),'Show My Designs Free')]")).click();
	
	}

	
	
}
