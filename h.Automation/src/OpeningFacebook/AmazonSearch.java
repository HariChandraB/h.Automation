package OpeningFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("jimmy choo man");
		driver.findElement(By.className("nav-input")).click();
		System.out.println("\t"+(driver.getTitle()));
		driver.close();
		// driver.findElement(By.className("a-size-medium s-inline
		// s-access-title a-text-normal")).click();

	}

}
