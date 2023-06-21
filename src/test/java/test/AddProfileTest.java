package test;



import java.awt.AWTException;
import java.io.IOException;



import org.testng.annotations.Test;

import utility2.TestUtil4;

public class AddProfileTest extends BaseTest{

	@Test(dataProvider ="data", dataProviderClass=TestUtil4.class )
	public void ValidateAddProfile(String img, String fname, String lname, String dob) throws InterruptedException,AWTException, IOException, NoSuchMethodException{
		// Method method = getClass().getMethod("SendAudio", String.class, String.class);
		// startTest(method.getName(), "Add profile");
		// startTest(method.getName(), "Add profile");
		//String emailidinput="sierra.test@yopmail.com";
		//String password="sierra.123";
		homePage2.openTuguApp();
			
	   loginPage2.logintoTuguApp2();
	
		driver.navigate().to("https://tuguapp.com/start-up");
		addprofilepage.AddProfile(img, fname, lname, dob);
		
		
	}
}
