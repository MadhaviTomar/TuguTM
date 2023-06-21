package pages;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFPictureData;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Log;

public class HomePage extends BasePage {
    /*
     * --**
     * Constructor
     */
    public HomePage (WebDriver driver) {
        super(driver);
    } 
    JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions a = new Actions(driver);
	
 //   String filepath = "C:\\Users\\akshi\\OneDrive\\Desktop\\image.xlsx";
    /**
     * Web Elements
     */

    By Poststatus               = By.xpath("//*[@id=\"post-textarea\"]/div/textarea");
    By emoji                    = By.xpath("//*[@id=\"dropdownEmo\"]");
    By emojidropdown            = By.xpath("//*[@id=\"post-textarea\"]/div/div[2]/ul/span[12]/span");
    By sharebutton              = By.xpath("//*[@id=\"publisher-button\"]");//*[@id="publisher-button"]
    By uploadImage              = By.xpath("//*[@id=\"publisher-photos\"]");
    By uploadVideo              = By.xpath("//*[@id=\"publisher-video\"]");
    By dropdownbutton           = By.xpath("//*[@id=\"head_menu_rght\"]/li[4]/a");
    By logout                   = By.xpath("//*[@id=\"head_menu_rght\"]/li[4]/ul/li[15]/a");
    By createpoll               = By.xpath("//*[@id=\"publisher-box-focus\"]/div/div[12]/div[3]/span");
    By answer1                  = By.xpath("//*[@id=\"poll-form\"]/div[1]/input[1]");
    By answer2                  = By.xpath("//*[@id=\"poll-form\"]/div[1]/input[2]");
    By addanswer                = By.xpath("//*[@id=\"add_answer\"]/div");//*[@id="add_answer"]/div
    By addactivity              = By.xpath("//*[@id=\"publisher-box-focus\"]/div/div[13]/div[1]/div[3]/div");
    By feelings                 = By.xpath("//*[@id=\"emo-form\"]/div[2]/ul/li[1]");
    By sleepy                   = By.xpath("//*[@id=\"emo-form\"]/div[3]/ul/li[16]");
    By coloroptions             = By.xpath("//*[@id=\"publisher-box-focus\"]/div/div[13]/div[1]/div[5]/div");
    By color                    = By.xpath("//*[@id=\"publisher-box-focus\"]/div/div[12]/div[1]/div/div[5]");
    By gotit                    = By.xpath("/html/body/div[1]/div");
    By chatsearch               = By.xpath("/html/body/div[2]/div[4]/div[1]/div[2]/div[3]/input");
    By chatname                 = By.xpath("//*[@id=\"online_23\"]");
    By chattextarea             = By.name("textSendMessage");
    By maximize                 = By.xpath("//*[@id=\"chat_23\"]/div[1]/div[2]/a");
    By Deletechat               = By.xpath("//*[@id=\"wo_msg_right_prt\"]/ul/li[1]/span/span[3]");
    By ChatEmoji                = By.xpath("//*[@id=\"chat_23\"]/div[2]/div[2]/form/div[2]/div[2]");
    By sendemoji                = By.xpath("//*[@id=\"chat_23\"]/div[2]/div[2]/form/div[2]/div[2]/span/ul/span[12]");
    By chatcolor                = By.xpath("//*[@id=\"chat_23\"]/div[2]/div[2]/form/div[2]/div[1]/span[5]");
    By selectcolor              = By.xpath("//*[@id=\"chat_23\"]/div[2]/div[2]/form/div[2]/div[1]/span[5]/ul/div/a[11]");
    By closechatpopup           = By.xpath("//*[@id=\"chat_23\"]/div[1]/div[2]");
    By sendfile                 = By.xpath("//*[@id=\"progressIcon\"]");
    By ChatSettings             = By.xpath("/html/body/div[4]/div[4]/div[1]/div[2]/div[1]/div/div[2]");
    By Offlinetab               = By.xpath("/html/body/div[4]/div[4]/div[1]/div[2]/div[1]/div/div[2]/ul/li[2]/a");
    By rightmenu                = By.xpath("//*[@id=\"head_menu_rght\"]/li[4]");
    By GeneralSettings          = By.xpath("//*[@id=\"head_menu_rght\"]/li[4]/ul/li[11]/a");
  
    
    /**
     * Page Methods
     * @throws InterruptedException 
     */
    
