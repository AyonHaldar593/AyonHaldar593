package TestJava;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectClass {

	public static void main(String[] args) throws IOException {
		
		String chromeDriverPath = "C:\\Selenium Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Select sl = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		sl.selectByVisibleText("10");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector("[name='reg_passwd__']"))).click().sendKeys("newacc").perform();
		act.sendKeys(Keys.ENTER).perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		/*
		 * WebElement ele = driver.findElement(By.xpath("xpat"));
		 * wait.until(ExpectedConditions.elementToBeSelected(ele));
		 */
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(file, new File("C:\\Work\\webTest\\screenShot\\test.jpg"));
	}

}
