package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Log;

public class AvatarAndCoverPage extends BasePage  {

	public AvatarAndCoverPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}/**
     * Web Elements
     */
	
	By coverphoto       = By.xpath("/html/body/div[4]/div[2]/div[3]/div/div[2]/div/form/div[2]/div[1]");
	By profilephoto     = By.xpath("//*[@id=\"avatarimage-holder\"]");
	By savebutton       = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[4]/button");
	
	
	 /**
     * Page Methods
     * @throws InterruptedException 
     */
	
	public AvatarAndCoverPage ChangecoverPhoto (String Imagepath) throws InterruptedException, IOException {
    	Log.info("Change Cover Photo");
    	
    	Thread.sleep(10000);
    	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
    	//w.until(ExpectedConditions.visibilityOfElementLocated(coverphoto)).click();
    	w.until(ExpectedConditions.visibilityOfElementLocated(coverphoto));
    	driver.findElement(coverphoto).sendKeys(Imagepath);
    	
    	//writeText(coverphoto, "Imagepath");
       // driver.findElement(coverphoto).sendKeys(Imagepath);
    	 return new AvatarAndCoverPage (driver);

}}