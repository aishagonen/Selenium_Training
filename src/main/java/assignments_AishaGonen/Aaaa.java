package assignments_AishaGonen;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Aaaa {

	public static WebDriver driver;
	public static String url;
	public static WebElement element;
	
	public static void main(String[] args) {
        
		url = "";
		
        driver = ElementUtil.launchBrowser(driver, "chrome"); 
		ElementUtil.launchURL(driver, url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		
		
		
	}
	
	
	
	
	
	
}
