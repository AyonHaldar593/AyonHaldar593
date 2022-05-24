package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Base.BaseClass;

public class LoginPage 

{
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[contains(@name,'Container$txtUserLogin')]") 
	@CacheLookup
	WebElement loginID;
	
	@FindBy(how=How.XPATH,using="//input[contains(@name,'Container$txtPassword')]")
	@CacheLookup
	WebElement loginPassWord ;
	
	@FindBy(how=How.XPATH,using="//input[contains(@name,'Container$btnLoginn')]")
	@CacheLookup
	WebElement loginButton ;
	
	//@FindBy(xpath="//input[contains(@name,'Container$btnLoginn')]");
	//WebElement ele;
	

//	By loginID = By.xpath("//input[contains(@name,'Container$txtUserLogin')]");
//	By loginPassWord = By.xpath("//input[contains(@name,'Container$txtPassword')]");
//	By loginButton = By.xpath("//input[contains(@name,'Container$btnLoginn')]");
	
	
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	
	
	
	public void dologin(String userid , String pass)
	{
		
		loginID.sendKeys(userid);
		loginPassWord.sendKeys(pass);
		loginButton.click();
		
	}
	
	
	
	
}
