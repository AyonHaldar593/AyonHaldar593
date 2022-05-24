package webtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class selenium_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("***** Chrome Driver Invoked *****");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayonh\\OneDrive\\Documents\\Soft\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		String ActualTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println(title);
		System.out.println(ActualTitle);
		
		if(title.equals(ActualTitle))
		{
			System.out.println("The title is matched..");
		}
		
		else {
			System.out.println("Title is not matching..");
		}
		
		Thread.sleep(2000);
		driver.close();
	}
}
