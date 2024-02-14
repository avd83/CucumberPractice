package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/App/Features/UserRegistration.feature"},
glue = {"stepDefinitions"},
plugin= {"pretty",
		 "json:target/MyReports/report.jason",
		 "junit:target/Myreports/report.junit"},
publish = true,
dryRun=true
)




public class UserRegistration {
	
	
	

}
