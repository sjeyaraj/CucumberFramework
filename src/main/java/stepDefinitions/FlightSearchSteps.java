package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class FlightSearchSteps extends DriverFactory  {
	
	@Given("^User navigates given \"([^\"]*)\"$")
	public void openUrl(String url) {
		getDriver().get(url);
	}

	@And("^verify its title$")
	public void verifyTitle() throws Exception {
		if(flightSearchPage.waitForPageLoad()) {
			String pageTitle = flightSearchPage.getCurrentTitle();
			assertEquals(pageTitle, "Book Flights, Hotels & Activities Online | AirAsia");
		} else {
			throw new Exception("Page did not load!");
		}
	}

	@And("^click on Flights icon$")
	public void clickIcon() throws InterruptedException, IOException  {
	    flightSearchPage.clickFlightIcon();
	    
	}

	@And("^Enter Origin as \"([^\"]*)\", Destination as \"([^\"]*)\"$")
	public void enterOrginDestination(String origin, String destination) throws Exception  {
	    flightSearchPage.enterOrigin(origin);
	    flightSearchPage.enterDestination(destination);
	    
	}

	@And("^Select Depart date as \"([^\"]*)\"$")
	public void selectDate(String departDate) throws Exception  {
	    flightSearchPage.enterDepartDate(departDate);
	    
	}

	@And("^Select Return date as One Way$")
	public void selectReturnDate() throws InterruptedException, IOException  {
	   flightSearchPage.clickOneWayButton();
	   flightSearchPage.clickConfirmButton();
	    
	}

	@When("^user clicks on Search Btn$")
	public void clickSearchButton() throws InterruptedException, IOException  {
	    flightSearchPage.clickConfirmButton();
	    
	}

	@Then("^user should be navigated to search flight page$")
	public void verifySearchResultsPages() throws InterruptedException, IOException  {
	    String route = searchResultsPage.getOriginDestinationText();
	    assertEquals(route, "Bengaluru to Pune");
	    
	}

}
