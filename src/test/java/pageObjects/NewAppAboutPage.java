package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cognizant.Craft.ReusableLibrary;
import com.cognizant.Craft.ScriptHelper;


import supportLibraries.Utility_Functions;

//Page object class for the Login page

public class NewAppAboutPage extends ReusableLibrary{

	public NewAppAboutPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
	}
	
	
	@FindBy(xpath="//span[text()='CBRE1']")
	WebElement HEADER_CBRE1;
	
	@FindBy(xpath="//span[text()='Version']")
	WebElement VERSION;
	
	public void verifyHeaderIsDisplayed(){
		Utility_Functions.xWaitForElementPresent(driver, HEADER_CBRE1, 10);
		System.out.println("Header displayed");
	}
	
}
