package h.Automation.appInvoke_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class appInvokeMozilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\Selenium_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();

		driver.get("https://github.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

}
