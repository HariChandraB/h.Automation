package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.github.com/");

		driver.manage().window().maximize();
		// Enter User name
		driver.findElement(By.id("user[login]")).sendKeys("h.Automation");

		// Enter Email Id
		driver.findElement(By.name("user[email]")).sendKeys("abc@gmail.com");

		// Enter Password
		driver.findElement(By.id("user[password]")).sendKeys("135SDERTYdj");
		
		// Click on Signup
		// driver.findElement(By.cssSelector("//button[class="btn btn-primary
		// btn-large f4 btn-block"]))).click();
		driver.navigate().refresh();
	}

}
