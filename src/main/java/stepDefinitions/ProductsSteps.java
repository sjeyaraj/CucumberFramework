package stepDefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ProductsSteps extends DriverFactory {

	@Given("^user navigates to \"([^\"]*)\" website$")
	public void user_navigates_to_website(String url) throws Throwable {
		getDriver().get(url);
	}

	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String locator) throws Throwable {
		// you can also use basepage instead of creating a method in products page
		basePage.WaitUntilWebElementIsVisibleUsingByLocator(By.cssSelector(locator));
		getDriver().findElement(By.cssSelector(locator)).click();
	}

	@Then("^user should be presented with promo code$")
	public void user_should_be_presented_with_promo_code() throws Throwable {
		productsPage.printSpecialOffersVoucherCode();
		productsPage.clickonProceedButton_Popup();

	}

}