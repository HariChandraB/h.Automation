package exercise.Invokeapp;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeBrowserVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		/*System.setProperty("webdriver.gecko.driver", path);
		System.setProperty("webdriver.ie.driver", path);*/
		WebDriver driver = new ChromeDriver();
		/*WebDriver driverFirefox = new FirefoxDriver();
		WebDriver driverIE = new InternetExplorerDriver();*/
		Capabilities capb = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = capb.getBrowserName();
		String browserVersion = capb.getVersion();
		System.out.println("Browser Name : " + browserName + "\nBrowser Version : " + browserVersion);
		driver.close();

	}

}
