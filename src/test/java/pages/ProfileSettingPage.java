package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Log;

public class ProfileSettingPage extends BasePage  {

	public ProfileSettingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//Actions a = new Actions(driver);
    /**
     * Web Elements
     */
	
      By Firstname       = By.xpath("//*[@id=\"first_name\"]");
      By Lastname        = By.xpath("//*[@id=\"last_name\"]");
      By aboutme         = By.xpath("//*[@id=\"about\"]");
      By School          = By.xpath("//*[@id=\"school\"]");
      By Completed       = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div[1]/form/div[6]/div[2]/label");
      By Workingat       = By.xpath("//*[@id=\"working\"]");
      By Workingsite     = By.xpath("//*[@id=\"working_link\"]");
      By relationship    = By.xpath("//*[@id=\"relationship\"]");
      By dropdownsingle  = By.xpath("//*[@id=\"relationship\"]/option[2]");
      By save            = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div[1]/form/div[10]/button");
      
      
      
      /**
	     * Page Methods
	     * @throws InterruptedException 
	     */
	    
	    public ProfileSettingPage  EditProfileSetting () throws InterruptedException {
	      
	    	Log.info("Edit Profile Settings");
	    	clear(Firstname);
	    	clear(Lastname);

			/*
			 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			 * System.out.println("Waiting for element to be visible"); WebElement element =
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "//*[@id=\"wo_main_sett_mid\"]/div[1]/form/div[6]/div[2]")));
			 * element.click();
			 */
	//   WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
	  //  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wo_main_sett_mid\"]/div[1]/form/div[6]/div[2]")));
	       
	  //  click(Completed);

			/*
			 * Log.info("Edit Profile Settings"); clear(Firstname); clear(Lastname); // new
			 * WebDriverWait(driver, Duration.ofSeconds(10)) //
			 * .until(ExpectedConditions.elementToBeClickable(Completed)).click(); //
			 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "//*[@id=\"wo_main_sett_mid\"]/div[1]/form/div[6]/div[2]/label"))).click();
			 * // click(Completed);
			 */	       
			
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  writeText(Firstname, "Kaushik"); writeText(Lastname, "Akshit");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  writeText(aboutme, "Hi i am an Automation Tester");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  writeText(School, "MAMS");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  click(Completed); Thread.sleep(3000); WebElement scroll =
			  driver.findElement(By.xpath("//*[@id=\"working\"]"));
			  ((JavascriptExecutor)driver).executeScript(
			  "arguments[0].scrollIntoView(true);", scroll);
			  //((JavascriptExecutor)driver).executeScript(
			 // "arguments[0].scrollIntoView(true);", scroll);
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  writeText(Workingat,"Hapleaf");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  writeText(Workingsite , "https://hapleaf.com/");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  click(relationship);
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  click(dropdownsingle);
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  click(save);
//	    	
//	    	
	    	
	    	 return new ProfileSettingPage(driver);
	    }}      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      


