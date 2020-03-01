package scripts;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class S28_PrintContentFromExcel
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream(".//Excels//test2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet1");
		int rowCount = sheet.getLastRowNum();//returns index of the last row(row index starts from 0)
		System.out.println(rowCount);
		
		for(int i=0;i<=rowCount;i++)
		{
			Row row = sheet.getRow(i);
			int cellCount = row.getLastCellNum();//returns index of the last cell(cell index starts from 1)
			//System.out.println(cell);
			for(int j=0; j<cellCount;j++)
			{
				Cell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.print(value+"-->");
			}
			System.out.println();//to print values in next line
		}

	}

}
