package o2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import o1_SeleniumMethods.ElementUtil;

public class o1_IdLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		Thread.sleep(3000);
		
// 1.way :
//		WebElement userElement = driver.findElement(By.id("username"));
//		userElement.sendKeys("filnecati@gmail.com");
//		
//		WebElement userPass = driver.findElement(By.id("password"));
//		userPass.sendKeys("lompen");
//		
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		loginBtn.click();
		
// 2.way :
//		driver.findElement(By.id("username")).sendKeys("filnecati@gmail.com");
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		loginBtn.click();
		
// 3.way :
//		By username = By.id("username");
//		By password = By.id("password");
//		By loginBtn = By.id("loginBtn");
//		
//		WebElement userElement = driver.findElement(username);
//		userElement.sendKeys("filnecati@gmail.com");
//		
//		WebElement userPass = driver.findElement(password);
//		userPass.sendKeys("lompen");
//		
//		WebElement loginBtn1 = driver.findElement(loginBtn);
//		loginBtn1.click();

// 4.way : We use this way in our framework. This is professional usage.
		
		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		ElementUtil.getElement(driver, username).sendKeys("filnecati@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("lompen");
		//ElementUtil.getElement(driver, loginBtn).click();
		ElementUtil.clickOn(driver, loginBtn);
			
	}

}

/*
 	
  
  
  
  
  
  
  
 */
