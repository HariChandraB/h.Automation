package practice.rahul;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Properties {

	// TODO Auto-generated method stub
	public void Login() throws IOException

	{

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\harih\\git\\h.Automation\\h.Automation\\src\\practice\\rahuldata\\driven.properties");

		prop.load(fis);

		// System.out.println(prop.getProperty("username"));

		if (prop.getProperty("browser").equals("firefox"))

		{

			WebDriver driver = new FirefoxDriver();

		}

		else if (prop.getProperty("browser").equals("chrome"))

		{

			WebDriver driver = new ChromeDriver();

		}

		else

		{

			WebDriver driver = new InternetExplorerDriver();

		}

		// driver.get(prop.getProperty("url"));

		// driver.findElement(By.xpath:').sendkeys(username)

	}

	private Object getProperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private void load(FileInputStream fis) {
		// TODO Auto-generated method stub

	}
}
