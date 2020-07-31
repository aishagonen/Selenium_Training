package o1_SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class oo18_MultipleDropDown1 {
	
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);

// first: when we launch the web page we need to click the menu:		
		driver.findElement(By.id("justAnInputBox")).click();

// second : collect all values in the single List concept at the drop down menu. For that we need to find common locators for all values for all choices.
//			And we have to use customized xpath for that. 
		List<WebElement> dropList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		System.out.println(dropList.size()); 		// to see how many value is available. 
		
		for(int i = 0; i < dropList.size(); i++){
			String text = dropList.get(i).getText();	// now we see all options values including empty values.
			System.out.println(text); 				 
			
// to ignore empty values :
			if(!text.isEmpty()){ 					// yani eger empty degilse click it.  
				dropList.get(i).click();
			}
// to select ONE specific option : 			
			if(text.equals("choice 6")){
				dropList.get(i).click();
				break;
			}
		}
	
	}

}


/*
  
  
  
  
  
  
 */




