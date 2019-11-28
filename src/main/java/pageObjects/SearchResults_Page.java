package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResults_Page extends BasePage {

	@FindBy(xpath = "//*[@id=\"origin-destination-label-desc\"]") private WebElement originDestinationText;
	
	public SearchResults_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getOriginDestinationText() throws InterruptedException, IOException {
		return waitAndGetText(originDestinationText);
	}

}
