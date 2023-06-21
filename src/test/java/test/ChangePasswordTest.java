package test;

import java.lang.reflect.Method;
import static util.ExtentTestManager.startTest;
import org.testng.annotations.Test;

public class ChangePasswordTest extends BaseTest  {
	
	@Test (priority = 0, description = "change password")
	public  void ChangeNotification (Method method )  throws InterruptedException {
			
		// startTest(method.getName(), "Change password");
			String emailidinput="Akshit12";
	    	String password="Akshit@321";
	    	loginPage
	    	.logintoTugu(emailidinput, password);
	    	Thread.sleep(5000);
	    	homePage
	    	.NavigatingToGeneralsettings();
	    	generalsettingPage
	    	.NavigatingToPasswordSetting();
	    	passwordsettingPage
	    	.Changepassword();

}
}