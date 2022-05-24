package com.web.test.webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class siblingXpath {
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		
		//List<WebElement> price = driver.findElements(By.xpath("//a[@class='s1Q9rs']/following-sibling::a/div/div[1]"));
		//System.err.println(price.size());
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<Links.size();i++)
		{
			//System.out.println(price.get(i));
			WebElement ele = Links.get(i);
			System.out.println(" The Price is -"+ele.getText());
		}
		
		driver.close();

	}

}
