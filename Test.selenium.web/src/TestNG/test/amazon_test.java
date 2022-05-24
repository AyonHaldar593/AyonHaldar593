package TestNG.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class amazon_test {
	
	WebDriver driver;
	
	@Test(priority =1)
	public void OpenChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\chromedriver\\chromedriver_win32\\chromedriver.exe");    
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("amazon"));
		
	}
	
	@Test(priority =2)
	public void validateLogin()
	{
		String serachbox = "//input[@id='twotabsearchtextbox']";
		String serchButton = "//input[@type='submit']";
		
		driver.findElement(By.xpath(serachbox)).sendKeys("oneplus mobile");;
		driver.findElement(By.xpath(serchButton)).click();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		Assert.assertEquals(currenturl, "https://www.amazon.in/s?k=oneplus+mobile&ref=nb_sb_noss");
	}

//	@AfterTest
//	public void checkbroswer()
//	{
//		driver.close();
//	}

}
