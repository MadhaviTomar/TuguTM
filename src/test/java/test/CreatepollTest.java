package test;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class CreatepollTest extends BaseTest {

	@Test(priority = 0, description = "Create poll")
    public void validLoginTest(Method method) throws InterruptedException {
		
		// startTest(method.getName(), "offline settings");
        //ExtentReports Description
       // startTest(method.getName(), "Valid Login Test");
    	String emailidinput="Akshit12";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
    	homePage
    	.Createpoll();
    	
}}
