package appInvoke_Browser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExecuteAllBrowserbySC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String BrowserName = "";
		String url = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Browser Name : ");
		BrowserName = s.nextLine();
		System.out.println("Enter Url : ");
		url = s.nextLine();

		if (BrowserName.equals("Chrome")) {
			String path = "D:\\Selenium_drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			WebDriver driver = new ChromeDriver();
			driver.navigate().to(url);
		} else if (BrowserName.equals("Firefox")) {
			String path = "D:\\Selenium_drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to(url);
		} else if (BrowserName.equals("IE")) {
			String path = "D:\\Selenium_drivers\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", path);
			WebDriver driver = new InternetExplorerDriver();
			driver.navigate().to(url);
		}
	}

}
