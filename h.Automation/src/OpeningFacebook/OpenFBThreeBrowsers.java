package OpeningFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenFBThreeBrowsers {

	public static void fbOpensInThreeBrowsers() {

		WebDriver driver;
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("xxxx@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("AEIOU#456");
		driver.findElement(By.id("u_0_2")).click();

		path = "D:\\Selenium_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("xxxx@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("AEIOU#456");
		driver.findElement(By.id("u_0_2")).click();

		path = "D:\\Selenium_drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("xxxx@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("AEIOU#456");
		driver.findElement(By.id("u_0_2")).click();
	}

	/*public static void drivers() {
		WebDriver driver = null;
		driver.findElement(By.id("email")).sendKeys("xxxx@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("AEIOU#456");
		driver.findElement(By.id("u_0_2")).click();
	}*/
}
