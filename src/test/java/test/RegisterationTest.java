package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility2.TestUtil;


public class RegisterationTest extends BaseTest{

	@Test(dataProvider= "data", dataProviderClass = TestUtil.class)
    public void validRegisterationTest(String username, String userlastname, String email, String password, String confirmpassword, String male) throws InterruptedException,AWTException, IOException, NoSuchMethodException{
		// Method method = getClass().getMethod("SendAudio", String.class, String.class);
		 //startTest(method.getName(), "Add profile");
    	homePage2.openTuguApp();
		
        registerationPage
        .RegisterintoTuguApp(username,userlastname,email, password,confirmpassword,male);
     
       //String name = registerationPage.GetName();
      // Assert.assertEquals(username, name);
      	
    }
	
 
}
