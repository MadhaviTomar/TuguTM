package pages;

//import org.apache.logging.log4j.core.appender.rolling.action.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;

import java.util.*;
import java.util.concurrent.TimeUnit;

import util.Log;

public class RegisterationPage extends BasePage{

	//public static WebDriver     driver;
    public WebDriverWait wait;
    //Constructor
    public RegisterationPage(WebDriver driver) {
        
        super(driver);
    }
	//public RegisterationPage(WebDriver driver) {
	//	super(driver);
	//	        }
	/**
	 * Variables
	 */
	  
	int waittime =4000;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	/**
	 * Web Elements
	 */
	By Register				=By.xpath("//*[@id=\"contnet\"]/div/div[1]/div[1]/div/a[2]");
	By loginPage			=By.xpath("//*[@id=\"register\"]/div[9]/div[2]/p/a");
	By userName             = By.xpath("//*[@id=\"register\"]/label[1]/input");
	By userlastName         = By.xpath("//*[@id=\"register\"]/label[2]/input");
	By email				= By.xpath("//*[@id=\"register\"]/label[3]/input");
	By password             = By.xpath("//*[@id=\"password\"]");
	By confirmPassword		= By.xpath("//*[@id=\"register\"]/label[5]/input");
	By Gender				= By.xpath("//*[@id=\"gender\"]");
	By reCaptcha			= By.xpath("//*[@id='recaptcha-anchor']");
	By term					= By.xpath("//*[@id=\"register\"]/div[2]/label");
	By signupButton         = By.xpath("//*[@id=\"sign_submit\"]");
	By Namebtn				= By.xpath("//*[@id=\"head_menu_rght\"]/li[4]/a");
	By user					= By.xpath("//*[@id='head_menu_rght']/li[4]/a");
	By logout				= By.xpath("//*[@id='head_menu_rght']/li[4]/ul/li[14]/a");
	By Name					= By.xpath("//*[@id=\"update-username\"]/b");
	
	/**
	 * Variables
	 */
	String baseURL = "https://tuguapp.com/";


	/**
	 * Page Methods
	 * @throws InterruptedException 
	 */

	public void RegisterintoTuguApp(String username, String userlastrname,String Email, String Password, String ConfirmPassword,String Male) throws InterruptedException {
	Log.info("Trying to Register into Tugu App.");
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js.executeScript("window.scrollBy(0, 1500);");
		
		click(Register);
		writeText(userName, username);
		
		writeText(userlastName, userlastrname);
		
		writeText(email,Email);
		
		writeText(password, Password);
		
		js.executeScript("window.scrollBy(0, 1000);");
		writeText(confirmPassword,ConfirmPassword);
		
		// Create object of the Select class
		Select se = new Select(driver.findElement(Gender));
					
		// Select the option by index
		se.selectByIndex(2);
		
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));		
		Thread.sleep(5000);
		click(term);
		click(signupButton);
	}
	
	public String GetName() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click(Namebtn);
	
		String name1 = driver.findElement(By.xpath("//*[@id=\"update-username\"]/b")).getText();
		return name1;
		
	}


}
