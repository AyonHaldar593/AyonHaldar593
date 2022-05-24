package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.asserts.SoftAssert;

public class helper {
	
	 static WebDriver driver;
	 
	public static void takescreenshot(String filename , WebDriver driver) throws IOException
	{
		
		long tmp = new Date().getTime();
		String filenamenew= filename+tmp;
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file,new File("C:\\Work\\testAmazon\\Screenshot\\"+filenamenew+".jpg"));
	} 
	
	public static void handelIframes(String fid)
	{
		driver.switchTo().frame(fid);
	}
	
	public static void Softassert(String actual1, String expected1)
	{
		SoftAssert sft = new SoftAssert();
		sft.assertEquals(actual1, expected1);
	}
	
   
}
