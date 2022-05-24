package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class invokeBroswer 
{
	
	public static WebDriver invokewebbroswer() throws FileNotFoundException, IOException
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream("./config.propeties"));
		WebDriver driver = BaseClass.Broswersetup("Chrome", prop.getProperty("urlProd"));
		return driver;
	}
	
}
