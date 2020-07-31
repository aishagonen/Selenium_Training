package o1_SeleniumMethods;


import org.openqa.selenium.WebDriver;

public class oo25_ThreadSleep {
	
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://www.app.hubspot.com/login";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		Thread.sleep(5000);
		
		System.out.println("Title is: " + driver.getTitle());
		
		
	}

}

/*

		Thread Sleep :
		
		- TS is used to slow down browser/test case/threads. 
		- We can use TS for every steps. 
		- TS is used in code level.
		- TS comes from Java.util. Not a future of WebDriver. It is a common future in Java.
		- TS is static wait.  
		- TS provides milliseconds as a time. 
		
		- Interview Question :
			* What is the differences between 'sleep/ThreadSleep' and 'set speed'? 
			* Both of them are used for make the test slower. But;
			  TS is used to slow down test case for every step. But set speed is used for SeleniumIDE.
		  	  We can't use set speed in the code level. But TS is used in the code level.  
	
		
		
							Synchronization in Selenium WebDriver 
			    ____________________________________________________________
			  /																 \
			 |																  |
		Unconditional							 ______________ Conditional Synchronization __________
			 |								   /				  |                  |                 \       
			 |								  |					  |					 |					|	
		Thread.sleep() 					Implicit  Wait		Explicit Wait		Fluent Wait		Page Load Time Out			
		
		
			



*/