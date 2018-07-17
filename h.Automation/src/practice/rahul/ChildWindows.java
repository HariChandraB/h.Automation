package practice.rahul;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());

		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		String parentid = it.next();
		String childid = it.next();
		// Traversing from parent window to child window, that child window id
		// should be passed below.
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());

	}

}
