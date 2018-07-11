package exercise.Invokeapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeAllBrowsers {

	private static WebDriver driver;

	public static WebDriver OpenApp(String BrowserName, String url) {
		app_BrowserLaunch(BrowserName);
		app_OpenURL(url);
		// WebDriver driver = null;
		return driver;
	}

	private static void app_OpenURL(String url) {
		// WebDriver driver = null;
		// TODO Auto-generated method stub
		driver.get(url);

	}

	private static void app_BrowserLaunch(String browserName) {
		// TODO Auto-generated method stub
		if (browserName == "Chrome") {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("");

		} else if (browserName == "FireFox") {
			String path = "D:\\Selenium_drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			WebDriver driver = new FirefoxDriver();

		} else if (browserName == "InternetExplorer") {
			String path = "D:\\Selenium_drivers\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", path);
			WebDriver driver = new InternetExplorerDriver();
		}
		return;
	}

}
