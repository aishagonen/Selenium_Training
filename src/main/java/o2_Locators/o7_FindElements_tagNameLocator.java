package o2_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class o7_FindElements_tagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();  
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");

// tagName locator collects element as a list. So use List collection.
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
// to find how many link web page has, means list's size :
		System.out.println("Total links: " + linkList.size()); 		// outp: 116
		
// to print out all available links :	
		for (int i = 0; i < linkList.size(); i++) {
			String text = linkList.get(i).getText();
			System.out.println(text);
		// this code also include all empty links. 
		
		// to ignore all empty links :
			if (!text.isEmpty()) {  		// yani diyoruz ki eger link empty degilse print it. 
				System.out.println(text);
			}
		
		// to click 'Forgot Password?' link :
			if (text.equals("Forgot Password?")) {
				linkList.get(i).click();
				break;
			}
			
		
		
		}	
	
	}

}
