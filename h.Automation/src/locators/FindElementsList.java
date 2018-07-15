package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		List<WebElement> labels = driver.findElements(By.className("html7magic"));

		int length = labels.size();
		System.out.println("Number of Elements : " + length);

		String email = labels.get(0).getText();
		String pass = labels.get(1).getText();

		if (email.equals("Email or Phone")) {
			System.out.println("Test Case passed");
		} else {
			System.out.println("Test Case Failed");
		}
		if (pass.equals("Password")) {
			System.out.println("Test Case passed");
		} else {
			System.out.println("Test Case Failed");
		}
		// Loop for many list elements
		/*
		 * for (int i = 0; i < length; i++) {
		 * System.out.println(labels.get(i).getText());
		 * 
		 * }
		 */

	}

}
