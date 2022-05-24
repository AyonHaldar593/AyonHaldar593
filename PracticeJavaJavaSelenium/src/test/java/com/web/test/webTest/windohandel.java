package com.web.test.webTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windohandel {
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/watchs");
		
//		Set<String> allWindo = driver.getWindowHandles();
//		Iterator<String> windo = allWindo.iterator();
//		String w1=windo.next();
//		System.out.println(w1);
//		WebDriver dwindo =driver.switchTo().defaultContent();
//		System.out.println(dwindo.toString());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		WebElement elem =driver.findElement(By.cssSelector("desktop-pSearchlinks"));
		System.out.println(elem.findElement(By.tagName("a")).getSize());
		Iterator<WebElement> itl = links.iterator();
		while(itl.hasNext()){
			
		}
		
		Set<String> allWindo = driver.getWindowHandles();
		Iterator<String> it = allWindo.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
