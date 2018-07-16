package Selenium.rahul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String path =  "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();*/
		
		String path =  "D:\\Selenium_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.className("text-label"));
		/*Select s = new Select( (WebElement) driver.findElements(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("INR");
		s.selectByIndex(1);
		*/
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='COK']")).click();
			

		/*

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.xpath("//a[@value='GOI']")).click();

		*/

		// If you want to accees any methods in class ,create object for that class and access methods

		//using object.method

		/*Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));

		dropdown.selectByIndex(4);

		dropdown.selectByVisibleText("9 Adults");

		dropdown.selectByValue("8");*/

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		
		
	}
}
