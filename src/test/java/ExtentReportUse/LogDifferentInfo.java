package ExtentReportUse;

//import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogDifferentInfo {

	public static void main(String[] args) 
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter sparkreporter= new ExtentSparkReporter("E:\\Rutuja study\\Velocity\\Automation\\Files\\report4.html");
		extent.attachReporter(sparkreporter);
		
		
		ExtentTest test1=extent.createTest("Test fomatting")
								.log(Status.INFO,"<b>Info1</b>")
								.log(Status.INFO,"<I>Info2</I>")
								.log(Status.INFO,"<b><I>info3</b></I>");
		
		
		String xml="<employees>\r\n"
				+ "  <employee>\r\n"
				+ "    <firstName>John</firstName> <lastName>Doe</lastName>\r\n"
				+ "  </employee>\r\n"
				+ "  <employee>\r\n"
				+ "    <firstName>Anna</firstName> <lastName>Smith</lastName>\r\n"
				+ "  </employee>\r\n"
				+ "  <employee>\r\n"
				+ "    <firstName>Peter</firstName> <lastName>Jones</lastName>\r\n"
				+ "  </employee>\r\n"
				+ "</employees>";
		
		
		
		ExtentTest test2=extent.createTest("XML Data to report")
								.info(MarkupHelper.createCodeBlock(xml,CodeLanguage.XML ));
						
		String json="{\"employees\":[\r\n"
				+ "  { \"firstName\":\"John\", \"lastName\":\"Doe\" },\r\n"
				+ "  { \"firstName\":\"Anna\", \"lastName\":\"Smith\" },\r\n"
				+ "  { \"firstName\":\"Peter\", \"lastName\":\"Jones\" }\r\n"
				+ "]}";
		
		ExtentTest test3=extent.createTest("JSON Data to report")
				.info(MarkupHelper.createCodeBlock(json,CodeLanguage.JSON ));
		
	
		
		ExtentTest test4=extent.createTest("Highlighting the text")
				.info(MarkupHelper.createLabel("Highlting the text",ExtentColor.CYAN));
		
		
		try {
			int i=5/0;}
		catch(ArithmeticException e)
		{
			ExtentTest test5=extent.createTest("Exceptions to the report")
					.fail(e);
			
		}
			
		
		
				
		extent.flush();
	}

}
