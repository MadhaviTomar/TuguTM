package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import util.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProfilePage extends BasePage{

	public AddProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Variables
	 */

	/**
	 * Web Elements
	 */
	
	By uploadprofilepic = By.xpath("//*[@id=\"contnet\"]/div/div[2]/div/div[2]/div[1]/div");
	By saveandcontinue	= By.xpath("//*[@id=\"contnet\"]/div/div[2]/div/div[3]/button");
	By fname 			= By.xpath("//*[@id=\"first_name\"]");
	By lname			= By.xpath("//*[@id=\"last_name\"]");
	By country			= By.xpath("//*[@id=\"country\"]");
	By birthday			= By.xpath("//*[@id=\"usr_birthday\"]");
	
	By followandfinish	= By.xpath("//*[@id=\"contnet\"]/div/div[2]/div/div[3]/button");
	
	
	

	public void AddProfile (String img, String fname1, String lname1, String dob) throws InterruptedException, AWTException {
			
	 click(uploadprofilepic);
	 Robot rb = new Robot();
	 rb.delay(4000);
	 
	 StringSelection ss = new StringSelection(img);
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	 
	 
	 //CTRL+V
	 rb.keyPress(KeyEvent.VK_CONTROL);
	 rb.keyPress(KeyEvent.VK_V);
	 rb.delay(3000);
	 
	 rb.keyRelease(KeyEvent.VK_CONTROL);
	 rb.keyRelease(KeyEvent.VK_V);
	 rb.delay(3000);
	 
//	 Keys.ENTER;
	 
	 rb.keyPress(KeyEvent.VK_ENTER);
	 rb.keyRelease(KeyEvent.VK_ENTER);
	 
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 300);");
	 Thread.sleep(4000);
	click(saveandcontinue);
	
	writeText(fname, fname1);
	writeText(lname,lname1);
	
	js.executeScript("window.scrollBy(0, 200);");
	Select se = new Select(driver.findElement(country));
	se.selectByIndex(98);
	
	driver.findElement(birthday).sendKeys(dob);
	
	Thread.sleep(5000);
	click(saveandcontinue);
	
	Thread.sleep(20000);
	js.executeScript("window.scrollBy(0, 1000);");
	js.executeScript("window.scrollBy(0, 1000);");
	
	click(saveandcontinue);
	
	}
}
