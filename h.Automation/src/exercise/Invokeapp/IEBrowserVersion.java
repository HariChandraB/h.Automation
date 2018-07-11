package exercise.Invokeapp;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IEBrowserVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\Selenium_drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		WebDriver driver = new InternetExplorerDriver();
		Capabilities capb = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = capb.getBrowserName();
		String browserVersion = capb.getVersion();
		System.out.println("Browser Name :" + browserName + "\nBrowser Version :" + browserVersion + "\nTitile :"
				+ (driver.getCurrentUrl()));

	}

}
