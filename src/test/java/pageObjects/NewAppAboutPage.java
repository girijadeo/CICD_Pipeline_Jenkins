package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cognizant.Craft.ReusableLibrary;
import com.cognizant.Craft.ScriptHelper;

import org.testng.Assert;
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
		
		Assert.assertTrue(Utility_Functions.xWaitForElementVisible(driver, HEADER_CBRE1, 10), "Header not displayed");
		System.out.println("Header displayed on the ABOUT page.");
	}
	
}
