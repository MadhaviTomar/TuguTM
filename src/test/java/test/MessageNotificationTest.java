package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.testng.annotations.Test;

public class MessageNotificationTest extends BaseTest{

	
	@Test
	public void ValidateMessageRequest(Method method )   throws InterruptedException ,AWTException{
		
	//	 startTest(method.getName(), "offline settings");
		
		homePage2.openTuguApp();
	    loginPage2.logintoTuguApp2();
	    explorePage.SearchBar();
	    Thread.sleep(4000);
	    notificationPage.sendMessage();
	    logoutPage.LogOut();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Thread.sleep(5000);
	    loginPage2.logintoTuguApp("rocky123", "rocky.123");
	    Thread.sleep(3000);
	    notificationPage.MsgNotification();
//	    notificationPage.Notification();
	}	

}
