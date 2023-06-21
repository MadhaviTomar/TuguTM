package test;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import util.Log;
import pages.AddProfilePage;
import pages.AlbumsPage;
import pages.AvatarAndCoverPage;
import pages.BlogPage;
import pages.ExplorePage;
import pages.GeneralSettingPage;
import pages.HomePage;
import pages.HomePage2;
import pages.LoginPage;
import pages.LoginPage2;
import pages.LogoutPage;
import pages.MyGroupsPage;
import pages.MyPagesPage;
import pages.NotificationPage;
import pages.NotificationSettingPage;
import pages.PasswordSettingPage;
import pages.PostPage;
import pages.PrivacySettingPage;
import pages.ProfileSettingPage;
import pages.RecentNewsFeedPage;
import pages.RegisterationPage;
import pages.Savedpostpage;
import pages.SocialLinksSettingPage;

public class BaseTest {

	public WebDriver driver;

	public LoginPage loginPage;
	public HomePage homePage;
	public GeneralSettingPage generalsettingPage;
	public ProfileSettingPage profilesettingPage;
	public NotificationSettingPage notificationsettingPage;
	public AvatarAndCoverPage avatarandcoverPage;
	public PasswordSettingPage passwordsettingPage;
	public PrivacySettingPage privacysettingPage;
	public SocialLinksSettingPage sociallinkssettingPage;
     public ExplorePage explorePage;
	    public AddProfilePage addprofilepage;
	    public Savedpostpage savedpostpage;
	    public BlogPage blogpage;
	    public PostPage postpage;
	    public NotificationPage notificationPage;
	    public LogoutPage logoutPage;
	    public RegisterationPage registerationPage;
	    public RecentNewsFeedPage recentNewsFeedPage;
	    public MyGroupsPage myGroupsPage;
	    public MyPagesPage myPagesPage;
	    public AlbumsPage albumPage;
	    public LoginPage2  loginPage2;
	    public HomePage2 homePage2;
	    public FirefoxProfile profile;
	    public FirefoxProfile firefoxProfiles;
	    
	public WebDriver getDriver()
	{
		return driver;
	}

	
	
	  @BeforeClass public void classLevelSetup() throws InterruptedException {
	  Log.info("Tests is starting!"); System.setProperty("webdriver.chrome.driver",
	  "./Driver/chromedriver.exe");
	  ChromeOptions option=new ChromeOptions();
	  option.setPageLoadStrategy(PageLoadStrategy.NONE);
	  option.addArguments("--remote-allow-origins=*");
	  option.addArguments("disable-notifications"); //
	 // option.addArguments("--headless");
	  
	  //driver.manage().window().setSize(new Dimension(1440, 900));
	  driver = new
	  ChromeDriver(option); driver.manage().window().maximize();
	//  driver.manage().window().setSize(new Dimension(1920 ,1080));
	  
	  }
	 


	/*
	 * @BeforeClass public void classLevelSetup() throws InterruptedException {
	 * Log.info("Tests are starting!"); System.setProperty("webdriver.gecko.driver",
	 * ".//Driver//geckodriver.exe");
	 * 
	 * FirefoxOptions options = new FirefoxOptions();
	 * 
	 * options.setPageLoadStrategy(PageLoadStrategy.NONE);
	 * options.setCapability("dom.webnotifications.enabled", false);
	 * //options.addArguments("disable-notifications");
	 * 
	 * driver = new FirefoxDriver(options);
	 * 
	 * driver.manage().window().maximize(); //
	 * options.setCapability("dom.webnotifications.enabled", false); }
	 */
	@BeforeMethod
	public void methodLevelSetup1() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		generalsettingPage = new GeneralSettingPage(driver);
		profilesettingPage = new ProfileSettingPage(driver);
		sociallinkssettingPage = new SocialLinksSettingPage(driver);
		notificationsettingPage = new NotificationSettingPage(driver);
		avatarandcoverPage = new AvatarAndCoverPage(driver);
		privacysettingPage = new PrivacySettingPage(driver);
		passwordsettingPage = new PasswordSettingPage(driver);
		registerationPage = new RegisterationPage(driver);
	        recentNewsFeedPage = new RecentNewsFeedPage(driver);
	        myGroupsPage = new MyGroupsPage(driver);
	        myPagesPage = new MyPagesPage(driver);
	        albumPage = new AlbumsPage(driver);
	        explorePage = new ExplorePage(driver);
	        addprofilepage = new AddProfilePage(driver);
	        savedpostpage = new Savedpostpage(driver);
	        blogpage = new BlogPage(driver);
	        postpage = new PostPage(driver);
	        loginPage2 = new LoginPage2(driver);
	        homePage2=new HomePage2(driver);
	        logoutPage = new LogoutPage(driver);
	        notificationPage = new NotificationPage(driver);
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@AfterMethod public void methodLevelSetup() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 }

@AfterClass
 public void afterClassSetup() throws InterruptedException{
	 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 }

	@AfterClass
	public void teardown() {

		Log.info("Tests are ending!");
		 driver.quit();
	}
}