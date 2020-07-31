package o1_SeleniumMethods;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oo10_ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize(); 		// ScreenShot'i almak icin maximize etmek lazim. 
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/aishagonen/Desktop/ScreenShot/pic.png"));
		
		driver.quit();
		
		
	}

}

/*
	Selenium doesn't support ScreenShot. Java provides ScreenShot consept. 
	- Interview'de you should be able to explain this line :
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  * this part is also source file.
		
	- Where do you store this file? 
	  FileUtils.copyFile(src, new File("/Users/aishagonen/Desktop/ScreenShot/pic.png"));

	- '.png' is common usage for screenshots. Also use '.jpeg' but its quality is not good. 
	
	- This code is very simple one. We are going to learn advance level. In this consept we take a screenshot and on the file we can see it. 
	  Later we take another one, first one is deleted. We will learn how we keep the multiple screenshots according to date and time.  

*/