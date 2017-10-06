package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cognizant.Craft.ReusableLibrary;
import com.cognizant.Craft.ScriptHelper;
import com.cognizant.framework.CraftDataTable;

import supportLibraries.Utility_Functions;

//Page object class for the Login page

public class NewAppLoginPage extends ReusableLibrary{

	public NewAppLoginPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		PageFactory.initElements(driver.getWebDriver(), this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_userName;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_password;

	@FindBy(xpath = "//input[@formcontrolname='remember']")
	WebElement checkBox_rememberMe;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement btn_Submit;

//	CraftDataTable dataTable = new CraftDataTable("src/test/resources","NewApp_TestData.xls");

	public void invokeApplication() {
		driver.get(dataTable.getData("General_Data", "URL"));
		Assert.assertTrue(Utility_Functions.xWaitForElementVisible(driver, txt_userName, 10), "Application not invoked, Login screen not displayed");
		System.out.println("Application invoked");
	}

	public void login() {
		
		System.out.println("Logging in");
		Utility_Functions.xSendKeys(driver, txt_userName, dataTable.getData("General_Data", "Username"));
		Utility_Functions.xSendKeys(driver, txt_password, dataTable.getData("General_Data", "Password"));
//		Utility_Functions.xSendKeys(driver, txt_userName, properties.getProperty("Username"));
//		Utility_Functions.xSendKeys(driver, txt_password, properties.getProperty("Password"));
		Utility_Functions.xClick(driver, btn_Submit, false);
		
	}
	
	public void verifyHeaderText() {
//		Utility_Functions
	}
	
	public void validateCredentials() {
		
	}

}