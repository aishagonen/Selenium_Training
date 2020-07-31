package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class oo35_FrameHandling {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "http://londonfreelance.org/courses/frames/index.html";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		System.out.println(driver.getTitle());
	    
		WebElement header = driver.findElement(By.xpath("//h2[contains(text(), 'Title bar ')]"));  	// Css = "body>h2"
		
		System.out.println(header.getText());
	    
		System.out.println(driver.getTitle());

// defaultContent() : is used to come back main frame. 
		driver.switchTo().defaultContent();			
	   
		System.out.println(driver.getTitle());
    
	    
	}

}

/*
	 - iframe and frame are same.
	 - frame concept is used for security reasons. 
	 
	 - in frame concept there is two important things:
	 	1. switchTo().frame();
	 	2. switchTo().defaultContent();
	  
	  
	  
 */

