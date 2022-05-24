package StepDefiAndRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest
{
	WebDriver driver=null;
	LoginPF loginPage = null;
	
	
		
	
	@Given("^when users provide the valid (.*) , user should be on login page$")
	public void user_is_in_login_page(String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get(URL);
	}

	@When("^users provide valid (.*) and (.*)")
	public void user_enter_valid_username_and_password(String userName , String password) throws Throwable {
		
		loginPage = new LoginPF(driver);
		loginPage.SendUserNamePassword(userName, password);
	}

	@And("^users click on the login$")
	public void user_clicks_on_the_loging_button() {
		
		loginPage.clickOnLoginBu();
	}

	@Then("^users should navigate to homePage$")
	public void user_is_navigated_to_login_page() {
	   
		String title = driver.getTitle();
		System.out.println("The Title is - "+title);
		driver.close();
	}
}
