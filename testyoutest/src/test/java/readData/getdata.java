package readData;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdata {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Soft_local\\\\Chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		List<WebElement> ele = driver.findElements(By.tagName("td"));
		
		

        System.out.println("No of cols are : " +ele.size());
				

	}

}
