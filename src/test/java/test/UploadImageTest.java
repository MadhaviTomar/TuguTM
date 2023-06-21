package test;

import static util.ExtentTestManager.startTest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.testng.annotations.Test;

import com.test.Utility.TestUtil;

public class UploadImageTest extends BaseTest {
	
	@Test(dataProvider = "data",dataProviderClass = TestUtil.class)
	//@Test(priority = 0, description = "Upload a new image")
    public void Uploadimage (String Imagepath, String Imagetype ) throws InterruptedException, IOException, NoSuchMethodException{
		 //Method method = getClass().getMethod("SendAudio", String.class, String.class);
			
		//startTest(method.getName(), "Add profile");

		String emailidinput="Akshit12";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	homePage 
    	.UploadImage(Imagepath);

}
}