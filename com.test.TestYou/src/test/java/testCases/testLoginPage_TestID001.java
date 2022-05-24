package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import Base.invokeBroswer;
import Pages.EditPage;
import Pages.LoginPage;
import utility.helper;

public class testLoginPage_TestID001 extends BaseClass

{
	
	
	@Test
	public void testLoginPageforTestYou() throws Throwable
	{
		Reporter.log("-----Test Start For Test You login----");
		
		WebDriver driver =invokeBroswer.invokewebbroswer();
		LoginPage lgp = PageFactory.initElements(driver, LoginPage.class);
		
		lgp.dologin("Adminayon", "Test123");
		BaseClass.waitforme(5);
		helper.takescreenshot("screen1" , driver);
		
		Reporter.log("-----Test End For Test You login----");
		
	}

}
