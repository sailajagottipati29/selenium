package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:/Users/Admin/eclipse-workspace/BDD-Lumens-Test1/src/main/java/Features/login.feature",
			glue={"StepDefinition"}
			)
	 
	public class TestRunner {
	 
	}
	
	