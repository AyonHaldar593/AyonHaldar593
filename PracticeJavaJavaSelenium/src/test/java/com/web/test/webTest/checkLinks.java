package com.web.test.webTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkLinks {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			// System.out.println(" - "+url);
			
			URL urln = new URL(url);
			
			HttpURLConnection connection = (HttpURLConnection) urln.openConnection();
			int responsecode = connection.getResponseCode();
			if(responsecode<=400)
			{
				System.out.println("The URL is Valid -"+urln+" - The Responsecode is"+responsecode);
			}
			else
			{
				System.out.println("The URL is invalid -"+urln+" - The Responsecode is"+responsecode);
			}
			
		}

	}

}
