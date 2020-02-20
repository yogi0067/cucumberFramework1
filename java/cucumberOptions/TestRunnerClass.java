package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\TEST_Yogesh\\Automation\\src\\test\\java\\features",
		glue = "stepDefinition")
	
public class TestRunnerClass {

	
}
