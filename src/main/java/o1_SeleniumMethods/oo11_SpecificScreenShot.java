package o1_SeleniumMethods;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class oo11_SpecificScreenShot {

	static WebDriver driver;
	static WebElement element;
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.learnsdet.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		element = driver.findElement(By.xpath("//img[@class='custom-logo']")); 		// logo'yu inspect yaptik. 'class' bilgisini kullanarak 'xPath'i customize ettik. 
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element); 	// Use JavaScriptExecutor to highlight the element on the web page. 
		// 'JavaScriptExecutor'	drove a border for my element.   ("we created a border in here")   --> so, webpage'te kirmizi bir border goruruz. 
		// 'JavaScriptExecutor' kismini sonra ogrenecekmisiz. 
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 		// this line is for 'ScreenShot' consept.
		
		Point p = element.getLocation(); 	// to calculate width and height of the element
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		
		Rectangle rect = new Rectangle(width + 600, height + 600); 		// first :221 ve 55 olculerini inspect'ten aldik. Onlar sadece 'Silicone' kismini gosterdigi icin sonradan bu sayilari buyuttuk
		
		BufferedImage img = null;	// Use BufferImage to crop the logo from system. 
		img = ImageIO.read(screenShot);
		
		BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.width, rect.height); 		// to crop image of portion web page which includes element. 
		
		ImageIO.write(dest, "png", screenShot);	// to crop image into file object
		
		FileUtils.copyFile(screenShot, new File("/Users/aishagonen/Desktop/ScreenShot/givenName.png"));
		
		driver.quit();

	}

}
