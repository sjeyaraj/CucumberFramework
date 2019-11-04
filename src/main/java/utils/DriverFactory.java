package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

	public static WebDriver driver;

	public WebDriver initialize() {
		try {
			// Read config
			ReadConfigFile file = new ReadConfigFile();
			String browserName = file.getBrowser();

			switch (browserName) {
			case "firefox":
				if (driver == null) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIR);
					DesiredCapabilities cap = DesiredCapabilities.firefox();
					cap.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;
			case "chrome":
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIR);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;
			case "ie":
				if (driver == null) {
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIR);
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
		}

		return driver;
	}

}
