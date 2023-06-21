package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;
import util.JSErrorLogs;
import util.Log;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.time.*;



public class LoginPage2 extends BasePage {
	/**
	 * Constructor
	 */
	   public WebDriverWait wait;
	
	public LoginPage2(WebDriver driver) {
		super(driver);
	}
	/**
	 * Variables
	 */	
	JavascriptExecutor js = (JavascriptExecutor) driver;


	/**
	 * Web Elements
	 */

	By userName                	= By.xpath("//*[@id='username']");
	By password              	= By.xpath("//*[@id='password']");
	By loginButton             	= By.xpath("//*[@id=\"login\"]/div[5]/div[1]/button");

	/**
	 * Variables
	 */
	String baseURL = "https://tuguapp.com/";


	/**
	 * Page Methods
	 * @throws InterruptedException 
	 */

	public void logintoTuguApp(String username, String Password) throws InterruptedException {
		Log.info("Trying to login to Tugu App.");
		
		
	//	Thread.sleep(15000);
	
		writeText(userName, username);
		
		writeText(password, Password);
	
		js.executeScript("window.scrollBy(0, 1500);");

		click(loginButton);
		
		js.executeScript("window.scrollBy(0, -1500);");

	} 
	
	public void logintoTuguApp2() throws InterruptedException {
				
		String username = "Akshit12";
		String Password = "Akshit@321";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Log.info("Trying to login to Tugu App.");
			
			 new WebDriverWait(driver, Duration.ofSeconds(40))
		        .until(ExpectedConditions.elementToBeClickable(userName));
			 Thread.sleep(3000);

		writeText(userName, username);
		
		writeText(password, Password);
		
		js.executeScript("window.scrollBy(0, 1500);");

		new WebDriverWait(driver, Duration.ofSeconds(20))
        .until(ExpectedConditions.elementToBeClickable(loginButton));

		click(loginButton);
		//new WebDriverWait(driver, Duration.ofSeconds(20));     
	}

}