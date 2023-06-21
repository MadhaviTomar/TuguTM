package test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.test.Utility.TestUtil3;

public class UploadFileTest extends BaseTest{
	
	@Test(dataProvider = "data", dataProviderClass = TestUtil3.class )
	
	public void Uploadfile (String Filepath, String Filetype ) throws InterruptedException, IOException {

		String emailidinput="Akshit12";
    	String password="Akshit@321";
    	
    	loginPage
    	.logintoTugu(emailidinput, password);
    	Thread.sleep(7000);
    	homePage 
    	.UploadFile(Filepath);

}
}