package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.BasePage;
import pageObjects.ContactUsPage;
import pageObjects.ProductsPage;

public class DriverFactory {

	public static WebDriver driver;
	public static ContactUsPage contactUsPage;
	public static ProductsPage productsPage;
	public static BasePage basePage;

	public WebDriver getDriver() {
		try {
//			Read config
//			ReadConfigFile file = new ReadConfigFile();
//			String browserName = file.getBrowser();
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\properties\\config.properties");
			prop.load(file);
			String browserName = prop.getProperty("browser");
			
			switch (browserName) {
			case "firefox":
				if (driver == null) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities cap = DesiredCapabilities.firefox();
					cap.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;
			case "chrome":
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;
			case "ie":
				if (driver == null) {
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
					cap.setCapability("ignoreZoomSetting", true);
					driver = new InternetExplorerDriver(cap);
					driver.manage().window().maximize();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("unable to load driver" + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
			productsPage = PageFactory.initElements(driver, ProductsPage.class);
			basePage = PageFactory.initElements(driver, BasePage.class);
		}

		return driver;
	}

}
