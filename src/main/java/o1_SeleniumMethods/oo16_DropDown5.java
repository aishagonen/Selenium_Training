package o1_SeleniumMethods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class oo16_DropDown5 {
	
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.facebook.com/";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

// isMultiple() :		
		Select	select = new Select(day);
		System.out.println(select.isMultiple());

		
// To verify dropdown is selected or not :
		WebElement option = select.getFirstSelectedOption();
		String selectedText = option.getText();
		System.out.println(selectedText);
		
		
// Print all values for day option: 		
		List<WebElement> dayOptions = select.getOptions();
		
		System.out.println(dayOptions.size()); 				// to see how many available options list has. 
		
		for (int i = 0; i < dayOptions.size(); i++) {
			String text = dayOptions.get(i).getText(); 		// to see the all available options' visible text.	
			System.out.println(text); 	
		}
	
	}

}


/*


	public List<WebElement> getOptions() {
    	return element.findElements(By.tagName("option"));
    }






*/