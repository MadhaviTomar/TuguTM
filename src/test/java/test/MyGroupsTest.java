package test;

import org.testng.annotations.Test;

import static util.ExtentTestManager.startTest;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;

import utility2.TestUtil1;

public class MyGroupsTest extends BaseTest {


	
	
	@Test(dataProvider= "data", dataProviderClass = TestUtil1.class)
	  
	public void validateMyGroupsTest(String gname,String link,String gdesc,String type, String cat) throws InterruptedException, IOException, NoSuchMethodException{
		// Method method = getClass().getMethod("groupTest", String.class, String.class);
		 
		// startTest(method.getName(), "Add profile");
	
	homePage2.openTuguApp();
		
    loginPage2.logintoTuguApp2();
 
    String groupname = myGroupsPage.MyGroups(gname,link,gdesc,type,cat);
    Assert.assertEquals(gname, groupname);
	
	}
	

}
