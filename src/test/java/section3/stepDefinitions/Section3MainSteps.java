package section3.stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Section3MainSteps {
	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User landed On NetBanking page!!!");
	}
//	@When("user login into application with {string} and password {string}")
//	public void user_login_into_application(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User login into application!!!");
//		System.out.println("Username is:- "+username+" and password is:- "+password);
//	}
	@When("^user login into application with (.+) and password (.+)$")
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
	
//	Section-5 - Vid - 16 code
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	
}
