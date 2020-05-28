package com.cucumberfw.CucumberFramework.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	@Given("^User launches website$")
	public void user_launches_website() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User launches website");
	}

	@Given("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User clicks on login button");
	}

	@Given("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User enters a valid username");
	}

	@Given("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User enters a valid password");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User clicks on the login button");
	}

	@Then("^User should be taken to home page$")
	public void user_should_be_taken_to_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should be taken to home page");
	}

}
