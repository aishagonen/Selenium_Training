package assignments_AishaGonen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class w02_Assignment5 {

	public static  WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
		url = "http://www.seleniumframework.com/Practiceform/";
		
		By name = By.name("name");
		
		By email = By.className("validate[required,custom[email]]");
		
		By phone = By.xpath("//input[@placeholder='Telephone *']");	
		
		By country = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/aside[1]/div[1]/section[2]/form[1]/div[1]/span[4]/input[1]");
		
		By company = By.xpath("//input[@placeholder='Company']");	
		
		By message = By.xpath("//textarea[@placeholder='Message']");	
		
		By submit = By.linkText("Submit");	
		
		
		driver = ElementUtil.launchBrowser(driver, "chrome");
		 
		ElementUtil.launchURL(driver, url);
		
		ElementUtil.getElement(driver, name).sendKeys("Necati");
		ElementUtil.getElement(driver, email).sendKeys("filnecati@gmail.com");
		ElementUtil.getElement(driver, phone).sendKeys("0 10 10101 010 101 ");
		ElementUtil.getElement(driver, country).sendKeys("Lompen Island");
		ElementUtil.getElement(driver, company).sendKeys("King");
		ElementUtil.getElement(driver, message).sendKeys("Yasasin Lompen Lompen Dansi!");
		
		ElementUtil.clickOn(driver, submit);
		
		String title = ElementUtil.getPageTitle(driver);
		
		System.out.println(title);
		
		if (title.equals("Selenium Framework | Practiceform")) {
			System.out.println("Title is correct.");
		} else {
			System.out.println("Title is not correct.");
		}
		
		

	}

}
