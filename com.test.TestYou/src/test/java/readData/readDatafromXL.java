package readData;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import Base.invokeBroswer;
import Pages.EditPage;
import Pages.LoginPage;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import utility.helper;


public class readDatafromXL {


	@DataProvider(name = "testdata")
	public static Object[][] readTestData() throws BiffException, IOException {
		
		File file = new File("C:\\Work\\testAmazon\\data\\TestData.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sh = wb.getSheet(0);
		int row = sh.getRows();
		int culm = sh.getColumns();
		
		//System.out.println("The Row Count is - "+row);
		//System.out.println("The culmns Count is - "+culm);
		
		String inputdata[][] = new String [row] [culm];
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<culm;j++) {
				Cell cl = sh.getCell(j , i);
				inputdata [i][j] = cl.getContents();
				
				
			}
		}
		return inputdata;

	}
	
	@Test(dataProvider = "testdata")
	public void testEditforTestYou(String uname , String upass) throws Throwable
	{
		Reporter.log("-----Test Start For Test You login----");
		
		WebDriver driver = invokeBroswer.invokewebbroswer();
		LoginPage lgp = PageFactory.initElements(driver, LoginPage.class);
		EditPage etd = PageFactory.initElements(driver, EditPage.class);
		lgp.dologin(uname, upass);
		helper.takescreenshot("screenshot_", driver);
		BaseClass.waitforme(5);
		etd.editButton();
		//helper.handelIframes("abc");
		BaseClass.closedriver();
		Reporter.log("-----Test End For Test You login----");
		
	}
	

}
