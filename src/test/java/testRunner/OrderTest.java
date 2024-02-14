package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/App/Features/Order.feature"},
glue = {"stepDefinitions"},
tags="@All",
plugin= {"pretty"         
		         }
)

//tags = "not @Smoke")
//tags="@All")
//tags="@Smoke and @Regression")
//tags = "@Smoke" )
		

public class OrderTest {

}
