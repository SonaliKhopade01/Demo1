package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/Features/login.feature"},
		
		glue = {"StepDefinations"},
		
		publish = true,
		
		plugin = {"pretty","html:target/htmlReport/HTMLREPORT.html"},
		
		tags = "@functinal and @smoke"                                    //and or not
		)


public class TestRunner {

}
