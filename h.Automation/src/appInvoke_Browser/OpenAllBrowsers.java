package appInvoke_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenAllBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvokingChromeFirefoxIE();

	}

	public static void InvokingChromeFirefoxIE() {
		WebDriver driver;
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.github.com/");
		driver.manage().window().maximize();

		path = "D:\\Selenium_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
		driver.get("https://www.github.com/");

		path = "D:\\Selenium_drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		driver = new InternetExplorerDriver();
		driver.get("https://www.github.com/");
	}

}
