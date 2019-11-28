package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSearch_Page extends BasePage {
	
	@FindBy(xpath = "//img[@alt=\"AirAsia logo\"]")  private WebElement airAsiaLogo;
	@FindBy(xpath = "//*[@id=\"product-tile-flight\"]") private WebElement flightIcon;
	@FindBy(xpath = "//*[@id=\"home-origin-autocomplete-heatmap\"]") private WebElement origin;
	@FindBy(xpath = "//*[@id=\"home-destination-autocomplete-heatmap\"]") private WebElement destination;
	@FindBy(xpath = "//*[@id=\"home-depart-date-heatmap\"]") private WebElement departDate;
	@FindBy(xpath = "//div[@class=\"radiobuttons\"][2]") private WebElement oneWayButton;
	@FindBy(xpath = "//button[@class=\"calendar-button\"]") private WebElement confirmButton;
	@FindBy (xpath = "//*[@id=\"home-flight-search-airasia-button-inner-button-select-flight-heatmap\"]") private WebElement searchButton;

	public FlightSearch_Page() throws IOException {
		super();
	}
	
	public boolean waitForPageLoad() {
		return WaitUntilWebElementIsVisible(airAsiaLogo);
	}
	public String getCurrentTitle() {
		return getPageTitle();
	}
	
	public void clickFlightIcon() throws InterruptedException, IOException {
		waitAndClickElement(flightIcon);
	}
	
	public void enterOrigin(String location) throws Exception {
		sendKeysToWebElement(origin, location);
	}
	
	public void enterDestination(String location) throws Exception {
		sendKeysToWebElement(destination, location);
	}
	
	public void enterDepartDate(String dateValue) throws Exception {
		waitAndClickElement(departDate);
		sendKeysToWebElement(departDate, dateValue);
	}
	
	public void clickOneWayButton() throws InterruptedException, IOException {
		waitAndClickElement(oneWayButton);
	}
	
	public void clickConfirmButton() throws InterruptedException, IOException {
		waitAndClickElement(confirmButton);
	}
	
	public void clickSearchButton() throws InterruptedException, IOException {
		waitAndClickElement(searchButton);
	}
	
}
