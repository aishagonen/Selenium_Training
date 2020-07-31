package o2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import o1_SeleniumMethods.ElementUtil;

public class o2_NameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/login");
		Thread.sleep(3000);

// 1.way :
//		WebElement userElement = driver.findElement(By.name("username"));
//		userElement.sendKeys("kralshakir@gmail.com");
		// gerisini tamamla!
	
		
// 2.way :	
//		driver.findElement(By.name("username")).sendKeys("kralshakir@gmail.com");
		
// 3.way :
//		By username = By.name("username");
//		By password = By.name("password");
//		By login = By.xpath("/i[@class='fa fa-2x fa-sign-in']");
//		
//		WebElement userElement = driver.findElement(username);
//		userElement.sendKeys("kralshakir@gmail.com");
//		
//		WebElement userPass = driver.findElement(password);
//		userPass.sendKeys("lompen");
		
		// // gerisini tamamla!
		
// 4.way :	
		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//button[Qclass='radius']/i");   // yukaridaki xPath'i  bulamadi, o nedenle Hoca bu kismi inspect'ten customize etti.
		
		ElementUtil.getElement(driver, username).sendKeys("kralshakir@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("lompen");
		ElementUtil.clickOn(driver, login);
		
		
		 
	}

}
