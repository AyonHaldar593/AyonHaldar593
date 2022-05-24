package Java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedlistdemo {

	public static void main(String[] args) throws IOException {
		
		LinkedList  ll = new LinkedList();
		ll.add("Ayon");
		ll.add(0101);
		ll.add("Haldar");
		ll.add("test");
		
		System.out.println(ll);
		//Whileloop
		int num =0;
		while (num<ll.size()) {
		System.out.println("Using while Loop - "+ ll.get(num));
		num++;

		}
		//ForLoop
		
		for( int i = 0;i<ll.size();i++){
		
			System.out.println("Using For Loop - "+ ll.get(i));
		}
		
		//Iterator
		
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println("Using Iterator - "+it.next());
		}
		
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> itt = links.iterator();
		while(itt.hasNext()) {
			String url = itt.next().getAttribute("href");
			System.out.println(url);
			
			URL newurl = new URL(url);
			
			HttpURLConnection urlconnection = (HttpURLConnection) newurl.openConnection();
			int responescode = urlconnection.getResponseCode();
			if(responescode<= 400) {
				System.out.println("Valid url - "+newurl);
			}
		}
		driver.close();
		
		Alert alt =driver.switchTo().alert();
		Set<String> wind = driver.getWindowHandles();
	}

}
