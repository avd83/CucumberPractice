package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	@Given("I have search field on Amazon page")
	public void i_have_search_field_on_amazon_page() {
		System.out.println("Step1 execute ");
	}

	@When("I search for product with name {string} and price {int}")
	public void i_search_for_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step2 execute :" + productName + "Price" + price + " ");
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step3 execute :Product " + productName + " is displayed");
	}

}
