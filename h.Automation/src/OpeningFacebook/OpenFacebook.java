package OpeningFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
	public static void OpenfbApplication(){
		WebDriver driver;
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("xxxx@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("AEIOU#456");
		driver.findElement(By.id("u_0_2")).click();
	}
	

}
