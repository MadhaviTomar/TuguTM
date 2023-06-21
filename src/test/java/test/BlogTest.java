package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class BlogTest extends BaseTest{

	
	@Test(priority = 0)
	
	public void ValidateCreateBlog(Method method )   throws InterruptedException ,AWTException{
		
		 //startTest(method.getName(), "offline settings");
		
			homePage2.openTuguApp();
		
		   loginPage2.logintoTuguApp2();
		  
		   blogpage.CreateBlog();
		   
		  		  
		//	Assert.assertEquals(groupkeyword, keyword2);
		
		
		
		
	}
}
