package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		System.out.println("Hello..............");
		
		String path = "C:\\Users\\admin\\Desktop\\testing.xlsx";
    	FileInputStream file = new FileInputStream(path);
    	
    	Workbook b = WorkbookFactory.create(file);
    	
    	String value = b.getSheet("dhani").getRow(0).getCell(0).getStringCellValue();
    	System.out.println(value);
    	
    	double num = b.getSheet("dhani").getRow(6).getCell(0).getNumericCellValue();
    	System.out.println(num);
    	
    	Date date = b.getSheet("dhani").getRow(9).getCell(1).getDateCellValue();
    	System.out.println(date);
	}
}
