package test;

import static util.ExtentTestManager.startTest;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.test.Utility.TestUtil1;

public class SendVideoTest extends BaseTest {
	
	
	@Test(dataProvider = "data",dataProviderClass = TestUtil1.class)
	
    public void SendVideo (String VideoPath, String Videotype ) throws InterruptedException, IOException, NoSuchMethodException{
		// Method method = getClass().getMethod("SendAudio", String.class, String.class);
			
		//startTest(method.getName(), "Add profile");

		String emailidinput="Akshit12";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
    	homePage 
    	.SendVideo(VideoPath);
    	
	}
}
