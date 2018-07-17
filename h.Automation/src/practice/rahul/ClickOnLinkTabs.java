package practice.rahul;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinkTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice");

		System.out.println(driver.findElements(By.tagName("a")).size());

		// to find no of links present in footer section
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());

		// To reach 1 column in footer

		WebElement columndriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// click on each link that all links are opening or not
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {

			// How to open the links in Separate Tabs - Optimized solution
			String ClickOnLinkTabs = Keys.chord(Keys.CONTROL, Keys.ENTER);

			columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLinkTabs);

			Thread.sleep(5000L);

		}

	}
}
