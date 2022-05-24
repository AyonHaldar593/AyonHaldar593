package testAuto;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCasesID_01  {
	WebDriver driver;
	
	PageObjects objectPage;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testyou.in/Login.aspx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testLogin() {
		objectPage = new PageObjects(driver);
		objectPage.passUserNameAndPassWord("Adminayon", "Test123");
		objectPage.clickOnLoginBtn();
	}

}
