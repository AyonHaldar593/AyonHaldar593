package com.web.test.webTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class demo_B {
	
	WebDriver driver;
	
	
	@Test
	public void test01() throws IOException
	{
		driver = new ChromeDriver();
		
		//Alert 
		Alert Alt = driver.switchTo().alert();
		System.out.println(Alt.getText());
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		
		//Frame
		driver.switchTo().frame(1); // By index
		driver.switchTo().frame("Name"); // By name
		driver.switchTo().frame(driver.findElement(By.xpath("")));// by WebElement
		driver.switchTo().defaultContent();
		//WindoHandel
		String win = driver.getWindowHandle();// one windo
		Set<String> allwindo = driver.getWindowHandles();//All windo present in the webpage
		
		Iterator<String> witt = allwindo.iterator();
		
		String w1 = witt.next();
		driver.switchTo().window(w1);
		String w2 = witt.next();
		driver.switchTo().window(w2);
		
		//Wait
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // ImplicityWait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		//Action class Mouse Hover
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class = 'classname']"))).build().perform();
		act.click();
		act.doubleClick();
		act.dragAndDrop(driver.findElement(By.xpath("provide xpath")), driver.findElement(By.xpath("dxpath")));
		
		long strn = new Date().getTime();
		
		File fis =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(fis, new File("C:\\Work\\webTest\\screenShot\\"+strn+".jpg"));
		
		//Select data in the dropdown
		Select sl = new Select(driver.findElement(By.xpath("xpat")));
		sl.selectByIndex(5);// select by index
		sl.selectByValue("name"); // dropdown value
		sl.selectByVisibleText("text");
		
		// by visibleletext
		
		List<WebElement> alldropdownoptions = sl.getOptions();
		
		// Iterator<WebElement>option = alldropdownoptions.iterator();
		String sOptions = alldropdownoptions.toString();
		for (int i =1; i<sOptions.length();i++)
		{
			System.out.println("The dropdown value is - "+sOptions);
		}
		
		//ScreenShot in selenium
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("C:\\Work\\webTest\\screenShot\\scrnsht1"+".png"));
		
		
		
	}
}
