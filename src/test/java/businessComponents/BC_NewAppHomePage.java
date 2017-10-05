package businessComponents;

import com.cognizant.Craft.ReusableLibrary;
import com.cognizant.Craft.ScriptHelper;

import pageObjects.NewAppHomePage;

public class BC_NewAppHomePage extends ReusableLibrary{

	public BC_NewAppHomePage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		// TODO Auto-generated constructor stub
	}
	
	NewAppHomePage home = new NewAppHomePage(scriptHelper);
	
	public void bc_clickAbout() throws InterruptedException {
		home.clickAbout();
	}
	
	public void bc_verifyHomePageHeaderDisplayed() throws InterruptedException{
		home.verifyHomePageHeaderDisplayed();
	}

	
}