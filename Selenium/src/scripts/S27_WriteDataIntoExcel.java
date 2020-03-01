package scripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class S27_WriteDataIntoExcel
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream(".//Excels//test1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet1");
		//Existing row, existing cell
		sheet.getRow(0).createCell(1).setCellValue("Bangalore");
		sheet.getRow(0).getCell(1).setCellValue("Bangalore");
		//existing row, new cell
		//sheet.getRow(0).createCell(1).setCellValue("Bangalore");
		//new row and new cell
		sheet.createRow(1).createCell(0).setCellValue("8 am batch");
		//Writing data into excel 
		FileOutputStream fos=new FileOutputStream(".//Excels//test111.xlsx");
		//In the above line, change the name of the file if you want to "Save As"
		//It will create new file
		wb.write(fos);
		
		

	}

}
