package o1_SeleniumMethods;

import org.openqa.selenium.WebDriver;

public class oo31_AuthenticationPopUp {
	
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "https://the-internet.herokuapp.com/basic_auth";
		driver = ElementUtil.launchBrowser(driver, "chrome");
		
		ElementUtil.launchURL(driver, url);

// 1. way :		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");  //admin:admin --> username:password

// 2. way :	
		String username = "admin";
		String password = "admin";;
		
		driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth"); 

	}
	
}

/*
		Authentication PopUp : 
		- APU is not a part of the web page. APU is part of the browser. So we can't inspect it. We have to handle it differently. 


*/