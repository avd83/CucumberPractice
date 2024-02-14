package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User is on application landing page")
	public void user_is_on_application_landing_page() {
		System.out.println("user on landin page of application");
	}

	@When("User click on sign in button")
	public void user_click_on_sign_in_button() {
		System.out.println("user clicked on sign button");
	}

	@Then("User is displayed login screen")
	public void user_is_displayed_login_screen() {
		System.out.println("user is on login screens");

	}

	@When("User eneter {string} in username field")
	public void user_eneter_in_username_field(String userName) {
		System.out.println("user entered username :" + userName + "");
	}

	@When("User enter {string} in password field")
	public void user_enter_in_password_field(String password) {
		System.out.println("user entered password :" + password + "");
	}

	@When("clicks on signin button")
	public void clicks_on_signin_button() {
		System.out.println("user clicked on signin button");
	}

	@Then("Usr gets login failed message")
	public void usr_gets_login_failed_message() {
		System.out.println("user gets invalid login error message");
	}
}
