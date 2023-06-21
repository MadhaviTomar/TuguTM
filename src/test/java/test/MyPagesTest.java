  	package test;

import org.testng.annotations.Test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import utility2.TestUtil2;

public class MyPagesTest extends BaseTest {

	@Test(dataProvider= "data", dataProviderClass = TestUtil2.class)
	  
	public void validateMyPagesTest(String pgname,String pgurl, String pgcat, String pgdesc) throws InterruptedException,AWTException, IOException, NoSuchMethodException{
		// Method method = getClass().getMethod("SendAudio", String.class, String.class);
		 //startTest(method.getName(), "Add profile");
	//	String emailidinput="kevin.test@yopmail.com";
	//	String password="kevin.123";
	homePage2.openTuguApp();
		
   loginPage2.logintoTuguApp2();
 
   String pagetitle= myPagesPage.MyPages(pgname,pgurl,pgcat,pgdesc);
  	Assert.assertEquals(pgname, pagetitle);
	
	}
}
