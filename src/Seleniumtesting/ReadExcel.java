package Seleniumtesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.logging.log4j.simple;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stubr
		
		//log4j2.loggerContextFactory = org.apache.logging.log4j.simple.SimpleLoggerContextFactory;
				
		FileInputStream file=new FileInputStream("E://Rutuja study//udemy//Data driven testing//ClassExamples//data3.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);//read the workbook from file
		XSSFSheet sheet=workbook.getSheet("Sheet1");//readsheet from workbook
		
		int r= sheet.getLastRowNum();
		int c= sheet.getRow(0).getLastCellNum();
		
		System.out.println(r);
		System.out.println(c);
		
		for(int i=0;i<=r;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<c;j++)
			{
				
				String s=row.getCell(j).toString();
				System.out.print(s+"  ");
			}
			
		}
		
		System.out.println();
		

	}

}
