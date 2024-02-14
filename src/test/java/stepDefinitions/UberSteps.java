package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {

	@Given("User want to select a car type {string} from the uber app")
	public void user_want_to_select_a_car_type_from_the_uber_app(String carType) {
	   System.out.println("Step 1 :"+carType);
	}

	@When("user select car {string} and pick from {string} and drop location {string}")
	public void user_select_car_seaden_and_pick_from_and_drop_location(String carType,String pickupLocation, String dropLocation) {
		System.out.println("Step 2 :"+carType+" "+pickupLocation+" "+dropLocation);
	}

	@Then("Driver starts the car")
	public void driverstarts_the_car() {
		System.out.println("Step 3 :");
	}

	@Then("Driver ends the joureny")
	public void driver_ends_the_joureny() {
		System.out.println("Step 4 :");
	}

	@Then("user should be pay {int} INR")
	public void user_should_be_pay_inr(Integer price) {
		System.out.println("Step 5:"+price);
	}
}
