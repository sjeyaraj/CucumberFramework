package stepDefinitions;

import java.io.IOException;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ContactUsPage;
import utils.DriverFactory;

public class ContactUsSteps extends DriverFactory{
	
	@Given("^user access webdriveruniversity contact us form$")
	public void user_access_webdriveruniversity_contact_us_form() throws IOException{
		contactUsPage.getContactUsPage();
	}

	@When("^user enter a valid first name$")
	public void user_enter_a_valid_first_name() throws Exception{
		contactUsPage.enterFirstName();
	}

	@When("^user enter a valid last name$")
	public void user_enter_a_valid_last_name(DataTable lastname) throws Exception{
		contactUsPage.enterLastName(lastname, 0, 1);
	   
	}

	@And("^user enter a valid email address$")
	public void user_enter_a_valid_email_address() throws Exception{
		contactUsPage.enterEmailAddress("tom@gmail.com");
	}

	@And("^user enter comments$")
	public void user_enter_comments(DataTable comments) throws Exception{
		contactUsPage.enterComments(comments, 0, 1);
	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() throws Exception {
       contactUsPage.clickonSubmitButton();
	}

	@Then("^user should see successfull submission message$")
		public void user_should_see_successfull_submission_message() throws IOException, InterruptedException {
		contactUsPage.confirmContactUsFormSubmissionWasSuccessful();
	}
}