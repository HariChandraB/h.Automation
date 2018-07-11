package h.Automation.appInvoke_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class appInvokeChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");
		System.out.println("driver.getTitle()");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();
		/*
		 * String expTitle = "www.youtube.com"; String acuTitle =
		 * driver.getTitle(); if (expTitle.equals(acuTitle)) {
		 * System.out.println("Test Case passed"); } else { System.out.println(
		 * "Test case failed"); System.out.println("driver.getTitle()"); }
		 */

	}

}
