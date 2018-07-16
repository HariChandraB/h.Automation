package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "D:\\Selenium_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.github.com/");

		driver.manage().window().maximize();

		// Enter User name
		// driver.findElement(By.id("user[login]")).sendKeys("h.Automation");

		// Enter Email Id
		// driver.findElement(By.name("user[email]")).sendKeys("abc@gmail.com");

		// Enter Password
		// driver.findElement(By.id("user[password]")).sendKeys("135SDERTYdj");

		// Click on Signup
		// driver.findElement(By.cssSelector("//button[class="btn btn-primary
		// btn-large f4 btn-block"]))).click();
		// driver.navigate().refresh();

		// driver.findElement(By.linkText("privacy statement")).click();

		// Partial Links comes into picture when we had the hyperlinks of in
		// very large.
		// driver.findElement(By.partialLinkText("privacy")).click();

		// Inorder to check a particular fileds preent in web we can search
		/*WebElement email = driver.findElement(By.id("user[login]"));

		if (email.isDisplayed() == true) {
			email.sendKeys("abc@gmail.com");

		} else {
			System.out.println("Test Case Failed - Email field is not dispalyed");
		}

		WebElement pass = driver.findElement(By.id("user[password]"));
		if (pass.isDisplayed()) {
			pass.sendKeys("135SDERTYdj");
		} else {
			System.out.println("Test Case Failed - Pass field is not dispalyed");
		}*/
		WebElement link = driver.findElement(By.linkText("privacy statement"));

		String LinkText = link.getText();
		System.out.println(LinkText);
		if (LinkText.equals("Privacy statement") == true) {
			link.click();
			System.out.println(LinkText);
			WebElement hText = driver.findElement(By.className("breadcrumbs"));
			String hTxt = hText.getText();
			System.out.println("Header Text is :"+hTxt);
			if(hTxt.equals("Site Policy / GitHub Privacy Statemen")){
				System.out.println("Test Passed");
			}
		} else {
			System.out.println("Test Case Failed - Link field is not dispalyed");
		}

//		Click on Signup
		WebElement SignUp = driver.findElement(By.cssSelector("type#submit"));
		
	}

}
