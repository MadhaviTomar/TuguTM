package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import util.Log;

public class HomePage2 extends BasePage{

	public HomePage2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	/**
	 * Web Elements
	 */
	By loginregister        = By.xpath("//*[@id=\"html-body\"]/div[7]/header/div[3]/div[1]/div/a");
	By Register				= By.xpath("//*[@id=\"login\"]/div[5]/div[2]/p/a");
	/**
	 * Variables
	 */
	String baseURL = "https://tuguapp.com/";
	


	/**
	 * Page Methods
	 * @throws InterruptedException 
	 */

	//Go to Login Page

	public HomePage2 openTuguApp() throws InterruptedException {
		Log.info("Opening Tugu App.");
	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));; 
		driver.get(baseURL);
	//	Thread.sleep(5000);
		return this;
	}

	
	public LoginPage loginTuguApp() throws InterruptedException {
		Log.info("Click on login TuguApp.");
	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		click(loginregister);
	//	Thread.sleep(5000);
		return new LoginPage(driver);
	}
	
	
 


}
