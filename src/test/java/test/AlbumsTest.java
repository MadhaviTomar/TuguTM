package test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility2.TestUtil3;

public class AlbumsTest extends BaseTest{

	@Test(dataProvider ="data", dataProviderClass=TestUtil3.class)
	public void ValidateCreateAlbum(String picture, String albmname) throws InterruptedException,AWTException, IOException, NoSuchMethodException{
		// Method method = getClass().getMethod("SendAudio", String.class, String.class);
			
	//	startTest(method.getName(), "Add profile");
		homePage2.openTuguApp();
			
	   loginPage2.logintoTuguApp2();
	   
	   albumPage.CreateAlbum(picture, albmname );
	     
	}
}
