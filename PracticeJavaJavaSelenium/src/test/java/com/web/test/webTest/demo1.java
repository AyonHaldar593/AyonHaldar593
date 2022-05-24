package com.web.test.webTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			WebElement attr = links.get(i);
			String url = attr.getAttribute("href");
			
			URL urln = new URL(url);
			
			HttpURLConnection urlconnection = (HttpURLConnection) urln.openConnection();
			
			int connectionCode = urlconnection.getResponseCode();
			
			if(connectionCode<=400)
			{
				System.out.println(url+" - is a valid link- Response code is - "+connectionCode);
			}
			else
			{
				System.out.println(url+" - is invalid link- Response code is - "+connectionCode);
			}
		}
		


	}

}
