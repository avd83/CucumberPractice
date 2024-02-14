package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/App/Features/Uber.feature"},
glue = {"stepDefinitions"},
tags = "not @Smoke",
plugin= {"pretty",
		 "json:target/MyReports/report.jason",
		 "junit:target/Myreports/report.junit"},
publish = true,
dryRun=true
)

//tags="@All")
//tags="@Smoke and @Regression")
//tags = "@Smoke" )


public class UberTest {

}
