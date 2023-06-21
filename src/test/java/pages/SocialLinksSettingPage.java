package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Log;

public class SocialLinksSettingPage extends BasePage  {

	public SocialLinksSettingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Web Elements
     */

	By facebook      = By.xpath("//*[@id=\"facebook\"]");
	By twitter       = By.xpath("//*[@id=\"twitter\"]");
	By vkon          = By.xpath("//*[@id=\"vk\"]");
	By linkdin       = By.xpath("//*[@id=\"linkedin\"]");
	By instagram     = By.xpath("//*[@id=\"instagram\"]");
	By youtube       = By.xpath("//*[@id=\"youtube\"]");
	By save          = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[5]/button");
	
	  /**
     * Page Methods
     * @throws InterruptedException 
     */
    
    public SocialLinksSettingPage  AddSocialLinks () throws InterruptedException {
        Log.info("Add SocialLinks");
        
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.visibilityOfElementLocated(facebook));
        writeText(facebook, "akshit122");
        w.until(ExpectedConditions.visibilityOfElementLocated(twitter));
        writeText(twitter, "akshitttt");
        w.until(ExpectedConditions.visibilityOfElementLocated(vkon));
        writeText(vkon, "akshitt");
        w.until(ExpectedConditions.visibilityOfElementLocated(linkdin));
        writeText(linkdin, "akshittqwe");
        w.until(ExpectedConditions.visibilityOfElementLocated(instagram));
        writeText(instagram, "akshittqe");
        w.until(ExpectedConditions.visibilityOfElementLocated(youtube));
        writeText(youtube, "aksh");
        
        
        
        return new SocialLinksSettingPage(driver);
}
}