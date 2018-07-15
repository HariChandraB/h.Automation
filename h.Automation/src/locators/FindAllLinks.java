package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		List<WebElement> lk = driver.findElements(By.tagName("a"));
		int j = lk.size();
		System.out.println(j);
		int i = 0;
		// String k = lk.get(i).getText();

		for (i = 0; i < j; i++) {
			if (!(lk.get(i).getText().contentEquals(""))) {
				System.out.println(lk.get(i).getText());
			}

		}

		/*
		 * List<WebElement> links = driver.findElements(By.tagName("a"));
		 * 
		 * System.out.println(links.size()); int length = links.size();
		 * 
		 * for (int i = 0; i <= length; i++)
		 * 
		 * {
		 * 
		 * System.out.println("Links: " + i + links.get(i).getText() + "\n"); if
		 * (links.get(i).getText().contentEquals(" ")) { System.out.println("");
		 * } }
		 */
	}

}
