package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import util.Log;

public class Savedpostpage extends BasePage{

	public Savedpostpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(40));

	String s1 = "/html/body/div[2]/div[2]/div/div/div[2]/div[9]/div/div[1]/div[";
	String s2 =	"]/div/div/div[1]/div[2]/span/ul/li[1]/div";
	
	String s3 = "]/div/div/div[1]/div[2]/span/a";
	String s4 = "]/div/div/div[1]/div[3]/div/span/a";
	String s5 = "]/div/div/div[1]/div[3]/h6/span[1]/a";
	
	/**
	 * Web Elements
	 */

	By followerpost                = By.xpath("//*[@id=\"filterby-post\"]");
	By followerpost1				= By.xpath("//*[@id=\"filterby-post\"]/li[8]");
	By followerpost2				= By.xpath("//*[@id=\"filterby-post\"]/li[7]");
	By cheveron						= By.xpath("//*[@id=\"post-627\"]/div/div[1]/div[2]/span/a");
	By savepost					   = By.xpath("//*[@id=\"post-627\"]/div/div[1]/div[2]/span/ul/li[1]");
	By savedpost					= By.xpath("//*[@id=\"contnet\"]/div/div/div[1]/div/div/ul/li[3]/a");
//	By username						= By.xpath("//*[@id=\"post-627\"]/div/div[1]/div[3]/div/span/a");
//	By time							= By.xpath("//*[@id=\"post-67\"]/div/div[1]/div[3]/h6/span/a");
	
	By savedpostusername			= By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[3]/div/span/a");
	By savedposttime				= By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[3]/h6/span[1]/a");
	
	
	public  void Savedpost(int svpost) throws InterruptedException   {
		
		String chevron= s1+svpost+s3;   System.out.println(chevron);
		String savpost = s1+svpost+s2; 	System.out.println(savpost);
		String username =s1+svpost+s4;	System.out.println(username);
		String time = s1+svpost+s5;		System.out.println(time);
		
		Log.info("Trying to validate Saved post from News Feed.");
		
		
		js.executeScript("window.scrollBy(0,480);"); 
	
	
		
	//	js.executeScript("window.scrollBy(0,350);");
		

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(chevron))).click();
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(savpost))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(username)));
		String name = driver.findElement(By.xpath(username)).getText();
		System.out.println(name);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(time)));
		String daytime=driver.findElement(By.xpath(time)).getText();
		System.out.println(daytime);
	
		wait.until(ExpectedConditions.elementToBeClickable(savedpost)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(savedpostusername));
		String svun= driver.findElement(savedpostusername).getText();
		System.out.println(svun);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(savedposttime));
		String svpt = driver.findElement(savedposttime).getText();
		System.out.println(svpt);
		
		Assert.assertEquals(name, svun);
		Assert.assertEquals(daytime, svpt);
		
		
	}
	
	
}