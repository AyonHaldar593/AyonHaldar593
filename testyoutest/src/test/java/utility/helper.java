package utility;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class helper {
	
	 static WebDriver driver;
	public static void takescreenshot(String filename) throws IOException
	{
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file,new File("C:\\Work\\testyoutest\\Screenshot"+filename+".jpg"));
	}

}
