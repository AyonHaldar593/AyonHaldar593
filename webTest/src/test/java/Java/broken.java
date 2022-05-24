package Java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken {

	public static void main(String[] args) throws IOException {
		
		String chromeDriverPath = "C:\\Selenium Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.co.in");
		List <WebElement> elem=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<elem.size();i++) {
			WebElement elements = elem.get(i);
			String url = elements.getAttribute("href");
			System.out.println(url);
			URL newurl = new URL(url);
			HttpURLConnection urlconnection = (HttpURLConnection) (newurl.openConnection());
			int responsecode = urlconnection.getResponseCode();
			if(responsecode>=400) {
				System.out.println("Not a valid Link.."+url);
			}
			else {
				System.out.println("Valid Link.."+url);
			}
		}
		driver.close();
	}

}
