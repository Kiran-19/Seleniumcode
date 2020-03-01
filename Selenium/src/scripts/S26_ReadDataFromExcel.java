package scripts;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class S26_ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//read data from excel	
    FileInputStream fis=new FileInputStream(".//Excels//test.xlsx");
    
    Workbook wb=WorkbookFactory.create(fis);
    Sheet sheet=wb.getSheet("sheet1");
    Row row=sheet.getRow(0);
    Cell cell=row.getCell(0);
     String value1 =cell.getStringCellValue();
     System.out.println(value1);
     
   //instead of above code, we can write optimized code as follows
     String value2=wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
     System.out.println(value2);
     

    

	}

}
