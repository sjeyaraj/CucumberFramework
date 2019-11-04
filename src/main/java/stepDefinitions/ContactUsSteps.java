package stepDefinitions;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ContactUsSteps {
	WebDriver driver;
	
//	@Before()
//	public void setup() throws IOException {
//		System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath() + "\\src\\test\\java\\resources\\drivers\\chromedriver.exe");
//		this.driver = new ChromeDriver();
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
//	}
	
//	@After()
//	public void tearDown() {
//		this.driver.manage().deleteAllCookies();
//		this.driver.quit();
//	}
	
	@Given("^I access webdriveruniversity contact us form$")
	public void i_access_webdriveruniversity_contact_us_form()  {
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
	}

	@When("^I enter a valid firstname$")
	public void i_enter_a_valid_firstname() throws InterruptedException  {
		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("tom");
	}

	@And("^I enter a valid last name$")
	public void i_enter_a_valid_last_name(DataTable dataTable)  {
		List<List<String>> data = dataTable.raw();
	    driver.findElement(By.cssSelector("input[name=\"last_name\"]")).sendKeys(data.get(0).get(1));
	}

	@And("^I enter a valid email address$")
	public void i_enter_a_valid_email_address()  {
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("tom.atom@atom.com");
	    
	}

	@And("^I enter some comments$")
	public void i_enter_some_comments(DataTable dataTable)  {
		List<List<String>> data = dataTable.raw();
		driver.findElement(By.cssSelector("textarea[name=\"message\"]")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.cssSelector("textarea[name=\"message\"]")).sendKeys(data.get(0).get(1));
	    
	}

	@And("^I click the submit button$")
	public void i_click_the_submit_button()  {
	    driver.findElement(By.cssSelector("input[value=\"SUBMIT\"]")).click();
	    
	}

	@Then("^entered comment should be submitted successfully$")
	public void entered_comment_should_be_submitted_successfully()  {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement textMessage = driver.findElement(By.cssSelector("#contact_reply > h1"));
		wait.until(ExpectedConditions.visibilityOf(textMessage));
	   String textValue = driver.findElement(By.cssSelector("#contact_reply > h1")).getText();
	   System.out.println(textValue);
	   Assert.assertEquals("Thank You for your Message!",textValue);
	    
	}
}
