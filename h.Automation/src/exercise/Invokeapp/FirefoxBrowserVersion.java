package exercise.Invokeapp;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxBrowserVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\Selenium_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();
		Capabilities capb = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = capb.getBrowserName();
		String browserVersion = capb.getVersion();
		System.out.println("Browser Name :" + browserName + "\nBrowser Version :" + browserVersion + "\nTitile :"
				+ (driver.getCurrentUrl()));
	}

}
