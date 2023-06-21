package utility2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestUtil3 {
	
	public static String Test_Data_Sheet = "C:\\Users\\akshi\\OneDrive\\Desktop\\Nidhi code\\ExeclFile\\albumsTestData1.xlsx";
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	
	@DataProvider(name = "data")
	public static Object[][] getTestData() throws
			  IOException {
		
		FileInputStream file = new FileInputStream(Test_Data_Sheet); 
		
		  book = new XSSFWorkbook(file);
		  
		  sheet = book.getSheetAt(0); 
		  
		  int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
	        int columnCount = sheet.getRow(0).getLastCellNum();

	        Object[][] data = new Object[rowCount][columnCount];
	    
	   
	     for (int i = 0; i < rowCount; i++) {
	            Row row = sheet.getRow(i);
	            for (int j = 0; j < columnCount; j++) {
	                
	        
	                Cell cell = row.getCell(j);
	                data[i][j] = cell.toString();
	                System.out.println(data[i][j]);
	                
	                book.close();
	                file.close();
	                		
	                }}
	     
	  return data;  
	
	}
	

}
