package takescreenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoscreenshot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("The Page Title Is - "+title);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	}
	
	/*
	 * public static void takesnap(WebDriver webdriver , String filepath) {
	 * TakesScreenshot scrnsht = ((TakesScreenshot)webdriver) ;
	 * 
	 * }
	 */
}
