package properties_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readConfigFile
{

	Properties p;
	String path="C:\\Users\\admin\\eclipse-workspace\\16julyAEven\\src\\test\\java\\properties_File\\Config.properties";
	public readConfigFile() throws IOException
	{
		p=new Properties();
		FileInputStream fis=new FileInputStream(path);
		
		p.load(fis);
		
	}
	
	
	public String getURL()
	{
		String url=p.getProperty("url");
		System.out.println(url);
		return url;
		
	}
	
	public String getUsername()
	{
		String username=p.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password=p.getProperty("password");
		return password;
	}
}
