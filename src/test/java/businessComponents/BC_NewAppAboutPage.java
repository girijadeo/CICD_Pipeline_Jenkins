package businessComponents;

import com.cognizant.Craft.ReusableLibrary;
import com.cognizant.Craft.ScriptHelper;

import pageObjects.NewAppAboutPage;

public class BC_NewAppAboutPage extends ReusableLibrary{

	public BC_NewAppAboutPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		// TODO Auto-generated constructor stub
	}
	
	NewAppAboutPage about = new NewAppAboutPage(scriptHelper);
	
	public void bc_verifyHeaderIsDisplayed() throws InterruptedException {
		about.verifyHeaderIsDisplayed();
	}

	
}