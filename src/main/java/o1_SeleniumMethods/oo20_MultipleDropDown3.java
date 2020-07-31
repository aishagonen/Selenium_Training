package o1_SeleniumMethods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class oo20_MultipleDropDown3 {
	
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		driver.findElement(By.id("justAnInputBox")).click();

		selectMultipleValue(driver, "choice 2", "choice 4", "choice 6");
		
	}
	
	
	public static void selectMultipleValue(WebDriver driver, String... value) { // 'String...' args consept. to select multiple options. 
		List<WebElement> dropList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(dropList.size());
		
		for(int i = 0; i < dropList.size(); i++){
			String text = dropList.get(i).getText();
			System.out.println(text);

// to select multiple value we use Array concept :  Single value icin we don't need that, cuz only one value sectik. But now multiple value sececegiz.  		
			for (int j = 0; j < value.length; j++) {
				try {
					if(!text.isEmpty()){
						if(text.equals(value[j])){
							dropList.get(i).click();
							break;
						}
					}
				} catch (Exception e) {}
			}	
		}			
	}
	
	
}
/*
	'String...' --> args consept. cunku birden fazla value sececegiz. 

*/


