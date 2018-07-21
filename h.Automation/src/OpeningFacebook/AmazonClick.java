package OpeningFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dell");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.cssSelector("input.nav-input")).click();
		
	}

}
