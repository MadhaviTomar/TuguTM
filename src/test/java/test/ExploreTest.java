package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.BasePage;

public class ExploreTest extends BaseTest{

	
	@SuppressWarnings("deprecation")
	@Test(priority = 0, description ="Explore -- Search people,pages and group")
	
	public void ValidateExploreTest(Method method )   throws InterruptedException ,AWTException{
		
		// startTest(method.getName(), "offline settings");
	//	String emailidinput="kevin.test@yopmail.com";
	//	String password="kevin.123";
		homePage2.openTuguApp();
			
	   loginPage2.logintoTuguApp2();
	 
	   //Search for user
	   String keyword = "Anaysha Chouhan";
	   
		 explorePage.SearchUser();
		
	

		//Search for Pages
		String pagekeyword = "Techology News";
		
			explorePage.SearchPage();
	
		//Search for groups
		
		String groupkeyword = "LondonKidsGNW";
		
		explorePage.SearchGroup();
		
	}

}
