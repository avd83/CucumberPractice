package stepDefinitions;


import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Billing {
	 double billingAmount;
	 double taxAmount;
	 double finalAmount;
	
	@Given("User is on billing page")
	public void user_is_on_billing_page() {
		System.out.println("user is landing on billing page ");
	}

	@When("User eneter billing amount {string}")
	public void user_eneter_billing_amount(String billingAmount) {
		this.billingAmount= Double.parseDouble(billingAmount);	   
	}

	@When("User enters tax amount {string}")
	public void user_enters_tax_amount(String taxAmount) {
		this.taxAmount= Double.parseDouble(taxAmount);
	}

	@When("User clicks on calculate button")
	public void user_clicks_on_calculate_button() {
		System.out.println("user clicked on calculate button ");
	}

	@Then("it gives the final amount {string}")
	public void it_gives_the_final_amount(String expetedFinalAmount) {
		this.finalAmount= this.billingAmount+this.taxAmount;
		System.out.println("Exepcted final amount:"+ Double.parseDouble(expetedFinalAmount));
		System.out.println("Actual final amount:" + this.finalAmount);
		Assert.assertTrue(this.finalAmount==Double.parseDouble(expetedFinalAmount));
	}
}
