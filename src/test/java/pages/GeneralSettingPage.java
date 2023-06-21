package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Log;

public class GeneralSettingPage extends BasePage  {
	
	 public GeneralSettingPage  (WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    /**
	     * Web Elements
	     */

	    By Username              = By.xpath("//*[@id=\"username\"]");
	    By DOB                   = By.xpath("//*[@id=\"usr_birthday\"]");
	    By PhoneNo               = By.xpath("//*[@id=\"phone_number\"]");
	    By Country               = By.xpath("//*[@id=\"country\"]");
	    By weatherUnit           = By.xpath("//*[@id=\"weather_unit\"]");
	    By save                  = By.xpath("//*[@id=\"update_user_data\"]");
	    By ProfileSetting        = By.xpath("//*[@id=\"wo_main_sett_side\"]/div/ul/li[2]/a");
	    By SocialLinks           = By.xpath("//*[@id=\"wo_main_sett_side\"]/div/ul/li[3]/a");
	    By Notificationsetting   = By.xpath("//*[@id=\"wo_main_sett_side\"]/div/ul/li[4]");
	    By Avatarandcover        = By.xpath("//*[@id=\"wo_main_sett_side\"]/div/ul/li[6]/a");
	    By passwordsetting       = By.xpath("//*[@id=\"wo_main_sett_side\"]/div/ul/li[9]");
	    By privacysetting        = By.xpath("//*[@id=\"wo_main_sett_side\"]/div/ul/li[9]/a");
	    
	    
	    
	    /**
	     * Page Methods
	     * @throws InterruptedException 
	     */
	    
	    public GeneralSettingPage  EditGeneralSetings () throws InterruptedException {
	        Log.info("Edit Settings");
	        
	        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
	        w.until(ExpectedConditions.visibilityOfElementLocated(Username));
	        clear(Username);
	        w.until(ExpectedConditions.visibilityOfElementLocated(Username));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        writeText(Username, "Akshit12");
	        w.until(ExpectedConditions.visibilityOfElementLocated(PhoneNo));
	        writeText(PhoneNo, "1234567890");
	        w.until(ExpectedConditions.visibilityOfElementLocated(DOB));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        writeText(DOB, "19970912");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        writeText(Country, "Canada");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        writeText(weatherUnit, "C");
	        Thread.sleep(3000);
	        click(save);	        
	        
	        
	        return new GeneralSettingPage(driver);
	        
}
	    public GeneralSettingPage  NavigatingToProfileSetting () throws InterruptedException {	  
	    	
	    	click(ProfileSetting);
	    	
	    	
	    	
	    	return new GeneralSettingPage(driver);
	    }
	    
	    public GeneralSettingPage  NavigatingToSocialLinks () throws InterruptedException {	  
	    
	    click(SocialLinks);
	    
	    return new GeneralSettingPage(driver);
	    }
	    
	    public GeneralSettingPage  NavigatingToNotificationSetting () throws InterruptedException {	  
		    
		    click(Notificationsetting);
		    
		    return new GeneralSettingPage(driver);
		    }
	    
        public GeneralSettingPage  NavigatingToAvatarandCover () throws InterruptedException {	  
		    
		    click(Avatarandcover);
		    
		    return new GeneralSettingPage(driver);
		    }
 public GeneralSettingPage  NavigatingToPasswordSetting () throws InterruptedException {	  
		    
		    click(passwordsetting );
		    
		    return new GeneralSettingPage(driver);
		    }
 public GeneralSettingPage  NavigatingToPrivacySetting () throws InterruptedException {	  
	    
	    click(privacysetting);
	    
	    return new GeneralSettingPage(driver);
	    }
}