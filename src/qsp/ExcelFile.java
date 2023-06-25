package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {
	public static void main(String[]arg) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Book2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet("Create Customer").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		wb.getSheet("Create Customer").getRow(4).getCell(1).setCellValue("skipped");
		FileOutputStream fos=new FileOutputStream("./data/Book2.xlsx");
		wb.write(fos);
		String data1 = wb.getSheet("Create Customer").getRow(4).getCell(1).getStringCellValue();
		System.out.println(data1);
	}

}
