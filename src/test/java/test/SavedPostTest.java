package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class SavedPostTest extends BaseTest{

	
	@Test(priority = 0, description ="Saved posts of following users ")
	
	public void ValidateSavedpostTest(Method method )   throws InterruptedException ,AWTException{
		
		// startTest(method.getName(), "offline settings");

		homePage2.openTuguApp();
			
	   loginPage2.logintoTuguApp2();
	  
	   savedpostpage.Savedpost(1);
	  
}
}