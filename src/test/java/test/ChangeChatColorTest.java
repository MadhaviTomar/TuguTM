package test;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class ChangeChatColorTest extends BaseTest {
	@Test
public void ChangeChatcolor (Method method )  throws InterruptedException {
	
	// startTest(method.getName(), "offline settings");
		
		String emailidinput="Akshit12";
    	String password="Akshit@321";
    	loginPage
    	.logintoTugu(emailidinput, password);
    	Thread.sleep(5000);
    	homePage
    	.ChangeChatColor();

}
}