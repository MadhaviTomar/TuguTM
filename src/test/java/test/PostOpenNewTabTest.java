
package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class PostOpenNewTabTest extends BaseTest {

	@Test
	
	public void ValidatePostOnpenInNewTab(Method method )   throws InterruptedException ,AWTException{
		
		// startTest(method.getName(), "offline settings");
	
    	homePage2.openTuguApp();
    	loginPage2.logintoTuguApp2();  
    	postpage.AllpostonPage();	
        postpage.OpenInNewTab(1);
}
	
}

