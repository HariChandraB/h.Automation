package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String path = "D:\\Selenium_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();*/
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dell");
		// driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.cssSelector("input.nav-input")).click();

		WebElement dDown = driver.findElement(By.id("sort"));
		// For dropdown create an object and pass that WebElement
		Select ddown = new Select(dDown);
		ddown.selectByIndex(1);
		// Possible ways to select the text from drop down
		/*
		 * ddown.selectByValue("featured-rank");
		 * ddown.selectByVisibleText("featured-rank");
		 */
	}

}
