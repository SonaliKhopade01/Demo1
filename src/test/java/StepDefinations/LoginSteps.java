package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
	
		System.out.println("User should be on login page");
	}

	@When("user given correct userID")
	public void user_given_correct_user_id() {
	   
		System.out.println("User given Sonali as userID");
	}

	@When("user given correct Password")
	public void user_given_correct_password() {
	   
		System.out.println("user given pass123 as password");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	   
		System.out.println("user click on login button");
	}

	@Then("user should be redirect to home page")
	public void user_should_be_redirect_to_home_page() {
	   
		System.out.println("user should be on Home Page");
	}

	@When("User get the title of page")
	public void user_get_the_title_of_page() {
	   
		System.out.println("Retrive title of page");
	}

	@Then("page title should be verified")
	public void page_title_should_be_verified() {
	    
		System.out.println("Verify actual and expected title of page");
	}
}
