package scmFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class StartTest {

	@Test
	public void launch() {
		WebDriver driver = null;

		String browser = System.getProperty("browser");

		if (browser.equals("chrome"))
			driver = new ChromeDriver();

		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();

		else
			driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
}
