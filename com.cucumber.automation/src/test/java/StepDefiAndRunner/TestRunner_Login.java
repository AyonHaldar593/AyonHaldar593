package StepDefiAndRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Work\\com.cucumber.automation\\Features\\login1.feature", glue= {"StepDefi"},monochrome = true,
plugin ={"pretty","html:target/HtmlReports.html"}

		) 
public class TestRunner_Login {

}
