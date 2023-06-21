package test;
import static util.ExtentTestManager.startTest;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.test.Utility.TestUtil2;

public class SendAudioTest extends BaseTest {
	
	
	@Test(dataProvider = "data",dataProviderClass = TestUtil2.class)
	
    public void SendAudio (String AudioPath, String Audiotype ) throws InterruptedException, IOException, NoSuchMethodException{
		// Method method = getClass().getMethod("SendAudio", String.class, String.class);
		
		//startTest(method.getName(), "Add profile");
		String emailidinput="Akshit12";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
    	Thread.sleep(7000);
    	homePage 
    	.SendAudio(AudioPath);
Thread.sleep(4000);
}
}