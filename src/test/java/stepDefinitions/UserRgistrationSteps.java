package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRgistrationSteps {

	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("User navigate to registration page :");
	}

	@When("User enter following registration details")
	public void user_enter_following_registration_details(DataTable dataTable) {

		List<List<String>> userList = dataTable.asLists(String.class);

		for (List<String> e : userList) {
			System.out.println(e);
		}
	}
	
	@When("User enter following registration details with columns")
	public void user_enter_following_registration_details_with_columns(DataTable dataTable) {
		List<Map<String,String>> userList = dataTable.asMaps(String.class,String.class);
		
		for(Map<String,String> e : userList)
		{
			System.out.println(e.get("firstName"));
			System.out.println(e.get("email"));
			System.out.println(e.get("phoneNo"));
			System.out.println(e.get("city"));
		}		
	}

	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
		System.out.println("User registration completed successfuly :");
	}
}
