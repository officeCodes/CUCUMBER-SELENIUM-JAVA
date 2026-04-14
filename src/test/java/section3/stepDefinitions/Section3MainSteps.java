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
	@When("user login into application")
	public void user_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User login into application!!!");
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
