package com.test.Utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;





public class TestUtil {
   
	//public static String datasheet = "C:/Users/akshi/OneDrive/Desktop/image.xlsx".replaceAll("[^\\x00-\\x7F]", "");
	  public static String datasheet = "C:/Users/akshi/OneDrive/Desktop/image.xlsx".replaceAll("[^\\x00-\\x7F]", "");

	static XSSFWorkbook book;
    static XSSFSheet sheet;

    /*@DataProvider(name ="data")
    public static Object[][] getTestData() throws IOException {
        FileInputStream file = new FileInputStream(datasheet);
        book = new XSSFWorkbook(file);
        sheet = book.getSheetAt(0);

        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
        int columnCount = sheet.getRow(0).getLastCellNum();
        
        

        Object[][] data = new Object[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            if (row == null) {
                continue; // Skip over null rows
            }
            for (int j = 0; j < columnCount; j++) {
                Cell cell = row.getCell(j);
                if (cell != null) {
                    data[i][j] = cell.toString();
                } else {
                    data[i][j] = "";
                }
            }
        }

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < columnCount; j++) {
                Cell cell = row.getCell(j);
                if (cell != null) {
                    data[i][j] = cell.toString();
                } else {
                    data[i][j] = "";
                }
            }
        }

        book.close();
        file.close();

        return data;
    }
}
*/
   /* @DataProvider(name ="data")
    public static Object[][] getTestData() throws IOException {
        FileInputStream file = new FileInputStream(datasheet); 
        book = new XSSFWorkbook(file);
        sheet = book.getSheetAt(0); 

        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
        int columnCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            if (row != null) {
                for (int j = 0; j < columnCount; j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null && !cell.toString().isEmpty()) {
                        data[i][j] = cell.toString();
                    } else {
                        data[i][j] = "no data found";
                        break; // stop iterating through columns
                    }
                }
            } else {
                data[i] = new Object[columnCount];
                for (int j = 0; j < columnCount; j++) {
                    data[i][j] = "no data found";
                }
            }
        }

        book.close();
        file.close();

        return data;
    }
}  	*/
    
    @DataProvider(name = "data")
    public static Object[][] getTestData() throws IOException {
        FileInputStream file = new FileInputStream(datasheet);
        book = new XSSFWorkbook(file);
        sheet = book.getSheetAt(0);

        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
        int columnCount = sheet.getRow(0).getLastCellNum();

        List<Object[]> validRows = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            if (row != null) {
                Object[] rowData = new Object[columnCount];
                boolean isValidRow = true;
                for (int j = 0; j < columnCount; j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null && !cell.toString().isEmpty()) {
                        rowData[j] = cell.toString();
                    } else {
                        rowData[j] = "no data found";
                        isValidRow = false;
                        break;
                    }
                }
                if (isValidRow && isImageFile(rowData[1].toString())) { 
                    validRows.add(rowData);
                }
            }
        }

        book.close();
        file.close();

        return validRows.toArray(new Object[0][0]);
    }
private static boolean isImageFile(String filePath) {
    String[] validExtensions = {".jpg", ".jpeg", ".png", ".gif", ".bmp"}; 
    for (String extension : validExtensions) {
        if (filePath.toLowerCase().endsWith(extension)) {
            return true;
        }
    }
    return false;
}}