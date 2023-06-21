package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTests extends BaseTest {
   
	
	@Test(priority = 0, description = "Valid Login Scenario with correct username and password.")
    public void validLoginTest(Method method)  throws InterruptedException {
		
		// startTest(method.getName(), "offline settings");
        //ExtentReports Description
       // startTest(method.getName(), "Valid Login Test");
    	String emailidinput="testharry570@gmail.com";
    	String password="Harry@123";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
	}}
  