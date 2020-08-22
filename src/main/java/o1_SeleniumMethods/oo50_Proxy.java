package o1_SeleniumMethods;


import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class oo50_Proxy {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();		// Create object Proxy class
		Proxy proxy = new Proxy();
			
		proxy.setHttpProxy("username:password.myhttpproxy:3337");
		
		options.setCapability("proxy", proxy);
	
		ChromeDriver driver = new ChromeDriver(options);

	}

}
/*
		- How to handle proxy   in Selenium for Chrome?
		
		When you try to access some secure applications you will get proxy issues so many times. 
		Until we don't set proxy, we can't access the application itself. 
	

*/