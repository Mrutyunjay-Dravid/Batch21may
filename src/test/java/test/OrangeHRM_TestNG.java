package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;

import PomPackage.OrangeHRM_HomePage;
import PomPackage.OrangeHRM_Login;
import Utility.Pojo;
import Utility.Waits;

public class OrangeHRM_TestNG extends Pojo{
	WebDriver driver;
	SoftAssert s = new SoftAssert();
	@BeforeClass
	public void beforeClass() {
		
		driver = Pojo.openChromeBrowser();
			
		}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException{
		
		//Thread.sleep(2000);
		Waits.explictWait(driver, "//input[@name = 'username']");
		OrangeHRM_Login login = new OrangeHRM_Login(driver);
		
		login.username();
		login.password();
		login.button();
	}
	
	@Test
	public void HomeTest() {
		OrangeHRM_HomePage homepage = new OrangeHRM_HomePage(driver);
		
		boolean search = homepage.search();
		boolean Admin = homepage.Admin();
		boolean PIM = homepage.PIM();
		boolean Leave = homepage.Leave();
		boolean Time = homepage.Time();
		boolean Recruitment = homepage.Recruitment();
		boolean Info = homepage.Info();

		boolean result = search&&Admin&&PIM&&Leave&&Time&&Recruitment&&Info;
//		s.assertTrue(search);
//		s.assertTrue(Admin);
//		s.assertTrue(PIM);
//		s.assertTrue(Leave);
//		s.assertTrue(Time);
//		s.assertTrue(Recruitment);
		s.assertTrue(result);
		s.assertAll();
	}

}
