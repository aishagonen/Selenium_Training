package o1_SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class oo37_Headless_HtmlUnitDriver {

	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://siliconelabs.com");

		System.out.println(driver.getCurrentUrl());

	}

}
/*
		Fastest option. But old-fashion.
		There is no browser.
		 
					

*/