package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class oo30_UploadFile {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://cgi-lib.berkley.edu/ex/fup.html";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
	
		driver.findElement(By.name("upfile")).sendKeys("/Users/aishagonen/Desktop/karalama.txt");
	
	}

}
