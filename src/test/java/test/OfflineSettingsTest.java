package test;

import java.lang.reflect.Method;
import static util.ExtentTestManager.startTest;
import org.testng.annotations.Test;

public class OfflineSettingsTest extends BaseTest {
	@Test(priority = 0, description = "offlinetest")
public void OfflineSettings (Method method )  throws InterruptedException {
		
		// startTest(method.getName(), "offline settings");
		String emailidinput="Akshit12";
    	String password="Akshit@321";
    	loginPage
    	.logintoTugu(emailidinput, password);
    	Thread.sleep(5000);
    	homePage
    	.OfflineSettings();

}
}