package section3.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Section3MainSteps {
	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User landed On NetBanking page!!!");
	}
	@When("user login into application with {string} and password {string}")
	public void user_login_into_application(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User login into application!!!");
		System.out.println("Username is:- "+username+" and password is:- "+password);
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page is displayed!!!");
	}
	@Then("Cars are displayed")
	public void cars_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cars are displayed!!!");
	}
}
