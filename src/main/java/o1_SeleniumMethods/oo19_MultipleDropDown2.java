package o1_SeleniumMethods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class oo19_MultipleDropDown2 {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectSingleValue(driver, "choice 3");
		
	}
	
	
	public static void selectSingleValue(WebDriver driver, String value) {
		List<WebElement> dropList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']")); //option'larin listesinin locator'i 
		System.out.println(dropList.size());
		
		for(int i = 0; i < dropList.size(); i++){
			String text = dropList.get(i).getText();
			System.out.println(text);
			
			try {
				if(!text.isEmpty()){
					if(text.equals(value)){
						dropList.get(i).click();
						break;
					}
				}
			} catch (Exception e) {}
		}
	}

}
