package StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {


@Given("^Open Chrome$")
public void Open_Chrome() throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	System.out.println("chrome opend");
}

@When("^I entered a valid email and password$")
public void I_entered_a_valid_email_and_password() throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	System.out.println("Pass and email");
}

@Then("^user should abel to login$")
public void user_should_abel_to_login() throws Throwable {
    // Express the Regexp above with the code you wish you had
   // throw new PendingException();
	System.out.println("Driver close");
}


	

}
