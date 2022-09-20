package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Login {
	
	@FindBy (xpath = "//input[@name = 'username']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[text()=' Login ']")
	private WebElement button;
	
	public OrangeHRM_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void username() {
		username.sendKeys("Admin");
	}
	
	public void password() {
		password.sendKeys("admin123");
	}
	
	public void button() {
		button.click();
	}

}
