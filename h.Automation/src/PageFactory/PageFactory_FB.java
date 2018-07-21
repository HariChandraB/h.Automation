package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.Classes.Facebook_Login;

public class PageFactory_FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");

		Facebook_Login login = PageFactory.initElements(driver, Facebook_Login.class);
		login.isLoginPageisDisplayed();
		login.Login("somebody", "somepassword");
	}

}
