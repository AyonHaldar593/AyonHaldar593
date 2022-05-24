package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditPage 
{
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//div[text()='Edit']")
	@CacheLookup
	WebElement Editbtn;
	
	
	
	
	public EditPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	
	public void editButton()
	{
		Editbtn.click();
	}

	
	
}
