package VelocitySelenium;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TC_19_ReadingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("E:\\Rutuja study\\Velocity\\Automation\\myfile.xlsx");
		Workbook mybook=WorkbookFactory.create(myfile);
		org.apache.poi.ss.usermodel.Sheet mysheet=mybook.getSheet("Sheet1");
		Row myrow=mysheet.getRow(0);
		Cell mycell=myrow.getCell(0);
		CellType type=mycell.getCellType();
		System.out.println(type);
		String value=mycell.getStringCellValue();
		System.out.println(value);

		

	}

}
