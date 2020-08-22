package o1_SeleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;


public class oo32_WindowsPopUp {
	
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://poputest.com/goodpopups.html";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);

		 driver.findElement(By.className("black")).click();
		 
		 driver.manage().window().setSize(new Dimension(1024, 768)); 	// set size of window to specific value. 
		 
		 
		Dimension size = driver.manage().window().getSize();
		int width = size.getWidth();
		int height = size.getHeight();
		System.out.println(width + " - " +  height);
		
		
// I need to get all windows, because we will switch between windows(btw. main and child). For this we use Set consept.
// Because Set accepts only unique elements and all windows have unique elements.  
		
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> iterator = handles.iterator();
		
		String parentWindowID = iterator.next(); 
		//System.out.println("Parent window id is: " + parentWindowID);  //Window ID is always and every time might be different. We don't use this in real life. 
		
		String childWindowID = iterator.next(); 
		//System.out.println("Child window id is: " + childWindowID);

		driver.switchTo().window(childWindowID);
		System.out.println("Child window title is: " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is: " + driver.getTitle());
		
		
		
		
		driver.close();
				
	}
}

/*
 
 		- to get the current window handling :
		= getWindowHandle()  	-->  String handle = driver.getWindowHandle(); 
			
		- to get the window handles that opened :
		= getWindowHandles()  	--> String handle = driver.getWindowHandles();
			
		- to switch to between windows :
		= switchTo().window()  	--> driver.switchTo().window(windowName);
													
	- Every windows have unique id. Main window/page's id is unique, child window/page's id is unique ...	
	- Web page assigns the unique id  for every windows. 
	- We need to get all windows, because we will switch between main window and child window. For this we use 'Set' concept.  		 


	- to set size of window :
	= 	driver.manage().window().setSize(new Dimension(1024, 768));  

	- to fetch size of window :
	= 	Dimension size = driver.manage().window().getSize();
		int width = size.getWidth();
		int height = size.getHeight();




*/