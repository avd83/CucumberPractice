package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/App/Features/Search.feature"},
glue = {"stepDefinitions","Hooks"},
tags="@Smoke",
plugin= {"pretty"}
)


public class AmazonTest {

}
