package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		List<WebElement> element = driver.findElements(By.xpath("//select[@name='birthday_day']"));
		Iterator <WebElement> itr = element.iterator();
		
		String Value = "";
		while(itr.hasNext()) {
			WebElement ele = itr.next();
			Value = ele.getText();
			
			System.out.println(Value);
		}
		

	}

}
