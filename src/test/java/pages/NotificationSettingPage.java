package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class NotificationSettingPage extends BasePage {

	public NotificationSettingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 /**
     * Web Elements
     */
	
	By Someonelikepost         = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[2]/div[2]/div[1]/div");
	By SomeoneComment          = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[2]/div[2]/div[2]/div/label");
	By Someoneshare            = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[2]/div[2]/div[3]/div/label");
	By Someonefollowed         = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[2]/div[2]/div[4]/div/label");
	By Someonelikedmypage      = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[2]/div[2]/div[5]/div/label");
	By Someonevisitedprofile   = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[2]/div[2]/div[6]/div/label");
	By Someonementioned        = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[2]/div[2]/div[7]/div/label");
	By Someonejoinedgroup      = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[2]/div[2]/div[8]/div/label");
	By Someoneacceptedmyfriend = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[2]/div[2]/div[9]/div/label");
	By Someonepostedontimeline = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[2]/div[2]/div[10]/div/label");
	By save                    = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[3]/button");
	
	/**
     * Page Methods
     * @throws InterruptedException 
     */
    
    public NotificationSettingPage  ChangeNotificationSetting () throws InterruptedException {
    	
    	 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
         w.until(ExpectedConditions.visibilityOfElementLocated(Someonelikepost)).click();
      //   click(Someonelikepost);
         w.until(ExpectedConditions.visibilityOfElementLocated(SomeoneComment)).click();
         w.until(ExpectedConditions.visibilityOfElementLocated(Someoneshare)).click();
         w.until(ExpectedConditions.visibilityOfElementLocated(Someonefollowed )).click();
         w.until(ExpectedConditions.visibilityOfElementLocated(Someonelikedmypage)).click();
         w.until(ExpectedConditions.visibilityOfElementLocated(Someonevisitedprofile)).click();
         
         WebElement scroll = driver.findElement(Someonementioned) ;
         System.out.println("lable is detected");
         ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
         w.until(ExpectedConditions.visibilityOfElementLocated(Someonementioned)).click();
         w.until(ExpectedConditions.visibilityOfElementLocated(Someonejoinedgroup)).click();
         w.until(ExpectedConditions.visibilityOfElementLocated( Someoneacceptedmyfriend)).click();
         w.until(ExpectedConditions.visibilityOfElementLocated( Someonepostedontimeline)).click();
         
         
         
    	return new NotificationSettingPage (driver);
    }
}
