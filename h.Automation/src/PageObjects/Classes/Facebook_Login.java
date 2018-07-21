package PageObjects.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebook_Login {
	WebDriver driver;

	// User name field
	@FindBy(id = "email")
	WebElement usrname;

	// Password Field
	@FindBy(id = "pass")
	WebElement password;

	// Login Button
	@FindBy(id = "loginbutton")
	WebElement loginbtn;

	public Facebook_Login(WebDriver driver) {
		this.driver = driver;
	}

	// verifies Login Page is Displayed
	public void isLoginPageisDisplayed() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}

	public void Login(String username, String Password) {
		usrname.sendKeys(username);
		password.sendKeys(Password);
		loginbtn.click();
	}

}
