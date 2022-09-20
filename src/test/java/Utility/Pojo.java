package Utility;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pojo {
	
	public static WebDriver openFirefoxBrowser() {
		
		System.setProperty
		("webdriver.gecko.driver", "src"+File.separator+"test"+File.separator+"resources"+File.separator+"geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return driver;	
	}
	
	public static WebDriver openChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "src"+File.separator+"test"+File.separator+"resources"+File.separator+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return driver;
	}
	

}
