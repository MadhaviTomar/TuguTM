package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class DisablePostCommentTest extends BaseTest{

	
	@Test
	
	public void ValidateDisablePostComment(Method method )   throws InterruptedException ,AWTException{
		
		// startTest(method.getName(), "offline settings");
	
	//	String emailidinput="Addy123";
   	//	String password="addy.123";
    
    	homePage2.openTuguApp();
    		
        loginPage2.logintoTuguApp2();
        postpage.AllpostonPage();
        
        postpage.disableCommentPost(1);
}
	
}
