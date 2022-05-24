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

public class brokenLLink {

	public static void main(String[] args) throws IOException {
		
		String chromeDriverPath = "C:\\Selenium Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.co.in");
		List <WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++) {
			WebElement elem = elements.get(i);
			String url = elem.getAttribute("href");
			URL newurl = new URL(url);
			HttpURLConnection urlcon = (HttpURLConnection) (newurl.openConnection());
			int responseCode = urlcon.getResponseCode();
			if(responseCode>=400) {
				System.out.println("BrokenLink --"+url);
			}
			else {
				System.out.println("Not a brokenLink -- "+url);
			}
		}

	}

}
