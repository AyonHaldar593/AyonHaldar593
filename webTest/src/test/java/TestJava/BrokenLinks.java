package TestJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		String chromeDriverPath = "C:\\Selenium Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.co.in");
		List <WebElement> elem=driver.findElements(By.tagName("a"));

	}

}
