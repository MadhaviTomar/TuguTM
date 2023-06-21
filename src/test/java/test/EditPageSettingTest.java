package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class EditPageSettingTest extends BaseTest{

	
		@Test
		public void ValidatePageSetting(Method method )   throws InterruptedException ,AWTException{
			
			// startTest(method.getName(), "offline settings");
					
			homePage2.openTuguApp();
		    loginPage2.logintoTuguApp2();
		    myPagesPage.EditSetting();
		   		
		}	
		
}
