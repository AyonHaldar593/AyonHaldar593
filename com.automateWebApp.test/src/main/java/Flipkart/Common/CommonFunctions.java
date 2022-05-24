package Flipkart.Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonFunctions extends BroswerConfig {
	WebDriver driver;
	
	@FindBy (css = "#inputEmail" )
	WebElement LoginInputBox;
	
	@FindBy (css ="#inputPassword")
	WebElement PassWordInputBox;
	
	@FindBy (css = "#submitLogin")
	WebElement SignInBtn;
	
	public CommonFunctions(WebDriver driver) {
		driver = this.driver;
	}
	
	/**
	 * @author ayonh
	 * @param  String - userName
	 * @param String - passWord
	 * This method is used to do login in flipKart
	 */
	public void LoginFlipKart(String userName , String passWord) {
		LoginInputBox.sendKeys(userName,"User name has been added");
		PassWordInputBox.sendKeys(passWord,"Password has been added");
		SignInBtn.click();
	}
	
	/**
	 * @author ayonh
	 * @param int - timeInSec
	 * This method is used for implicitlyWait
	 */
	public void WaitForAllElements(int timeInSec) {
		driver.manage().timeouts().implicitlyWait(timeInSec, TimeUnit.SECONDS);
	}


}
