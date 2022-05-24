package Collection;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Collection3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		String winp = driver.getWindowHandle();
		System.out.println(winp);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		Set<String> winC = driver.getWindowHandles();
		Iterator<String> itr = winC.iterator();
		while (itr.hasNext()) {
			String ChildWin = itr.next();
			
			if(!ChildWin.equals(winp)) {
				
				driver.switchTo().window(ChildWin);
				System.out.println("The Windo Title is "+driver.getTitle());
				driver.close();
			}
			else
			{
				System.out.println("The Windo Title is "+driver.getTitle());
			}
			
		}

	}

}
