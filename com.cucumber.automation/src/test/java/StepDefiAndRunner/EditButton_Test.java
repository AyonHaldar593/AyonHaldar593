package StepDefiAndRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditButton_Test {
	
	WebDriver driver = null;
	LoginPF login = null;
	
	
	@Given("^user is in Login Page with valid (.*)$")
	public void user_is_in_login_page_with_valid_url(String url) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Soft_local\\Chromedriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    login =  PageFactory.initElements(driver, LoginPF.class);
		   login.SendUserNamePassword("abc", "ccc");
	}

	@When("^user provides valid (.*) and (.*)$")
	public void user_provides_valid_username_and_password(String userName , String password) throws Throwable {
	  // login = new LoginPF(driver);
		
	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	   login.clickOnLoginBu();
	}

	@Then("^TestYou home page should be displayed$")
	public void test_you_home_page_should_be_displayed() {
	  System.out.println("4");
	}

	@When("^user clicks on edit button and provide <city> , <state> and <phonenumber>$")
	public void user_clicks_on_edit_button_and_provide_city_state_and_phonenumber(String city,String state ,String phonenumber) {
	    System.out.println("5");
	}

	@And("^user clicks on updated button$")
	public void user_clicks_on_updated_button() {
	    System.out.println("6");
	}

	@Then("^system should update the details$")
	public void system_should_update_the_details() {
	  System.out.println("---END--");
	}

}
