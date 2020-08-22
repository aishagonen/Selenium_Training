package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class oo33_TestNG_1 {
	
	public static WebDriver driver;
	By email = By.id("username");
	By password = By.id("password");
	By loginBtn = By.id("loginBtn");
	By bodyText = By.xpath("//div[@class='private-alert__inner']/h5");;
	
	
	@BeforeMethod	// runs before all test cases. 
	public void setUp() throws InterruptedException { 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
	}
	
	@Test(priority=1, description="This method gets title")
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login"); 	// if-else condition yerine 'Assert....' kullaniyoruz. 
	}
	
	@Test(priority=2, description="Login system using invalid username invalid pass")
	public void InvalidCredential() {
		waitGetElementDefault(driver, email).sendKeys("kralshakir@gmail.com");
		waitGetElementDefault(driver, password).sendKeys("lompen");
		waitGetElementDefault(driver, loginBtn).click();
		String text = waitGetElementDefault(driver, bodyText).getText();
		System.out.println(text);
		Assert.assertEquals(text, "That email address doesn't exist.");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();  	// or use 'driver.close();'  --> it's up to you.
	}
	
	
	public static WebElement waitGetElementDefault(WebDriver driver, By locator) {	
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement element = driver.findElement(locator);
		return element; 
	}
	
}
