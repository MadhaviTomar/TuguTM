

package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;


import org.testng.annotations.Test;

public class RecentNewsFeedTest extends BaseTest {

	

	  @Test(priority = 0, description = "Validate Recent News Feed.")
	    public void validateRecentNewsFeed(Method method)   throws InterruptedException {
			
			// startTest(method.getName(), "offline settings");
	      
	    	homePage2.openTuguApp();
	    		
	        loginPage2.logintoTuguApp2();
	    
	    
	       String str =  recentNewsFeedPage.RecentNewsFeed();
	     
	       String[] string = new String[3];
	       string[0]= "first post is most recent post in News feed";
	       string[1] = "top 2 post are posted at the same time";
	       string[2] = "post is currently posted";
	         
		
	       
	 }
}
