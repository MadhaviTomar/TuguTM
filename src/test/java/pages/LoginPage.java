package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Log;
public class LoginPage extends BasePage {
    /*
     * --**
     * Constructor
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    /**
     * Web Elements
     */

    By userNameId                = By.xpath("//*[@id=\"login\"]/div[2]/label[1]/input");
    By passwordId                = By.xpath("//*[@id=\"login\"]/div[2]/label[2]/input");
    By loginButton            = By.xpath("//*[@id=\"login\"]/div[2]/button");
    By Gotit                  = By.xpath("/html/body/div[1]/div/a");
    
   
  
    
    /**
     * Variables
     */
    String baseURL = ("https://tuguapp.com/");
    
    
    /**
     * Page Methods
     * @throws InterruptedException 
     */
    
    public LoginPage logintoTugu(String username, String password) throws InterruptedException {
        Log.info("Trying to login Tugu.");
        Thread.sleep(4000);
        driver.get(baseURL);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
  	    w.until(ExpectedConditions.visibilityOfElementLocated(userNameId));
       
        writeText(userNameId, username);
        w.until(ExpectedConditions.visibilityOfElementLocated(passwordId));
        writeText(passwordId, password);
       // w.until(ExpectedConditions.visibilityOfElementLocated(Gotit));
       // click(Gotit);
        Thread.sleep(4000);
        w.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        click(loginButton);
        Thread.sleep(5000);
        return new LoginPage(driver);
            }}