package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class BaseClass 
{
	 static WebDriver driver;
	 
	 public static WebDriver Broswersetup(String broswerName, String url)
	 {
		 if(broswerName.equalsIgnoreCase("Chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
			 driver =new ChromeDriver();
		 }
		 
		
		
		 driver.manage().window().maximize();
		 driver.get(url);
		 return driver;
	 }
	 public static int waitforme(int sec)
	 {
		 driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		 return sec;
	 }
	
	 
	
	public static  Object closedriver()
	{
		driver.quit();
		return null;
	}
}
