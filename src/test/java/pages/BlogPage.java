package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait; 


public class BlogPage extends BasePage {

	public BlogPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/** Variable
	 * **/
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String img = "C:\\Users\\akshi\\OneDrive\\Desktop\\Nidhi code\\TuguApp-Test15May\\TuguApp-Test15May\\Pictures\\1020071.jpg";
	/**
	 * Web Elements
	 * 
	 * **/
	
	By createbtn 		= By.xpath("/html/body/header/div[1]/nav/div/div/ul/li[2]");
	By crblog			= By.xpath("/html/body/header/div[1]/nav/div/div/ul/li[2]/ul/li[2]");
	By title 			= By.xpath("//*[@id=\"blog_title\"]");
	By content 			= By.xpath("//*[@id=\"new-blog-desc\"]");
	
	By desc  			= By.xpath("//*[@id=\"blog_ifr\"]");
	By thumbnail		= By.xpath("//*[@id=\"insert-blog\"]/div[4]/div/div[2]");
	By category			= By.xpath("//*[@id=\"blog_category\"]");
	By tags				= By.xpath("//*[@id=\"blog_tags\"]");
	By publish			= By.xpath("//*[@id=\"insert-blog\"]/div[7]/button");
	
	
	public void CreateBlog() throws InterruptedException, AWTException{
		
		new WebDriverWait(driver, Duration.ofSeconds(25))
        .until(ExpectedConditions.elementToBeClickable(createbtn));
		click(createbtn);
		new WebDriverWait(driver, Duration.ofSeconds(25))
        .until(ExpectedConditions.elementToBeClickable(crblog));
		click(crblog);
	//	Thread.sleep(10000);
		new WebDriverWait(driver, Duration.ofSeconds(25))
        .until(ExpectedConditions.visibilityOfElementLocated(title));
		writeText(title, "blog test");
		
		writeText(content," my blog.");
		js.executeScript("window.scrollBy(0, 300);");
		
				
		writeText(desc," HI my First blog");
		
		js.executeScript("window.scrollBy(0, 700);");
		
		
		click(thumbnail);
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
				
		js.executeScript("window.scrollBy(0, 200);");
		Select se = new Select(driver.findElement(category));
		se.selectByIndex(12);
		writeText(tags,"blog1");
		
		Thread.sleep(20000);
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(publish));
		click(publish);
		
	
		
		
	}
}
