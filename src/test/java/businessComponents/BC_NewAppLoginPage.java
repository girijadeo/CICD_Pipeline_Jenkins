package businessComponents;

import com.cognizant.Craft.ReusableLibrary;
import com.cognizant.Craft.ScriptHelper;
import pageObjects.NewAppLoginPage;

public class BC_NewAppLoginPage extends ReusableLibrary{

	public BC_NewAppLoginPage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		// TODO Auto-generated constructor stub
	}
	
	NewAppLoginPage NewLogin = new NewAppLoginPage(scriptHelper);
	
	public void invokeApplication() throws InterruptedException{
		NewLogin.invokeApplication();
	}
	
	public void bc_login() throws InterruptedException {
		NewLogin.login();
	}
}