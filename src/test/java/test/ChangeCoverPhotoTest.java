package test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.test.Utility.TestUtil;

public class ChangeCoverPhotoTest extends BaseTest {
	
	@Test(dataProvider = "data",dataProviderClass = TestUtil.class)
	//@Test(priority = 0, description = "Upload a new image")
    public void ChangeCoverphoto (String Imagepath, String Imagetype ) throws InterruptedException, IOException {

		String emailidinput="Akshit12";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
    	Thread.sleep(5000);
    	homePage
    	.NavigatingToGeneralsettings();
    	generalsettingPage
    	.NavigatingToAvatarandCover();
    	avatarandcoverPage
    	.ChangecoverPhoto(Imagepath);

}
}