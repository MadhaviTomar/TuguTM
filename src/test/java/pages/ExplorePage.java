package pages;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplorePage extends BasePage {

	public ExplorePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
	public WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	
	/**
	 * Variables
	 */

	/**
	 * Web Elements
	 */
	By explorelink		=  By.xpath("//*[@id=\"contnet\"]/div/div/div[1]/div/div/ul/li[8]/a");
	By query			=  By.xpath("//*[@id=\"query\"]");
	By country			=  By.xpath("//*[@id='country']");
	By searchbtn		=  By.xpath("//*[@id=\"search_form\"]/div/button");
	By username			=  By.xpath("//*[@id=\"users-cont\"]/div/div/div[1]/div[2]/h4/span/a");
	By pages			=  By.xpath("//*[@id=\"search_form\"]/div/ul/li[2]/a");
	By pagename			=  By.xpath("//*[@id=\"pages-cont\"]/div/div/div[2]/a");
	By groups			=  By.xpath("//*[@id=\"search_form\"]/div/ul/li[3]/a");
	By groupname		=  By.xpath("//*[@id=\"groups-cont\"]/div/div/div[2]/h3/a");
	By searchbar		=  By.xpath("//*[@id=\"navbar-searchbox\"]/div/input");
	
	
	
	
	

	
	public String SearchUser() throws InterruptedException {
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click(explorelink);
		System.out.println("Anaysha Chouhan");
		writeText(query,"Anaysha Chouhan");

		Select sc = new Select(driver.findElement(country));
		sc.selectByIndex(99);
	
		
		click(searchbtn);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300);");
	
		js.executeScript("window.scrollBy(0, 300);");
		String searchword = driver.findElement(username).getText();
		System.out.println(searchword);
		
		return searchword;
	}

	
	
	public String SearchPage() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -300);");
		
		driver.findElement(query).clear();
		writeText(query,"Techology News");
		System.out.println("Techology News");
		Select sc = new Select(driver.findElement(country));
		sc.selectByIndex(99);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(pages)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchbtn)).click();


		js.executeScript("window.scrollBy(0, 300);");
		wait.until(ExpectedConditions.visibilityOfElementLocated(pages)).click();
		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(3000);
		String searchword1 = driver.findElement(pagename).getText();
		System.out.println(searchword1);
		
		return searchword1;
	}


	
	public String SearchGroup() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(query).clear();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -300);");
		
		writeText(query,"LondonKidsGNW");
		System.out.println("LondonKidsGNW");
		Select sc = new Select(driver.findElement(country));
		sc.selectByIndex(99);
		wait.until(ExpectedConditions.visibilityOfElementLocated(groups)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchbtn)).click();

		
		js.executeScript("window.scrollBy(0, 300);");
		wait.until(ExpectedConditions.visibilityOfElementLocated(groups)).click();

		js.executeScript("window.scrollBy(0, 800);");
		String searchword2 = driver.findElement(groupname).getText();
		System.out.println(searchword2);
		
		return searchword2;
	}
	
	
	public void SearchBar() throws InterruptedException{
		
		String str1 = "//*[@id=\"users-cont\"]/div[";
		String str2 = "]/div/div[1]/div[2]/h4/span/a";
		
		int n =1;
		driver.findElement(By.xpath("/html/body/header/div[1]/nav/div/ul[1]/li/form/div/input")).sendKeys("rocky 123");
		
		driver.findElement(By.xpath("/html/body/header/div[1]/nav/div/ul[1]/li/form/div/input")).sendKeys(Keys.ENTER);
				
		js.executeScript("window.scrollBy(0,200);");
		for(int i =1;i<=n;i++) {
			
		String makestr = str1+i+str2;
		String data =	driver.findElement(By.xpath(makestr)).getText();
		System.out.println(data);
		
		
		
		}
	}
	
	
	
}
