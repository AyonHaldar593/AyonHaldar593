package StepDefiAndRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "C:\\Work\\com.cucumber.automation\\Features\\EditTab.feature" , glue = {"StepDefiAndRunner"}
		
		
		)
public class TestRunner_Edit {

}
