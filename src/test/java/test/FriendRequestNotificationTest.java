package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class FriendRequestNotificationTest extends BaseTest {
	
	@Test
	public void ValidateFriendRequest(Method method )   throws InterruptedException ,AWTException{
		
		// startTest(method.getName(), "offline settings");
		
		homePage2.openTuguApp();
	    loginPage2.logintoTuguApp2();
	    Thread.sleep(5000);
	    explorePage.SearchBar();
	    Thread.sleep(3000);
	    notificationPage.addAFriend();	
	    logoutPage.LogOut();
	    Thread.sleep(4000);
	    loginPage2.logintoTuguApp("rocky123", "rocky.123");
	    notificationPage.Notification();
	}

}
