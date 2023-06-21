package utility2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestUtil4 {

	public static String Test_Data_Sheet = "C:\\Users\\akshi\\OneDrive\\Desktop\\Nidhi code\\ExeclFile\\Addprofile.xlsx";
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	
	@DataProvider(name = "data")
	public static Object[][] getTestData() throws
			  IOException {
		
		FileInputStream file = new FileInputStream(Test_Data_Sheet); 
		
		  book = new XSSFWorkbook(file);
		  
		  sheet = book.getSheetAt(0); 
		//  Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		//  System.out.println(sheet.getFirstRowNum() + "--------" + sheet.getRow(0).getLastCellNum());
	/*	  for (int i = 0; i < sheet.getLastRowNum();i++) 
		  { 
			  for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
							
		  data[i][k] = sheet.getRow(i).getCell(k).toString(); 
		  System.out.println(data[i][k]);
		 } */
		  
	/*
	 * for(int i = 0; i<sheet.getLastRowNum(); i++) { for(int j = 0;
	 * j<sheet.getRow(0).getLastCellNum();j++) { data[i][j] =
	 * sheet.getRow(i).getCell(j).toString(); System.out.println(data[i][j]); }}
	 * 
	 * book.close(); file.close();
	 */
		  
		  int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
	        int columnCount = sheet.getRow(0).getLastCellNum();

	        Object[][] data = new Object[rowCount][columnCount];

	        for (int i = 0; i < rowCount; i++) {
	            Row row = sheet.getRow(i);
	            for (int j = 0; j < columnCount; j++) {
	                Cell cell = row.getCell(j);
	                data[i][j] = cell.toString();
	book.close();
	file.close();
	            }}
				 return data; }
		 
	
}
