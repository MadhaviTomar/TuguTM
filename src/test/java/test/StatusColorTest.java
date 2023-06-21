package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class StatusColorTest extends BaseTest{

	@Test
	  
	public void StatusColor (Method method )   throws InterruptedException {
		
		// startTest(method.getName(), "offline settings");
			String emailidinput="Akshit12";
	    	String password="Akshit@321";
	    	loginPage
	    	.logintoTugu(emailidinput, password);
	    	homePage
	    	.StatusColor();
}
}