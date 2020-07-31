package o1_SeleniumMethods;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class oo21_WebTableHandling {

	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) {
		
		url = "https://www.w3schools.com/html/html_tables.asp";
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
	
		int rowCount = getTableCount(driver);

		// 1.column'dakilerin xPath'i soyle devam ediyordu : Bas kisimlari farkli, son kisimlari ayni. So, row number'i yani ortadaki sayilari degistirecek kod yaziyoruz : 		
		//[@id='customers']/tbody/tr[2]/td[1]"		
		//[@id='customers']/tbody/tr[3]/td[1]"
		//[@id='customers']/tbody/tr[7]/td[1]"
		
		
		String beforeXpath = "//[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";

// 1. way :		
		for (int rowNum = 0; rowNum <= rowCount; rowNum++) { 	//other usage:  for(int i = 2(cunku 1 denedi olmadi); i<=7(cunku xpath'e baktiginda 7 tane vardi); i++) {
			String actualXpath = beforeXpath + rowNum + afterXpath;
			System.out.println(actualXpath);
			WebElement element = driver.findElement(By.xpath(actualXpath));
			String text = element.getText();
			System.out.println(text);
			
			if(element.getText().equals("Island Trading")) {								// this part extra. Table oldugu icin tiklayamayiz. Boyle bilgi ekleyebiliriz print ettigimizde.
				System.out.println("Company name: " + element.getText() + " is found.");
			}
		}		

// 2. way :	ayni isi yapiyor, yukariyi methoda yazdik sadece. 		
		getColumnData(driver, beforeXpath, afterXpath); 	// first column'daki datayi yazar. 


//Peki diger column'dakileri nasil print edecegiz :
		
// 1. column'dakiler soyleydi :	
		//[@id='customers']/tbody/tr[2]/td[1]"
		//[@id='customers']/tbody/tr[3]/td[1]"
		//[@id='customers']/tbody/tr[7]/td[1]"
// 2. column icin baktigimizda only different is last part : 		
		//[@id='customers']/tbody/tr[2]/td[2]"
// 3. column'a baktigimizda only different is last part :
		//[@id='customers']/tbody/tr[2]/td[3]"
				
		//String beforeXpath = "//[@id='customers']/tbody/tr[";
		String afterXpathCompany = "]/td[1]";
		String afterXpathContact = "]/td[1]";
		String afterXpathCountry = "]/td[1]";
		
		getColumnData(driver, beforeXpath, afterXpathCompany);
		getColumnData(driver, beforeXpath, afterXpathContact);
		getColumnData(driver, beforeXpath, afterXpathCountry);
		
	}
	
	public static int getTableCount(WebDriver driver) {
		List<WebElement> rowList = driver.findElements(By.xpath("[@id=\'customers\']//tr"));
		int rowCount = rowList.size();
		return rowCount;
	}
	
	public static void getColumnData(WebDriver driver, String beforeXpath, String afterXpath) {	
		for (int rowNum = 0; rowNum <= getTableCount(driver); rowNum++) {
			String actualXpath = beforeXpath + rowNum + afterXpath;
			System.out.println(actualXpath);
			String text = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(text);
		}	
	}

// Also we can improve yukarida olusturdugumuz methodu :
 	public static ArrayList<String> getColumnDataList(WebDriver driver, String beforeXpath, String afterXpath) {	
		ArrayList<String> data = new ArrayList<String>();
		for (int rowNum = 0; rowNum <= getTableCount(driver); rowNum++) {
			String actualXpath = beforeXpath + rowNum + afterXpath;
			System.out.println(actualXpath);
			String text = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(text);
			data.add(text);
		}
		return data;
	}
 

	
}

/*
 
 	- In Selenium, there is not any method to handle WebTable. So we have to create a logic ourselves to handle this.
 	- in HTML, all tables start with '<tbody>' --> means table body.
 									 '<tr>' --> table row.
 									 '<td>' --> table column. (table data)
 	- Table is database. So it doesn't have any Selenium futures. So we can't use select(),click()..etc. 
 
	- Webtable'da rows and columns var.Bir tanesini sectigimizde goruyoruz ki bir kismi dynamic, ama diger kismlari ayni: 
		//[@id='customers']/tbody/tr[2]/td[1]"
		//[@id='customers']/tbody/tr[3]/td[1]"
		//[@id='customers']/tbody/tr[7]/td[1]"
		 
		First : I need to select all available part in the my table: 
				All datas start with <tr> . So how to customize them?  --> [@id='customers']//tr
		Second : Sonra hepsini before and after xPath'leri row sayisina gore ekleyip actual xPath'e ulasiyoruz. 
		Third: Ve hepsini print etmek icin de loop yaziyoruz. 
		Boylece sadece bir column'in datasina ulastik. butun column'lari print etmek icin method olusturduk. 
	
	
	
	
	

*/