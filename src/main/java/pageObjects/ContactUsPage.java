package pageObjects;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import cucumber.api.DataTable;


public class ContactUsPage extends BasePage{
   @FindBy(xpath = "//input[@name='first_name']")
   WebElement textfield_FirstName;
   @FindBy(xpath = "//input[@name='last_name']")
   WebElement textfield_LastName;
   @FindBy(xpath = "//input[@name='email']")
   WebElement textfield_EmailAddress;
   @FindBy(xpath="//textarea[@name='message']") 
   WebElement textfield_Message;
   @FindBy(xpath="//input[@type='submit']")
   WebElement button_Submit;
   
   
	public ContactUsPage() throws IOException {
		super();
		
	}
	
	public ContactUsPage getContactUsPage() throws IOException {
		driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");
		return new ContactUsPage();
	}
	
	public ContactUsPage enterFirstName() throws Exception {
		sendKeysToWebElement(textfield_FirstName, "Tom");
		return new ContactUsPage();
	}
	
	public ContactUsPage enterLastName(DataTable lastname, int row, int column) throws Exception {
		List<List<String>> data = lastname.raw();
		sendKeysToWebElement(textfield_LastName, data.get(row).get(column));
		return new ContactUsPage();
	}
	
	public ContactUsPage enterEmailAddress(String email) throws Exception {
		sendKeysToWebElement(textfield_EmailAddress, email);
		return new ContactUsPage();
	}
	
	public ContactUsPage enterComments(DataTable comments, int row, int column) throws Exception {
		  List<List<String>> data = comments.raw();
		  sendKeysToWebElement(textfield_Message, data.get(row).get(column));
		  return new ContactUsPage();
		}
	
	public ContactUsPage clickonSubmitButton() throws Exception {
		waitAndClickElement(button_Submit);
		return new ContactUsPage();
	}
	
	public ContactUsPage confirmContactUsFormSubmissionWasSuccessful() throws IOException, InterruptedException {
		WebElement thanksContactUsPage = driver.findElement(By.xpath(".//*[@id='contact_reply']/h1"));
		WaitUntilWebElementIsVisible(thanksContactUsPage);
		Assert.assertEquals("thankyouforyourmessage!", thanksContactUsPage.getText().toLowerCase().replaceAll("[ ()0-9]",""));
		return new ContactUsPage();
	}

}