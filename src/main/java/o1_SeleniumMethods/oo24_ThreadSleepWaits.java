package o1_SeleniumMethods;

public class oo24_ThreadSleepWaits {} 
/*
		Thread Sleep :
		
		- TS is used to slow down browser/test case/threads. 
		- We can use TS for every steps. 
		- TS is used in code level.
		- TS comes from Java.util. Not a future of WebDriver/ Selenium. It is a common future in Java.
		- TS is static wait.  
		- TS provides milliseconds as a time. 
		
		- Interview Question :
			* What is the differences between 'sleep/ThreadSleep' and 'set speed'? 
			* Both of them are used for make the test slower. But;
			  TS is used to slow down test case for every step. But set speed is used for SeleniumIDE.
		  	  We can't use set speed in the code level. But TS is used in the code level.  
		
		
		ImplicitWait : TS yerine bunu kullan methodlarinda.
		
		- if IW is defined using 'findElement()'. 
			- IW waits until element appeared in DOM. 
			- IW returns first element if more than one present. 
			- Throws 'NoSuchElementException' if can't find element in DOM.
		
		- if IW is defined using 'findElements()'. 
			- IW waits until at least one element appeared in DOM. 
			- IW returns collection of all found elements.
			- Return empty (null) collection if no elements found in DOM. 
		- IW tells WebDriver to poll the DOM for a certain amount of time when trying to find 
		  an element/elements if they are not immediately available.   
		- IW works only with element. Doesn't work with non-element or hiding elements.
		- IW is applied for all elements by default. It is global wait.  		
		- IW is dynamic wait. Elementi bulunca sureyi bitirmeyi beklemez.
			
			How to define IW :
			- driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			 
		Explicitly Wait :
		
		- EW is applicable to only a certain element which is specific to a certain condition. 
		- EW is used when you are not aware of the time of element visibility. It's subjected to dynamic nature. 
		- In explicit, we can specify the wait based on a specific condition. 
		- EW represents defined code for certain conditions or behaviors to occur/happen before continued to the next step. 
		- EW is in the WebdriverWait interface. 
		- EW and WebDriverWait works with elements and non-elements. 
		- EW is dynamic wait. Elementi bulunca sureyi bitirmeyi beklemez.		
		- In TestNG we will use EW.	
		
			How to define EW :
			- WebDriverWait wait  = new WebDriverWait (driver, 10);
			  // wait.until(driver ->  driver.findElement(locator);
			  wait.until(ExpectedConditions.elementToBeClickable(locator));
		- 	Element visible degilse EW kullan. 
		
		Fluent Wait :
		
		- FW is used to tell the web driver to wait for a condition, as well as the frequency with which want to check 
		  the condition before throwing an 'ElementNotVisibleException'.  
		- FW defines the maximum amount of time for Selenium WebDriver. 
		- FW works with elements and non-elements. 
		- FW is dynamic wait. Elementi bulunca sureyi bitirmeyi beklemez.
		- Eger aradigin locator'larin ortaya cikma suresi birbirinden farkliysa bunu kullan.  
		- In Cucumber we will use FW.
		
		Page Load Time Out:
		
		- PLTO limits the time that the script allots for a web page to be displayed. 
		- If the page loads within the time then the script continues. 
		- If the page doesn't load within the timeout the script will be stopped by a 'TimeOutException'. 
		- PLTO is WebDriver concept.  
		
							Synchronization in Selenium WebDriver 
			    ____________________________________________________________
			  /																 \
			 |																  |
		Unconditional							 ______________ Conditional Synchronization __________
			 |								   /				  |                  |                 \       
			 |								  |					  |					 |					|	
		Thread.sleep() 					Implicit  Wait		Explicit Wait		Fluent Wait		Page Load Time Out			
		
		

*/