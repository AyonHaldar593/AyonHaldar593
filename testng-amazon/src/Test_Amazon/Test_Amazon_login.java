package Test_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Amazon_login {
	
	WebDriver driver=null;
	@BeforeTest
	public void chromesetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void checkUrl()
	{
		String myurl = driver.getCurrentUrl();
		System.out.println(myurl);
		String expecteURL = "https://www.amazon.in/";
		
		System.out.println("---- Checking The URL ----");
		Assert.assertEquals(myurl, expecteURL);
		
		//Assert.assertTrue(myurl.contains("www.am1"));
		System.out.println("URL is working fine..");
	}
	
	@Test
	public void Urlinvaliddata()
	{
		String CurrenURL = driver.getCurrentUrl();
		String actulURL = "https://www.amazon.in/";
		
		Assert.assertEquals(CurrenURL, actulURL);
				
	}
	
	@Test
	public void checktitle()
	{
		String pages = driver.getPageSource();
				System.out.println(pages);
		Assert.assertTrue(pages.contains("Online Shopping site in India"));
	}
	
	@AfterTest
	public void CloseBroswer()
	{
		driver.close();
	}

}
