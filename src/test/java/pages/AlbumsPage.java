package pages;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.KeyDocument;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import java.awt.datatransfer.*;
import java.awt.event.*;
import java.awt.*;


public class AlbumsPage extends BasePage {

	public AlbumsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Variables
	 */

	/**
	 * Web Elements
	 */
	By albumslink  		= By.xpath("//*[@id=\"contnet\"]/div/div/div[1]/div/div/ul/li[2]/a");
	By createbutton		= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/div/div/a");
	By albumname		= By.xpath("//*[@id='album_name']");
	By uploadimg		= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/form/div[2]/div/div[2]");
	By publish			= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/form/div[6]/button");
		
	
		
		public void CreateAlbum(String picture, String albmname)  throws InterruptedException, AWTException 
		{
			try {
				
				WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(26));
				wait.until(ExpectedConditions.visibilityOfElementLocated(albumslink));
			click(albumslink);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(createbutton));
			click(createbutton);
			wait.until(ExpectedConditions.visibilityOfElementLocated(albumname));
			
			writeText(albumname,albmname);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 200);");
			
			click(uploadimg);
			 
		//	 driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/form/div[2]/div/div[2]")).sendKeys("/Photos/pic2.jpg");
			
			/*  1} Copy the path
			 * 2) CTRL+V
			 * 3) Enter */
			 
			 Robot rb = new Robot();
			 rb.delay(4000);
			 
			 StringSelection ss = new StringSelection(picture);
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			 
			 
			 //CTRL+V
			 rb.keyPress(KeyEvent.VK_CONTROL);
			 rb.keyPress(KeyEvent.VK_V);
			 rb.delay(3000);
			 
			 rb.keyRelease(KeyEvent.VK_CONTROL);
			 rb.keyRelease(KeyEvent.VK_V);
			 rb.delay(3000);
			 
			 
		// mouse move
			 rb.mouseMove(34, 34);
			 
		//	 Keys.ENTER;
			 
			 rb.keyPress(KeyEvent.VK_ENTER);
			 rb.keyRelease(KeyEvent.VK_ENTER);
			 			
			click(publish);
			Runtime.getRuntime().exit(1);
			System.exit(0);
		
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
		
		}





}
