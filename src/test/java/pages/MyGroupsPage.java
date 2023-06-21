package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import util.Log;

public class MyGroupsPage extends BasePage {

	public MyGroupsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	/**
	 * Variables
	 */
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	
	/**
	 * Web Elements
	 */
	
	By mygroupslink = By.xpath("//*[@id=\"contnet\"]/div/div/div[1]/div/div/ul/li[6]/a");
	By creategroup  = By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/div/div/a");
	By groupname	= By.xpath("//*[@id='group_title']");
	By grouplink 	= By.xpath("//*[@id='group_name']");
	By desc			= By.id("group_about");
	By grouptype	= By.xpath("//*[@id='privacy']");
	By category		= By.id("category");
	By createbttn	= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/form/div[6]/button");
	By goback		= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[2]/form/div[6]/a");
	By grouplvl		= By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/a");
	By member		= By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div/div[2]/div[2]/div[2]/span");
	By edit     	= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div[3]/div[1]/div/div[2]/a");
	By categ		= By.xpath("//*[@id='group_category']");
	
	By descrip		= By.xpath("//*[@id='about']");
	By privatetype	= By.xpath("//*[@id='contnet']/div/div/div[3]/div/ul/li[3]/a");
	By prvcytype	= By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/div/form/div[2]/div/div/select");
	By avtar		= By.xpath("//*[@id=\"contnet\"]/div/div/div[3]/div/ul/li[4]/a");
	
	By img1			= By.xpath("//*[@id=\"cover\"]");
	By img2			= By.xpath("//*[@id=\"avatar\"]");
	By membr		= By.xpath("//*[@id=\"contnet\"]/div/div/div[3]/div/ul/li[5]/a");
	By pgAnalyzer	= By.xpath("//*[@id=\"contnet\"]/div/div/div[3]/div/ul/li[6]/a");
	By delet		= By.xpath("//*[@id=\"contnet\"]/div/div/div[3]/div/ul/li[7]/a");
	By pwd			= By.xpath("//*[@id=\"password\"]");
	By deletbtn		= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div/form/div[3]/button");
	By savebtn		= By.xpath("//*[@id=\"contnet\"]/div/div/div[2]/div/form/div[4]/button");
	
	
	

	
	public String MyGroups(String gname,String link,String gdesc,String type, String cat) throws InterruptedException    {
	
	Log.info("Trying to validate my groups.");

	click(mygroupslink);
	
	wait =   new WebDriverWait(driver,Duration.ofSeconds(35));
	wait.until(ExpectedConditions.visibilityOfElementLocated(creategroup));
	click(creategroup);
	Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(groupname));
	writeText(groupname, gname);
	
	writeText(grouplink, link);
	
	writeText(desc, gdesc);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 400);");
	
	Select se = new Select(driver.findElement(grouptype));
	// Select the option by index
	se.selectByVisibleText(type);
	
	Select se1 = new Select(driver.findElement(category));
	
	// Select the option by index
	se1.selectByVisibleText(cat);
	
	wait.until(ExpectedConditions.elementToBeClickable(createbttn)).click();
		
	String level =driver.findElement(By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/a")).getText();
	String membernumber = driver.findElement(By.xpath("//*[@id=\"contnet\"]/div[1]/div[1]/div/div[2]/div[2]/div[2]/span")).getText();
	
	return level;
	}
	
	
	public void EditSetting() throws InterruptedException {
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mygroupslink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(edit)).click();
		wait.until(ExpectedConditions.elementToBeClickable(groupname)).click();
		writeText(groupname, "Indiandrammas");
		clear(grouplink);
		writeText(grouplink, "Indiandrammas");
		Select se1 = new Select(driver.findElement(categ));
		
		// Select the option by index
		se1.selectByIndex(4);
		
		clear(descrip);
		writeText(descrip, "Indian Movies are the best Entertainment for people");
		wait.until(ExpectedConditions.elementToBeClickable(privatetype)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(grouptype));
		driver.findElement(grouptype).click();
		Select se2 = new Select(driver.findElement(grouptype));
		// Select the option by index
		se2.selectByVisibleText("Private ");
		
		js.executeScript("window.scrollBy(0, 300);");
		
		wait.until(ExpectedConditions.elementToBeClickable(avtar)).click();

		driver.findElement(img1).sendKeys("C:\\Users\\akshi\\OneDrive\\Desktop\\1020071.jpg");
		
		js.executeScript("window.scrollBy(0, 300);");
				
		driver.findElement(img2).sendKeys("C:\\Users\\akshi\\OneDrive\\Desktop\\1020071.jpg");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, 100);");
		wait.until(ExpectedConditions.elementToBeClickable(savebtn)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(membr)).click();
	
		wait.until(ExpectedConditions.elementToBeClickable(pgAnalyzer)).click();
		
	}
	
	
	public void DeleteGroup() throws InterruptedException {
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click(mygroupslink);
		wait =   new WebDriverWait(driver,Duration.ofSeconds(35));
		wait.until(ExpectedConditions.visibilityOfElementLocated(edit));
		click(edit);
		wait =   new WebDriverWait(driver,Duration.ofSeconds(35));
		wait.until(ExpectedConditions.visibilityOfElementLocated(delet));
		click(delet);
		writeText(pwd, "Akshit@321");
		click(deletbtn);	
	
	}
	}

