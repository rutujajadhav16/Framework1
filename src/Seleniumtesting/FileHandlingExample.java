package Seleniumtesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandlingExample
{

	public static XSSFWorkbook wb;
	public static XSSFSheet sheet1;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static void setExcelFile(String file, String sheet) throws IOException
	{
		FileInputStream file1=new FileInputStream(file);
		wb=new XSSFWorkbook(file1);
		XSSFSheet sheet1=wb.getSheet(sheet);
		
	
	}
	
	public static int getrowCount(String file, String sheet) throws IOException
	{
		FileInputStream f=new FileInputStream(file);
		wb=new XSSFWorkbook(f);
		sheet1=wb.getSheet(sheet);
		int rowcount= sheet1.getLastRowNum();
		wb.close();
		f.close();
		return rowcount;
		
	}
	
	public static int getCellCount(String file, String sheet,int rownum) throws IOException
	{
		FileInputStream f1=new FileInputStream(file);
		wb=new XSSFWorkbook(f1);
		sheet1=wb.getSheet(sheet);
		row=sheet1.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		f1.close();
		return cellcount;
		
		
	}
	public static String getCellData(String file, String sheet, int rownum, int colnum) throws IOException
	{
		FileInputStream f2=new FileInputStream(file);
		wb=new XSSFWorkbook(f2);
		sheet1=wb.getSheet(sheet);
		row=sheet1.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try
		{
			DataFormatter formatter= new DataFormatter();
			data=formatter.formatCellValue(cell);
			return data;
		}
		catch(Exception e)
		{
			data="";
			
		}
		wb.close();
		f2.close();
		return data;
		
		
	}
	
	

}
