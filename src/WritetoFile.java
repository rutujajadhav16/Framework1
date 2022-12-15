import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritetoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file= new 	FileOutputStream("E://Rutuja study//udemy//Data driven testing//test123.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		for(int i=0;i<5;i++)
		{
			XSSFRow row=sheet.createRow(i);
			for(int j=0;j<3;j++)
			{
				row.createCell(j).setCellValue("Welcome");
			}
		}
		workbook.write(file);
		System.out.println("File writing done");
		
		

	}

}
