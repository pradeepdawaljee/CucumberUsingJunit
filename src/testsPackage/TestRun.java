package testsPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		features="src/featureFolder",
		glue={"stepDefinitionPackage"}
		)

public class TestRun {	
	
}
