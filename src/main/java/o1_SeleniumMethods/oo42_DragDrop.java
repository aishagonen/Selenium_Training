package o1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oo42_DragDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);

// 1. way : bu yontemi kullan. 
		actions.dragAndDrop(sourceElement, targetElement).build().perform();

// 2. way :	'.dragAndDrop()'a alternatif kullanim :	
		actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
			
	}
}

/*
		Interview Question:  
		Actions class provides;
		 - .actions.clickAndHold(source);
		 - .moveToElement(target);
		 - .release();
		 - .build();
		 - .perform();
	
	Action class provides all future related with mouse an keyboard.   
		
	'.release()' --> does the same thing with build. Don't use it in your project but use it in itreview. 	
	'.perform()' --> you must use it. it is last action to work the code. 	
		
		

*/