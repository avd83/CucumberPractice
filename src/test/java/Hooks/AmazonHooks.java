package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AmazonHooks {

	@Before(order=1)
	public void setUp() {
		System.out.println("lanch browser");
	}

	@Before(order=2)
	public void setUp_URL() {
		System.out.println("lanch Amazon Application2");
	}

	@After(order=2)
	public void tearDown() {
		System.out.println("close Amazon Application");
	}

	@After(order=1)
	public void tearDown_Browser() {
		System.out.println("close browser");
	}
	
	@BeforeStep("@Smoke")
	public void screenShot() {
		System.out.println("take screen shot ");
	}

	@AfterStep
	public void refresh() {
		System.out.println("get refresh the page");
	}
	
	
}
