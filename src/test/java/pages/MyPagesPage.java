package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyPagesPage extends BasePage {

	public MyPagesPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Variables
	 */
	WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(26));
	String img = "‪C:\\Users\\Asus\\Pictures\\images.jpg";

	/**
	 * Web Elements
	 */
	By mypageslink 		 =   By.xpath("//*[@id=\"contnet\"]/div/div/div[1]/div/div/ul/li[7]/a");
	By createpagelink	 = 	 By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/div/div/a");
	By pagename			=  	By.xpath("//*[@id='page_title']");
	By pglink			=	By.xpath("//*[@id='page_name']");
	By pagecategory		= 	By.id("page_category");
	By pagedesc			=	By.xpath("//*[@id='page_description']");
	By create			=	By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/form/div[6]/button");
	By pagetitle		=   By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div[2]/div[1]/div[2]/div/a");
	
	By editPage			=	By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[3]/div/div[1]/div[2]/div/a");
	By deletePagelink	=   By.xpath("//*[@id=\"contnet\"]/div/div/div[3]/div/ul/li[9]/a");
	By pwd				=   By.xpath("//*[@id=\"password\"]");
	By deletebttn		=   By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div/form/div[3]/button");
	By calltoaction		=   By.xpath("//*[@id=\"call_action_type\"]");
	By calltotarget		=	By.xpath("//*[@id=\"call_action_type_url\"]");
	By enable			=	By.xpath("//*[@id=\"users_post-0\"]");
	By savebttn			=	By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div/form/div[8]/button");
	By pginfo			=	By.xpath("//*[@id=\"contnet\"]/div/div/div[3]/div/ul/li[3]/a");
	By company			=	By.xpath("//*[@id=\"company\"]");
	By phone			=	By.xpath("//*[@id=\"phone\"]");
	By location			=	By.xpath("//*[@id=\"address\"]");
	By website			=	By.xpath("//*[@id=\"website\"]");
	By sociallinks		=	By.xpath("//*[@id=\"contnet\"]/div/div/div[3]/div/ul/li[4]/a");
										
	By Avatarimg		=	By.xpath("//*[@id=\"contnet\"]/div/div/div[3]/div/ul/li[5]/a");
	By coverpg			=	By.xpath("//*[@id=\"cover\"]");
	By pageimg			=	By.xpath("//*[@id='avatar']");
	By design			=	By.xpath("//*[@id=\"contnet\"]/div/div/div[3]/div/ul/li[6]/a");
	By bgpic			=	By.xpath("//*[@id='background_image']");
	By admin			=	By.xpath("//*[@id=\"contnet\"]/div/div/div[3]/div/ul/li[7]/a");
	By pageAnalyzer		=	By.xpath("//*[@id=\"contnet\"]/div/div/div[3]/div/ul/li[8]/a");
	By save				= 	By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div/form/div[3]/button");
	
	
	
	
		public String MyPages(String pgname,String pgurl, String pgcat, String pgdesc)  throws InterruptedException 
		{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(mypageslink)).click();
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(createpagelink)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(pagename));
		writeText(pagename,pgname);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(pglink));
		writeText(pglink, pgurl);
		
		Select se1 = new Select(driver.findElement(pagecategory));
		
		// Select the option by Visible text
		se1.selectByVisibleText(pgcat);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200);");
		
		writeText(pagedesc, pgdesc);
		
		js.executeScript("window.scrollBy(0, 200);");
		wait.until(ExpectedConditions.visibilityOfElementLocated(create)).click();
		
		
		
		String pgtitle= driver.findElement(By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div[2]/div[1]/div[2]/div/a")).getText();
		
		return pgtitle;
		}

		
		public void EditSetting() throws InterruptedException {
				
	//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(mypageslink)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(editPage)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(pagename)).clear();
		

			writeText(pagename, "FusionMusic");
			Select se1 = new Select(driver.findElement(pagecategory));
			
			// Select the option by Visible text
			se1.selectByVisibleText("Entertainment");
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(pglink)).click();

			
			writeText(pglink,"FusionMusic");
			
			Select se2 = new Select(driver.findElement(calltoaction));
			
			// Select the option by Visible text
			se2.selectByVisibleText("Read more");
			
			writeText(calltotarget, "www.google.com");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 200);");
			
			driver.findElement(By.xpath("//label[text()='Enable']")).click();
			
			js.executeScript("window.scrollBy(0, -500);");
					
			wait.until(ExpectedConditions.visibilityOfElementLocated(pginfo)).click();

			
			wait.until(ExpectedConditions.visibilityOfElementLocated(company));
			writeText(company,"Abc");
			
			writeText(phone, "1234512345");
			writeText(location, "India");
			writeText(website, "http://www.google.com");
			clear(pagedesc);
			writeText(pagedesc, "Hi! This is New Page ");
			js.executeScript("window.scrollBy(0, 100);");
			driver.findElement(By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div/form/div[5]/button")).click();
			
			js.executeScript("window.scrollBy(0, 200);");
			wait.until(ExpectedConditions.visibilityOfElementLocated(Avatarimg)).click();
			
		
			driver.findElement(coverpg).sendKeys("C:\\Users\\akshi\\OneDrive\\Desktop\\1020071.jpg");
					                                                                    
	//	driver.findElement(pageimg)
//			.sendKeys(".\\Photos\\pic1.jpg");

	//	js.executeScript("window.scrollBy(0, 100);");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(design)).click();
					
	//		driver.findElement(bgpic).sendKeys("‪‪‪.\\Photos\\pic5.jpg");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(save)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(admin)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(pageAnalyzer)).click();
				
		}
		
		public void DeletePage() throws InterruptedException {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(mypageslink)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(editPage)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(deletePagelink)).click();
			
			writeText(pwd,"Akshit@321");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(deletebttn)).click();
			
		}
		
}

