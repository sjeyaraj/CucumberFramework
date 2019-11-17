package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

	@FindBy(css = "#container-special-offers")
	WebElement button_SpecialOffers;
	@FindBy(css = "#container-product2")
	WebElement button_Laptops;
	@FindBy(xpath = "//div[@id='myModal']//b[contains(text(),'NEWCUSTOMER')]")
	WebElement vocherNumber;
	@FindBy(xpath = "//button[text()='Proceed']")
	WebElement button_Proceed_Popup;

	public ProductsPage() throws IOException {
		super();

	}

	public ProductsPage clickonProceedButton_Popup() throws InterruptedException, IOException {
		waitAndClickElement(button_Proceed_Popup);
		return new ProductsPage();
	}

	public String printSpecialOffersVoucherCode() {
		WaitUntilWebElementIsVisible(vocherNumber);
		String voucherCode = vocherNumber.getText();
		System.out.println("voucher code:" + voucherCode);
		return voucherCode;
	}

}