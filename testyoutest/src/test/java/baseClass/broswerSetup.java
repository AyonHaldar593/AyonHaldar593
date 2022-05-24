package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class broswerSetup 
{
	static WebDriver driver;
	
	@BeforeTest
	public static WebDriver selectBroswer(String broswerName, String url)
	{
		if(broswerName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Soft_local/Chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		return driver;
	}
	@AfterTest
	public void closeWeb()
	{
		driver.quit();
	}

}
