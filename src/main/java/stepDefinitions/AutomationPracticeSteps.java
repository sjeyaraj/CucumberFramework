package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import utils.DriverFactory;

public class AutomationPracticeSteps extends DriverFactory {
	@Given("^Navigate to http://automationpractice\\.com/index\\.php$")
	public void navigateToAutomationPractice()  {
		getDriver().get("http://automationpractice.com/index.php");
		
	}

	@And("^Click on Sign In Button$")
	public void click_on_Sign_In_Button()  {
		automationPracticePage.clickSignOnBtn();
	   
	}

	@And("^In email address pass a valid email id as \"([^\"]*)\"$")
	public void in_email_address_pass_a_valid_email_id_as(String email)  {
		automationPracticePage.enterEmail(email);
	   
	}

	@And("^Click on Register$")
	public void click_on_Register()  {
		automationPracticePage.clickRegister();
	}

	@And("^Validate you are on the registration page$")
	public void validate_you_are_on_the_registration_page()  {
		automationPracticePage.verifyHeader();
	    
	}

	@And("^Select the title radiobox as \"([^\"]*)\"$")
	public void select_the_title_radiobox_as(String title)  {
		
		automationPracticePage.selectTitle(title);
	}

	@And("^Enter first name as \"([^\"]*)\"$")
	public void enter_first_name_as(String firstName)  {
		automationPracticePage.enterFirstName(firstName);
	    
	}

	@And("^Enter last name as \"([^\"]*)\"$")
	public void enter_last_name_as(String lastName)  {
		automationPracticePage.enterLastName(lastName);
	}

	@And("^Enter password	\"([^\"]*)\"$")
	public void enter_password(String password)  {
		automationPracticePage.enterPassword(password);
	}

	@And("^Select date \"([^\"]*)\",month\"([^\"]*)\" and year\"([^\"]*)\" of birth$")
	public void select_date_month_and_year_of_birth(String day, String month, String year)  {
		automationPracticePage.selectDay(day);
		automationPracticePage.selectMonth(month);
		automationPracticePage.selectYear(year);
	}

	@And("^Enter Address \"([^\"]*)\"$")
	public void enter_Address(String address)  {
		automationPracticePage.enterAddress(address);
	}

	@And("^Enter City \"([^\"]*)\"$")
	public void enter_City(String city)  {
		automationPracticePage.enterCity(city);
	   
	}

	@And("^Select country \"([^\"]*)\"$")
	public void select_country(String country)  {
		automationPracticePage.selectCountry(country);
	}

	@And("^Select state \"([^\"]*)\"$")
	public void select_state(String state)  {
		automationPracticePage.selectState(state);
	    
	}

	@And("^Enter postal code \"([^\"]*)\"$")
	public void enter_postal_code(String pincode)  {
		automationPracticePage.enterPin(pincode);
	}

	@And("^Enter Mobile Phone \"([^\"]*)\"$")
	public void enter_Mobile_Phone(String phoneNo)  {
		automationPracticePage.enterMobile(phoneNo);
	    
	}

	@When("^Click on Register button$")
	public void click_on_Register_button()  {
		automationPracticePage.clickRegisterBtn();
	}

	@Then("^Validate that you are successfully registered$")
	public void validate_that_you_are_successfully_registered()  {
		automationPracticePage.verifyMessage();
	    
	}

}
