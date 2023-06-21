package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class HidePostTest extends BaseTest{

	
	@Test()
	public void ValidateHidePost(Method method )   throws InterruptedException ,AWTException{
		
		// startTest(method.getName(), "offline settings");
	
		
			homePage2.openTuguApp();
		   loginPage2.logintoTuguApp2();
		   postpage.AllpostonPage();
		   postpage.HidePage(1);
		  
	}
}
