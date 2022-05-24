package com.web.test.webTest;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.internal.misc.FileSystemOption;

public class Ittr {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.testyou.in/Login.aspx");
		
	  List<WebElement> ele = driver.findElements(By.tagName("a"));
	 
	  for(int i =0;i<=ele.size();i++)
	  {
		  WebElement link = ele.get(i);
		  String url = link.getAttribute("href");
		 
		  
		  URL urln = new URL(url);
		  
		  HttpURLConnection urlconnection = (HttpURLConnection) urln.openConnection();
		  int responsecode =urlconnection.getResponseCode();
		  if(responsecode<=400) {
			  System.out.println("Valid Url");
		  }
		  else
		  {
			  System.out.println("In-Valid Url");
		  }
	  }
	 
	 
		 

	}

}
