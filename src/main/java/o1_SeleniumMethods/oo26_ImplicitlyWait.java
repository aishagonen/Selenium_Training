package o1_SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class oo26_ImplicitlyWait {
	
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://www.app.hubspot.com/login";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		System.out.println("Title is: " + driver.getTitle());
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		
		System.out.println("Title is: " + driver.getTitle());  // 'title' bir element olmadigi icin IW calismaz. TS or EW or FW calisir. 
		
	}

}


/*
		Implicitly Wait :
		
		- if IW is defined using 'findElement()'. 
			- IW waits until element appeared in DOM. 
			- IW returns first element if more than one present. 
			- Throws 'NoSuchElementException' if can't find element in DOM.
		
		- if IW is defined using 'findElements()'. 
			- IW waits until at least one element appeared in DOM. 
			- IW returns collection of all found elements.
			- Return empty (null) collection if no elements  found in DOM. 
		
		- IW tells WebDriver to poll the DOM for a certain amount of time when trying to find 
		  an element/elements if they are not immediately available.   
		- IW works only with element. Doesn't work with non-element.	
			
			How to define IW :
			- driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
					    	Synchronization in Selenium WebDriver 
			    ____________________________________________________________
			  /																 \
			 |																  |
		Unconditional							 ______________ Conditional Synchronization __________
			 |								   /				  |                  |                 \       
			 |								  |					  |					 |					|	
		Thread.sleep() 					Implicit  Wait		Explicit Wait		Fluent Wait		Page Load Time Out			
		
		
			
			
			
			
			
*/