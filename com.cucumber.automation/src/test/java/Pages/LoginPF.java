package Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPF {
	
	WebDriver driver;
	
	@FindBy (xpath = "//input[@id='ctl00_CPHContainer_txtUserLogin']")
	WebElement Username;
	
	@FindBy (xpath = "//input[@id='ctl00_CPHContainer_txtPassword']")
	WebElement Password;
	
	@FindBy (xpath = "//input[@id='ctl00_CPHContainer_btnLoginn']")
	WebElement LoginButton;
	
	
	public LoginPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void SendUserNamePassword(String userName , String password) throws InterruptedException {
		System.out.println(userName);
		System.out.println(password);
		Thread.sleep(10000);
		if(Username.isDisplayed()) {
			System.out.println(userName);
			System.out.println(password);
		Username.sendKeys(userName);
		}
		Password.sendKeys(password);
	}
	
	public void clickOnLoginBu() {
		LoginButton.click();
		
		
	}


}
