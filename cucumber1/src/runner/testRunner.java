package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "C:\\Work\\cucumber1\\features" , 
glue="C:\\Work\\cucumber1\\src\\StepDef")
public class testRunner {
	
	

}
