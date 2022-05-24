package Flipkart.Common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroswerConfig {

	static WebDriver driver;

	public static WebDriver Broswersetup(String broswerName) throws IOException, IOException {
		Properties prp = new Properties();
		prp.load(new FileInputStream("./config.propeties"));
		if (broswerName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", prp.getProperty("chromePath"));
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.get(prp.getProperty("URL"));
		return driver;

	}
}
