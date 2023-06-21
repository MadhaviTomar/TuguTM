package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PasswordSettingPage extends BasePage {

	public PasswordSettingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By Currentpassword          = By.xpath("//*[@id=\"current_password\"]");
	By Newpassword              = By.xpath("//*[@id=\"new_password\"]");
	By Repeatpassword           = By.xpath("//*[@id=\"repeat_new_password\"]");
	By twofactorauthentication  = By.xpath("//*[@id=\"country\"]");
	By savebutton               = By.xpath("//*[@id=\"wo_main_sett_mid\"]/div/form/div[5]/button");
	
	
	/**
     * Page Methods
     * @throws InterruptedException 
     */
    
    public PasswordSettingPage  Changepassword () throws InterruptedException {
    	
    	
    	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.visibilityOfElementLocated(Currentpassword)).sendKeys("123456");
        w.until(ExpectedConditions.visibilityOfElementLocated(Newpassword)).sendKeys("Akshit@321");
        w.until(ExpectedConditions.visibilityOfElementLocated(Repeatpassword)).sendKeys("Akshit@321");
        w.until(ExpectedConditions.visibilityOfElementLocated(twofactorauthentication)).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(savebutton)).click();
    	
    	
    	return new PasswordSettingPage (driver);
    	
    }
    	
	
}
