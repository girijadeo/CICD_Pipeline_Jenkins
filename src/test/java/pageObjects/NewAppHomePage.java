package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cognizant.Craft.ReusableLibrary;
import com.cognizant.Craft.ScriptHelper;
import com.cognizant.framework.CraftDataTable;

import supportLibraries.Utility_Functions;

//Page object class for the Login page

public class NewAppHomePage extends ReusableLibrary{

	public NewAppHomePage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
	}
	
	@FindBy(linkText="CBRE1")
	WebElement CBRE1;
	
	@FindBy(xpath="//span[text()='Home']")
	WebElement HOME;
	
	@FindBy(xpath="//span[text()='About']")
	WebElement ABOUT;
	
	@FindBy(xpath="//span[text()='Hello world !']")
	WebElement HEADER;
	
	public void clickAbout() {
		Utility_Functions.xClick(driver, ABOUT, false);
	}
	
	public void verifyHomePageHeaderDisplayed() {
		if(Utility_Functions.xWaitForElementClickable(driver, HEADER, 10)) {
			System.out.println("Login successful, Home page displayed");
		}
		else {
			System.out.println("Home page not displayed");
		}
	}
	
}