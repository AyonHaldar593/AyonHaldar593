package LocatersAndMethods;

import org.junit.FixMethodOrder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage 
{
	
	@FindBy(how=How.XPATH,using="//input[contains(@name,'Container$txtUserLogin')]") 
	@CacheLookup
	WebElement loginID;
	
	@FindBy(how=How.XPATH,using="//input[contains(@name,'Container$txtPassword')]")
	@CacheLookup
	WebElement loginPassWord ;
	
	@FindBy(how=How.XPATH,using="//input[contains(@name,'Container$btnLoginn')]")
	@CacheLookup
	WebElement loginButton ;
	
	@FindBy(xpath = "xpath")
	WebElement loginNewbtn;

}
