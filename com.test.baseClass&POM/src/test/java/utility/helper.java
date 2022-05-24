package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class helper {
	
	 static WebDriver driver;
	 
	public static void takescreenshot(String filename , WebDriver driver) throws IOException
	{
		
		long tmp = new Date().getTime();
		String filenamenew= filename+tmp;
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file,new File("C:\\Work\\com.test.baseClass&POM\\Screenshot\\"+filenamenew+".jpg"));
	} 

}
