package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		List<WebElement> element = driver.findElements(By.xpath("//tr[@style='margin: 0px; padding: 0px;']"));
		Iterator<WebElement> itr = element.iterator();
		
		String value = "";
		
		while(itr.hasNext()){
			WebElement ele = itr.next();
			value = ele.getText();
			System.out.println(value);
			if (value.contains("Taiwan")) {
				driver.close();
			}
		}

	}

}
