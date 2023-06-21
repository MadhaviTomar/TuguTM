package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage {

	public LogoutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	By profile			=  By.xpath("//*[@id=\"head_menu_rght\"]/li[4]/a");
	By logoutbtn		= By.xpath("//*[@id=\"head_menu_rght\"]/li[4]/ul/li[15]/a");



	public void LogOut() {
		// TODO Auto-generated method stub
		click(profile);
		click(logoutbtn);
	}
}
