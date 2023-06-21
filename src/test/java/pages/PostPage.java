package pages;



import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import util.Log;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class PostPage extends BasePage {

	private static final WebDriver WebDriverRefrence =null;

	public PostPage(WebDriver driver) {
		super(driver);
	}
		
	String postxpath;
	String hideuserpostxpath;
	String dropdownxpath;
	String deleteuserpostxpath;
	String disablepostcommentxpath;
	String deleteallpost;
	String comment;
	int searchpost;
	

	
	int a =0;
	String loop1;
	WebDriverWait wait =   new WebDriverWait(driver,Duration.ofSeconds(25));
	
	/**
	 * Web Element**/
	
	By usrpost1 			=  By.xpath("//*[@class='post-description']");
	By usrpost             	=  By.xpath("//*[@class='user-popover']");


	JavascriptExecutor js = (JavascriptExecutor) driver;
	String webe;
	WebElement webe1;
	Map<Integer,String> map;
	ArrayList<WebElement> list1;
	String s3 = "/html/body/div[2]/div[2]/div/div/div[2]/div[9]/div/div[1]/div[";
	String s4 =	"]/div/div/div[1]/div[2]/span/ul/li[5]/a";
	String s5 = "]/div/div/div[1]/div[2]/span/a";
	String s6 = "]/div/div/div[1]/div[2]/span/ul/li[2]/div";
	String s7 = "]/div/div/div[1]/div[2]/span/ul/li[3]/div";
	String s8 = "]/div/div/div[13]/div/div/div[3]/button";
	String s9 = "]/div/div/div[11]";
	String s10 = "]/div/div/div[1]/div[2]/span/ul/li[3]/div/div/b";

	
	public void AllpostonPage() throws InterruptedException {
				
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		String s1= "/html/body/div[2]/div[2]/div/div/div[2]/div[9]/div/div[1]/div[";
		String s2= "]/div/div/div[1]/div[3]/div/span/a";
				
		for(int i =1;i<=10;i++) {
			
			postxpath = s1+i+s2;
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(postxpath)));
			webe= driver.findElement(By.xpath(postxpath)).getText();
			System.out.println(webe);
			map.put(i,webe);
		}
		System.out.println(map);

	}
		

	
	public void HidePage(int hideuserpostno) throws InterruptedException {
	
		System.out.println(" hide post");
//		js.executeScript("window.scrollBy(0, 700);");
	 

		String s3 = "/html/body/div[2]/div[2]/div/div/div[2]/div[9]/div/div[1]/div[";
		String s5 = "]/div/div/div[1]/div[2]/span/a";
		
		String s4 =	"]/div/div/div[1]/div[2]/span/ul/li[4]/a";
			
				js.executeScript("window.scrollBy(0, 400);");
				
				dropdownxpath = s3+hideuserpostno+s5;
//				js.executeScript("window.scrollBy(0, 600);");
				System.out.println(dropdownxpath);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dropdownxpath))).click();
				
				hideuserpostxpath = s3+hideuserpostno+s4;
				System.out.println(hideuserpostxpath);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(hideuserpostxpath))).click();
		//		driver.findElement(By.xpath(hideuserpostxpath)).click();
								
		}
		
	
		public void OpenInNewTab(int openuserpostinNewTab) throws InterruptedException{
				
			
		
	//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String s4 =	"]/div/div/div[1]/div[2]/span/ul/li[5]/a";
			String s3 = "/html/body/div[2]/div[2]/div/div/div[2]/div[9]/div/div[1]/div[";
			String s5 = "]/div/div/div[1]/div[2]/span/a";		
			js.executeScript("window.scrollBy(0, 300);");
			try {
				
	//			js.executeScript("window.scrollBy(0, 400);");
				dropdownxpath = s3+openuserpostinNewTab+s5;			
				 wait =   new WebDriverWait(driver,Duration.ofSeconds(35));
				 
				 Thread.sleep(25000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropdownxpath)));

				System.out.println(dropdownxpath);
				driver.findElement(By.xpath(dropdownxpath)).click();
				
				String	openuserpostinNewTabxpath = s3+openuserpostinNewTab+s4;
				System.out.println(openuserpostinNewTabxpath);
				Thread.sleep(3000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(openuserpostinNewTabxpath)));
				driver.findElement(By.xpath(openuserpostinNewTabxpath)).click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
		
				System.out.println(driver.getCurrentUrl());

				String parent = driver.getWindowHandle();
				System.out.println(parent+ "  "+ driver.getTitle());
				int i =0;
				ArrayList<String> all = new ArrayList<String> (driver.getWindowHandles());
				for(String h : all)
				{
					System.out.println(h+"  "+ driver.getTitle());
					driver.switchTo().window(all.get(i++));
				}
				
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
		
			}catch(Exception e ) {
				e.printStackTrace();
			}
			
	}			
			
			
			public void disableCommentPost(int disablepostcomment) throws InterruptedException{
								
				String s3 = "/html/body/div[2]/div[2]/div/div/div[2]/div[9]/div/div[1]/div[";
				String s5 = "]/div/div/div[1]/div[2]/span/a";		
			
				try {
					js.executeScript("window.scrollBy(0, 400);");
					dropdownxpath = s3+disablepostcomment+s5;
					System.out.println(dropdownxpath);
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropdownxpath)));

					driver.findElement(By.xpath(dropdownxpath)).click();
					disablepostcommentxpath = s3+disablepostcomment+s7;
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(disablepostcommentxpath)));

					driver.findElement(By.xpath(disablepostcommentxpath)).click();
					Thread.sleep(4000);
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropdownxpath)));

					driver.findElement(By.xpath(dropdownxpath)).click();
					driver.navigate().refresh();
					Thread.sleep(4000);
					comment = s3+disablepostcomment+s9;
					System.out.println(comment);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(comment)));
					Thread.sleep(3000);
					
				driver.findElement(By.xpath(comment)).getText();
				
	//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropdownxpath)));

	//			driver.findElement(By.xpath(dropdownxpath)).click();
//				String EnableComment = s3+disablepostcomment+s10;
				
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EnableComment)));

//				System.out.println(driver.findElement(By.xpath(EnableComment)).getText());						
				}
				catch(Exception e ) {
					e.printStackTrace();
				}
			}  
			
		
		public void deletePost(int deleteuserpost) throws InterruptedException{
				
			
			
			String s3 = "/html/body/div[2]/div[2]/div/div/div[2]/div[9]/div/div[1]/div[";
			String s5 = "]/div/div/div[1]/div[2]/span/a";
				js.executeScript("window.scrollBy(0, 420);");
				
					try {
						
					dropdownxpath = s3+deleteuserpost+s5;
					System.out.println(dropdownxpath);
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropdownxpath)));	
					driver.findElement(By.xpath(dropdownxpath)).click();
					deleteuserpostxpath = s3+deleteuserpost+s6;
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteuserpostxpath)));	
					driver.findElement(By.xpath(deleteuserpostxpath)).click();
					deleteallpost = s3+ deleteuserpost + s8;
				
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(deleteallpost)));
					driver.findElement(By.xpath(deleteallpost)).click();
						
				}
					catch(Exception e ) {
					e.printStackTrace();
				}	
				}		
		
}