package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_HomePage {

	@FindBy (xpath= "//input[@placeholder = 'Search']")
	private WebElement search;
	
	@FindBy (xpath= "//span [text() = 'Admin']")
	private WebElement Admin;
	
	@FindBy (xpath= "//span [text() = 'PIM']")
	private WebElement PIM;
	
	@FindBy (xpath= "//span[text() = 'Leave']")
	private WebElement Leave;
	
	@FindBy (xpath= "//span[text() = 'Time']")
	private WebElement Time;
	
	@FindBy (xpath= "//span[text() = 'Recruitment']")
	private WebElement Recruitment;
	
	@FindBy (xpath= "//span[text() = 'My Info']")
	private WebElement Info;
	
	public OrangeHRM_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	public boolean search() {
		boolean search1 = search.isDisplayed();
		return search1;
	}
	public boolean Admin() {
		boolean Admin1 = Admin.isDisplayed();
		return Admin1;

	}
	public boolean PIM() {
		boolean PIM1 = PIM.isDisplayed();
		return PIM1;
	}
	public boolean Leave() {
		boolean Leave1 = Leave.isDisplayed();
		return Leave1;
	}
	public boolean Time() {
		boolean Time1 = Time.isDisplayed();
		return Time1;
	}
	public boolean Recruitment() {
		boolean Recruitment1 = Recruitment.isDisplayed();
		return Recruitment1;
	}
	public boolean Info() {
		boolean Info1 = Info.isDisplayed();
		return Info1;
	}
	
	
}

