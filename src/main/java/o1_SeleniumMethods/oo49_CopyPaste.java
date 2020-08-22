package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oo49_CopyPaste {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		WebElement name = driver.findElement(By.id("u_0_m"));
		
		WebElement lastName = driver.findElement(By.id("u_0_o"));
		
		Actions actions = new Actions(driver);
		
		actions.click(name).sendKeys("Cemil").perform();
		
		// to select everything  --> MAC COMMAND + A | WINDOWS CONTROL + A to 
		actions.keyDown(name, Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).perform();
		
		// to copy --> MAC COMMAND + C | 
		actions.keyDown(Keys.COMMAND).sendKeys("C").keyUp(lastName, Keys.COMMAND).perform();
		
		// to paste --> MAC COMMAND + V | 
		actions.keyDown(Keys.COMMAND).sendKeys("V").keyUp(Keys.COMMAND).perform();
		
		
		
	}
}