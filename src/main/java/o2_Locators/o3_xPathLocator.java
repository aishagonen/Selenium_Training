package o2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import o1_SeleniumMethods.ElementUtil;

public class o3_xPathLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		Thread.sleep(3000);

//1. way :
		WebElement userElement = driver.findElement(By.xpath("//input[@id='username']"));
		userElement.sendKeys("aslanremzi@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Lompen");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginBtn']"));
		loginButton.click();
		
		
// 2. way :
		By username = By.xpath("//input[@id='username']");
		By password1 = By.xpath("//input[@id='password']");
		
		ElementUtil.getElement(driver, username).sendKeys("aslanremzi@gmail.com");
		ElementUtil.getElement(driver, password1).sendKeys("Lompen");
	
		
		driver.close();
		
	}

}
/*
 		Customizing xpath : 
 	
		- tagname[text()='textvalue']
		- tagname[starts-with(@attribute, 'textvalue')]
		- tagname[ends-with(@attribute, 'textvalue')]
		- tagname[contains(text(), 'textvalue']
		- tagname[starts-with(text(), 'textvalue']


	


*/