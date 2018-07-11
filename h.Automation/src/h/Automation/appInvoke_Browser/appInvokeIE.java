package h.Automation.appInvoke_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class appInvokeIE {
	public static void main(String[] args){
		String path = "D:\\Selenium_drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.uscis.gov/");
		
	}

}
