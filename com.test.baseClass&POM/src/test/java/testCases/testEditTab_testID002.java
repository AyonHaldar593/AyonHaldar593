package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import Base.invokeBroswer;
import Pages.EditPage;
import Pages.LoginPage;
import utility.helper;

public class testEditTab_testID002
{
	@DataProvider
	public Object[][] readData()
	{
		Object[][] data = new Object[2][2];
		data[0][0]= "Adminayon";
		data[0][1]="Test123";
		
		data[1][0]= "Adminayon";
		data[1][1]="Tes2t123";
		
		return data;
				
	}
	@Test(dataProvider ="readData" )
	public void testEditforTestYou(String uname , String upass) throws Throwable
	{
		Reporter.log("-----Test Start For Test You login----");
		
		WebDriver driver =invokeBroswer.invokewebbroswer();
		LoginPage lgp = PageFactory.initElements(driver, LoginPage.class);
		EditPage etd = PageFactory.initElements(driver, EditPage.class);
		lgp.dologin(uname, upass);
		helper.takescreenshot("screenshot_", driver);
		BaseClass.waitforme(5);
		//etd.editButton();
		
		Reporter.log("-----Test End For Test You login----");
		
	}
	
}
