package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrivacySettingPage extends BasePage {

	public PrivacySettingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
     By followprivacy             = By.xpath("//*[@id=\"follow_privacy\"]");
     By followpeopleifollow       = By.xpath("//*[@id=\"follow_privacy\"]/option[2]");
     By messageprivacy            = By.xpath("//*[@id=\"message_privacy\"]");
     By messageprivacy2           = By.xpath("//*[@id=\"message_privacy\"]/option[2]");
     By messageprivacy3           = By.xpath("//*[@id=\"message_privacy\"]/option[3]");
     By friendprivacy             = By.xpath("//*[@id=\"friend_privacy\"]");
     By frienddropdown1           = By.xpath("//*[@id=\"friend_privacy\"]/option[1]");
     By frienddropdown2           = By.xpath("//*[@id=\"friend_privacy\"]/option[2]");
     By frienddropdown3           = By.xpath("//*[@id=\"friend_privacy\"]/option[3]");
     By frienddropdown4           = By.xpath("//*[@id=\"friend_privacy\"]/option[4]");
     By timelineprivacy           = By.xpath("//*[@id=\"post_privacy\"]");
     By timelineprivacy1          = By.xpath("//*[@id=\"post_privacy\"]/option[1]");
     By timelineprivacy2          = By.xpath("//*[@id=\"post_privacy\"]/option[2]");
     By timelineprivacy3          = By.xpath("//*[@id=\"post_privacy\"]/option[3]");
     By birthdayprivacy           = By.xpath("//*[@id=\"birth_privacy\"]");
     By birthdayprivacy1          = By.xpath("//*[@id=\"birth_privacy\"]/option[1]");
     By birthdayprivacy2          = By.xpath("//*[@id=\"birth_privacy\"]/option[2]");
     By birthdayprivacy3          = By.xpath("//*[@id=\"birth_privacy\"]/option[3]");
     By savebutton                = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[3]/button");
     
     
     /**
	     * Page Methods
	     * @throws InterruptedException 
	     */
     
     public PrivacySettingPage ChangeFollowMeSetting () throws InterruptedException {
    	 
    	 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20) );
    	 w.until(ExpectedConditions.visibilityOfElementLocated(followprivacy )).click();
    	 w.until(ExpectedConditions.visibilityOfElementLocated(followpeopleifollow )).click();
    	  WebElement scroll = driver.findElement(savebutton) ;
          System.out.println("lable is detected");
          ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
    	// click(savebutton);
    	 return new PrivacySettingPage (driver);
    	 
     }
}
	/*
	 * public PrivacySettingPage Change () throws InterruptedException {
	 * 
	 * WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20) );
	 * w.until(ExpectedConditions.visibilityOfElementLocated(followprivacy
	 * )).click();
	 * 
	 * }
	 */
