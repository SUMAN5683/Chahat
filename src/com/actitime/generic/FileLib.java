package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 *this is generic class for data driven testing 
 * @author Suman
 *
 */
public class FileLib {
	/**
	 * this is generic method for reading the data from property file
	 * @param key
	 * @return String
	 * @throws IOException
	 */

	public String getPropertyData(String key ) throws IOException {
         FileInputStream fis=new FileInputStream("./data/ActitimeLogin.property");
         Properties p=new Properties();
         p.load(fis);
         String ur = p.getProperty(key);
		return ur;
         
         
	}
	/**
	 * 
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		
		return data;
		
	}
	/**
	 * 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param Value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String sheet,int row,int cell,String Value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(Value);
		FileOutputStream fos=new FileOutputStream("./data/Test_Case.xlsx");
		wb.write(fos);
		wb.close();
		
		
	}
	

}