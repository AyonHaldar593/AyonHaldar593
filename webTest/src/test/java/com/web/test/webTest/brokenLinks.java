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

public class brokenLinks {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		 List <WebElement> links = driver.findElements(By.tagName("a"));
		 
		 for(int i=0;i<links.size();i++)
		 {
			 WebElement ele = links.get(i);
			 String url = ele.getAttribute("href");
			// System.out.println(  "---"+url);
			 
			URL nLinks = new URL(url);
			 
			HttpURLConnection urlconnection = (HttpURLConnection) nLinks.openConnection();
			int connectioncode=urlconnection.getResponseCode();
			if(connectioncode<=400)
			{
				System.out.println(connectioncode+" - is a valid link - link -"+url);
			}
			else
			{
				System.out.println(connectioncode+" - is not a valid link -");
			}
		
		 }

	}

}
