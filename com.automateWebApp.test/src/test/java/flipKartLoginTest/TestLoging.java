package flipKartLoginTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Flipkart.Common.CommonFunctions;

public class TestLoging extends CommonFunctions {

	public TestLoging(WebDriver driver) {
		super(driver);
		
	}
	@Test
	public void testFlipKartLogin() throws IOException {
		Broswersetup("Chrome");
		LoginFlipKart("6290781988", "Tatai@2021");
	}

}
