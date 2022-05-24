package testAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {

	WebDriver driver;

	By UserNameInputBox = By.cssSelector("#ctl00_CPHContainer_txtUserLogin");
	By PassWordInputBox = By.cssSelector("#ctl00_CPHContainer_txtPassword");
	By LoginBtn = By.cssSelector("#ctl00_CPHContainer_btnLoginn");

	public PageObjects(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author Ayon Haldar
	 * @param userName - String User Name
	 * @param passWord - String PassWord This method is used to send user name and
	 *                 password
	 */
	public void passUserNameAndPassWord(String userName, String passWord) {
		driver.findElement(UserNameInputBox).sendKeys(userName);
		driver.findElement(PassWordInputBox).sendKeys(passWord);

	}

	/**
	 * @author Ayon Haldar -
	 * This method is used to click on login button
	 */
	public void clickOnLoginBtn() {
		driver.findElement(LoginBtn).click();
	}
}
