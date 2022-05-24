package testCasesTestYou;



import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBrokenLinks {
	static WebDriver driver;
	
	public static void main(String args[]) throws Throwable
	{
	
		HttpURLConnection huc =null;
		int responseCode = 200;
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.testyou.in/Login.aspx");
		 
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println("The Total Links In The Page :"+links.size());
		 
		 for (int i=0;i<links.size();i++)
		 {
			 WebElement ele = links.get(i);
			 System.out.println(ele);
			 String url = ele.getAttribute("href");
			 verifylinks(url);
		 }
		 
	}
	
	public static void verifylinks(String CurrentUrl) throws Throwable
	{
		URL url = new URL(CurrentUrl);
		HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
		httpurlconnection.setConnectTimeout(2000);
		httpurlconnection.connect();
		
		if(httpurlconnection.getResponseCode()==200)
		{
			System.out.println(CurrentUrl+" "+httpurlconnection.getResponseMessage());
		}
		if(httpurlconnection.getResponseCode()==httpurlconnection.HTTP_NOT_FOUND)
		{
			System.out.println(CurrentUrl+" "+httpurlconnection.getResponseMessage()+"Url is not valid ");
		}
	}

}