    public HomePage Poststatus () throws InterruptedException {
        Log.info("Publish a status");
        //Thread.sleep(6000);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(Poststatus);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        writeText(Poststatus,"Hi all");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(emoji);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        click(emojidropdown);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(sharebutton);
        
        return new HomePage(driver);
        
    }
    public HomePage UploadImage (String Imagepath) throws InterruptedException, IOException {
    	Log.info("Uploading an Image");
    	
    	 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 w.until(ExpectedConditions.visibilityOfElementLocated(Poststatus));
        click(Poststatus);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        writeText(Poststatus,"Hi all");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//*[@id=\"publisher-photos\"]")).sendKeys(Imagepath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        WebElement scroll = driver.findElement(By.xpath("//*[@id=\"publisher-button\"]")) ;
        System.out.println("lable is detected");
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
        //scroll.sendKeys(Keys.PAGE_DOWN);
        System.out.println("scroll is executed successfully");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(sharebutton);
        //w.until(ExpectedConditions.visibilityOfElementLocated(dropdownbutton));
        Thread.sleep(12000);
        click(dropdownbutton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(logout);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // File src		    = new File(filepath);
		//FileInputStream fis = new FileInputStream(src);
	//	XSSFWorkbook wb 	= new XSSFWorkbook(fis);
		/*XSSFSheet sheet1 	= wb.getSheetAt(0);
		int rows 			= sheet1.getLastRowNum();
		
		int cols 			= sheet1.getRow(1).getLastCellNum();
		System.out.println("Total number of rows---" + (rows));						
		System.out.println("Total number of columns---" + cols+"\n");
	
		String[][] data = new String[rows][cols];
		data = new String[rows][cols];
		for(int i =0; i<=rows-1; i++)
		{
			XSSFRow row = sheet1.getRow(i);
			for(int j = 0; j<cols;j++) {
				
			//DataFormatter df = new DataFormatter();
			//data[i][j] = df.formatCellValue(sheet1.getRow(i).getCell(j));
	
				System.out.println(" ");
				for(String[] dataArr : data) {*/
		/*
		 * System.out.println(java.util.Arrays.toString(dataArr));
		 * System.out.println(data); } } }
		 */
       // File src		    = new File(filepath);
		//FileInputStream fis = new FileInputStream(src);
		//XSSFWorkbook wb 	= new XSSFWorkbook(fis);
		//XSSFSheet sheet1 	= wb.getSheetAt(0);
		
	//	AXSSFSheet sheet1 = (XSSFSheet) wb.getSheetAt(0);
      //  XSSFRow row = sheet1.getRow(0);
       // XSSFCell cell = row.getCell(0);
     //  XSSFCell cell = row.getCell(0);
     //   List lst = wb.getAllPictures();
      // for (Iterator it = lst.iterator(); it.hasNext(); ) {
        //  PictureData pict = (PictureData)it.next();
         // Dimension ext = pict.getImageDimension();
         // byte[] data = pict.getData();
         // if (ext.equals("1020071.jpg")){
           //FileOutputStream out = new FileOutputStream("pict.jpg");
           //out.write(data);
           //out.close();
         // }
        //}
        //for (XSSFPictureData picture : sheet1.getWorkbook().getAllPictures()) {
          //  // Get picture data
            //byte[] data = picture.getData();
            // Write picture data to a file
            //FileOutputStream out = new FileOutputStream("‪C:\\Users\\akshi\\Downloads\\tugu\\tugu\\Pictures\\1020071.jpg");
            //out.write(data);
            //out.close();

            // Load image in WebDriver and get its dimensions
            //driver.get("C:\\Users\\akshi\\Downloads\\tugu\\tugu\\Pictures\\1020071.jpg");
            //WebElement image = driver.findElement(By.tagName("img"));
           // int width = image.getSize().getWidth();
           // int height = image.getSize().getHeight();

            // Do something with the image dimensions
           // System.out.println("Image dimensions: " + width + " x " + height);
       // }
    

    // Close workbook and quit WebDriver
  //  workbook.close();
   // driver.quit();
		
		// byte imageBytes []= cell.getData();
		 
		 //File imageFile = new File("image.png");
	       // FileOutputStream imageOut = new FileOutputStream(imageFile);
	        //imageOut.write(imageBytes);
	        //imageOut.close();
	
        //Workbook workbook = new XSSFWorkbook(new FileInputStream("example.xlsx"));
        //XSSFSheet sheet = (XSSFSheet) workbook.getSheetAt(0);
        //XSSFRow row = sheet.getRow(0);
        //XSSFCell cell = row.getCell(0);
        
//File src = new File ("C:\\Users\\akshi\\OneDrive\\Desktop\\pictures.xlsx");
		
	//	FileInputStream fis= new FileInputStream(src);
		
	//	XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
     //   XSSFSheet sheet1 = workbook.getSheetAt(0);
       // int rows =sheet1.getLastRowNum();
        //int cols =sheet1.getRow(1).getLastCellNum();
        
        //System.out.println("Total number of rows---" + (rows-1));						
	///	System.out.println("Total number of columns---" + cols+"\n");
    	//driver.findElement(uploadImage).sendKeys("./Pictures/1020071.jpg");
        
    	return new HomePage(driver);
    }
    public HomePage Createpoll () throws InterruptedException {
    	 Log.info("Create a poll");
    	 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 w.until(ExpectedConditions.visibilityOfElementLocated(createpoll));
         click(createpoll);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         writeText(Poststatus , "hi all, which brand is best ?");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         writeText(answer1, "BMW");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         writeText(answer2,"Audi");
         //Thread.sleep(10000);
        // click(addanswer);
         WebElement scroll = driver.findElement(By.xpath("//*[@id=\"publisher-button\"]")) ;
         System.out.println("lable is detected");
         ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
         //scroll.sendKeys(Keys.PAGE_DOWN);
         System.out.println("scroll is executed successfully");
         w.until(ExpectedConditions.visibilityOfElementLocated(sharebutton));
         click(sharebutton);
         return new HomePage(driver);
    }
    public HomePage UploadVideo (String VideoPath) throws InterruptedException, IOException {
    	Log.info("Uploading a Video");
    
    	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
     	 w.until(ExpectedConditions.visibilityOfElementLocated(Poststatus));
        click(Poststatus);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        writeText(Poststatus,"Hi all");
        Thread.sleep(15000);
       // w.until(ExpectedConditions.visibilityOfElementLocated(uploadVideo));
        driver.findElement(By.xpath("//*[@id=\"publisher-video\"]")).sendKeys(VideoPath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        WebElement scroll = driver.findElement(By.xpath("//*[@id=\"publisher-button\"]")) ;
        System.out.println("lable is detected");
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
        //scroll.sendKeys(Keys.PAGE_DOWN);
        System.out.println("scroll is executed successfully");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        click(sharebutton);
        Thread.sleep(12000);
        click(dropdownbutton);
        w.until(ExpectedConditions.visibilityOfElementLocated(logout));
        click(logout);
        
        
    	
    	return new HomePage(driver);

    }
    public HomePage UploadAudio (String AudioPath) throws InterruptedException, IOException {
    	Log.info("Uploading an Audio");

    	 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 w.until(ExpectedConditions.visibilityOfElementLocated(Poststatus));
        click(Poststatus);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        writeText(Poststatus,"Hi all");
        Thread.sleep(14000);
        driver.findElement(By.xpath("//*[@id=\"publisher-music\"]")).sendKeys(AudioPath);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement scroll = driver.findElement(By.xpath("//*[@id=\"publisher-button\"]")) ;
        System.out.println("lable is detected");
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
        //scroll.sendKeys(Keys.PAGE_DOWN);
        System.out.println("scroll is executed successfully");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(sharebutton);
        Thread.sleep(12000);
        click(dropdownbutton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(logout);
        
        
        
        
        return new HomePage(driver);
    }
    public HomePage PostActivity () throws InterruptedException {
    	
    	
    	 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 w.until(ExpectedConditions.visibilityOfElementLocated(Poststatus));
         click(Poststatus);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         click(addactivity);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         click(feelings);
         Thread.sleep(4000);
         click(sleepy);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         click(sharebutton);
         Thread.sleep(5000);
         click(dropdownbutton);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         click(logout);
         
    	
    	
		return new HomePage (driver);
    	
    	
    }
    public HomePage StatusColor ()  throws InterruptedException {
    	
    	 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 w.until(ExpectedConditions.visibilityOfElementLocated(Poststatus));
        click(Poststatus);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        writeText(Poststatus,"Hi all");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(emoji);
        w.until(ExpectedConditions.visibilityOfElementLocated(emojidropdown));
        click(emojidropdown);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(coloroptions);
        Thread.sleep(4000);
        click(color);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement scroll = driver.findElement(By.xpath("//*[@id=\"publisher-button\"]")) ;
        System.out.println("lable is detected");
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
        click(sharebutton);
        Thread.sleep(5000);
        click(dropdownbutton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        click(logout);
        
        
    	
		return new HomePage (driver);
    	
    }
    
    public HomePage UploadFile (String Filepath) throws InterruptedException, IOException {
    	
    	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
   	    w.until(ExpectedConditions.visibilityOfElementLocated(Poststatus));
        click(Poststatus);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        writeText(Poststatus,"Hi all");
        Thread.sleep(25000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/form/div/div[13]/div[1]/div[4]")).sendKeys(Filepath);
        Thread.sleep(15000);
        WebElement scroll = driver.findElement(By.xpath("//*[@id=\"publisher-button\"]")) ;
        System.out.println("lable is detected");
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
        //scroll.sendKeys(Keys.PAGE_DOWN);
        System.out.println("scroll is executed successfully");
        
        Thread.sleep(5000);
        click(sharebutton);
        Thread.sleep(15000);
        click(dropdownbutton);
        Thread.sleep(3000);
        click(logout);
        Thread.sleep(5000);
        
        return new HomePage (driver);
    }
    public HomePage OpenChatpopup  ()  throws InterruptedException {
    	
    	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
   	    w.until(ExpectedConditions.visibilityOfElementLocated(chatsearch));
    	writeText(chatsearch, "Anaysha chouhan");
    	Thread.sleep(3000);
    	click(chatname);
    	
    	return new HomePage (driver);
    }    	
    public HomePage SendMessage () throws InterruptedException {
    	
    	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
   	    w.until(ExpectedConditions.visibilityOfElementLocated(chatsearch));
    	writeText(chatsearch, "Anaysha chouhan");
    	Thread.sleep(3000);
    	click(chatname);
    	Thread.sleep(3000);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    	writeText(chattextarea, "Hi Hows u? ");
    	Thread.sleep(2000);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	a.sendKeys(Keys.ENTER).build().perform();
    	
    	
    	
    	return new HomePage (driver);
    	
    }
    public HomePage VerifyPreviousMsgs () throws InterruptedException {
    	
    	
    	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
   	    w.until(ExpectedConditions.visibilityOfElementLocated(chatsearch));
    	writeText(chatsearch, "Anaysha chouhan");
    	w.until(ExpectedConditions.visibilityOfElementLocated(chatname));
    	click(chatname);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    	writeText(chattextarea, "Hi Hows u? ");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	a.sendKeys(Keys.ENTER).build().perform();
    	Thread.sleep(8000);
    	writeText(chattextarea, "where are you ?");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	a.sendKeys(Keys.ENTER).build().perform();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	String retrieveText = driver.findElement(By.xpath("//*[@id=\"messageId_177\"]")).getText();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println(retrieveText);
    	if(retrieveText.equals("Hi Hows u")) {
    	
    	System.out.println("Value match as Expected");
    	}
    	Thread.sleep(4000);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	String retrieveText1 = driver.findElement(By.xpath("//*[@id=\"messageId_178\"]")).getText();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(retrieveText1);
    	if(retrieveText.equals("where are you ")) {
    	
    	System.out.println("Value match as Expected");
    	}
    	
    	
    	return new HomePage (driver);
    	
    	
    }
    
     public HomePage Deleteconversation ()throws InterruptedException {
    	 
    	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        w.until(ExpectedConditions.visibilityOfElementLocated(chatsearch));
     	writeText(chatsearch, "Anaysha chouhan");
     	  w.until(ExpectedConditions.visibilityOfElementLocated(chatname));
     	click(chatname);
     	Thread.sleep(4000);
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	click(maximize);
     	Thread.sleep(6000);
     	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
     	driver.switchTo().window(newTb.get(1));
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	click(Deletechat);
     	Thread.sleep(5000);
         Alert alert = driver.switchTo().alert();
         alert.accept();
         Thread.sleep(4000);
         Alert alert1 = driver.switchTo().alert();
         alert1.accept();
     	
     	
     	
         
     	
     	return new HomePage (driver);
    	 
     }
     public HomePage SendEmoji ()throws InterruptedException {
    	
    	
     	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        w.until(ExpectedConditions.visibilityOfElementLocated(chatsearch));
     	writeText(chatsearch, "Anaysha chouhan");
     	w.until(ExpectedConditions.visibilityOfElementLocated(chatname));
     	click(chatname);
     	w.until(ExpectedConditions.visibilityOfElementLocated(ChatEmoji));
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	click(ChatEmoji);
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	click(sendemoji);
     	Thread.sleep(3000);
     	a.sendKeys(Keys.ENTER).build().perform();
     	
    	 
    	 
    	 return new HomePage (driver);
    	 
     }
     
     public HomePage ChangeChatColor ()throws InterruptedException {
    	 
    	 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
         w.until(ExpectedConditions.visibilityOfElementLocated(chatsearch));
     	writeText(chatsearch, "Anaysha chouhan");
     	Thread.sleep(3000);
     	click(chatname);
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	click(chatcolor);
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	 click(selectcolor);
    	 
    	 
    	 
    	 
    	 return new HomePage (driver);
    	 
    	 
     }
     
     public HomePage SendImage (String Imagepath) throws InterruptedException, IOException {
    	 
    	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.visibilityOfElementLocated(chatsearch));
     	writeText(chatsearch, "Anaysha chouhan");
     	Thread.sleep(3000);
     	click(chatname);
     	Thread.sleep(6000);
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	driver.findElement(By.id("sendMessasgeFile")).sendKeys(Imagepath);
     	
    	 
    	 
    	 return new HomePage (driver);
     }
     
 public HomePage SendVideo (String VideoPath) throws InterruptedException, IOException {
    	 
	    WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.visibilityOfElementLocated(chatsearch));
     	writeText(chatsearch, "Anaysha chouhan");
     	w.until(ExpectedConditions.visibilityOfElementLocated(chatname));
     	click(chatname);
     	Thread.sleep(6000);
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	driver.findElement(By.id("sendMessasgeFile")).sendKeys(VideoPath);
     	
     	return new HomePage (driver);
}
 
 public HomePage SendAudio (String AudioPath) throws InterruptedException, IOException {

	 
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
    w.until(ExpectedConditions.visibilityOfElementLocated(chatsearch));
  	writeText(chatsearch, "Anaysha chouhan");
  	Thread.sleep(3000);
  	click(chatname);
  	Thread.sleep(6000);
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  	driver.findElement(By.id("sendMessasgeFile")).sendKeys(AudioPath);
  	
  	return new HomePage (driver);
}

 public HomePage OfflineSettings ()throws InterruptedException {
	 
	 
	 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
	 w.until(ExpectedConditions.visibilityOfElementLocated(ChatSettings));
	 click(ChatSettings);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 click(Offlinetab);
	 
	 return new HomePage (driver);
 }
 
 public HomePage NavigatingToGeneralsettings () throws InterruptedException {
	 
	 click(rightmenu);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 click(GeneralSettings);
	 
	 return new HomePage (driver);
 }
}	
