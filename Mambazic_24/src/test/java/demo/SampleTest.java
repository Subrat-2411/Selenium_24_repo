package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void login() {
		WebDriver driver = null;

		String browser = System.getProperty("browser");

		if (browser.equals("chrome"))
			driver = new ChromeDriver();

		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();

		else
			driver = new ChromeDriver();
		Reporter.log("Something", true);
		driver.close();
	}
}
