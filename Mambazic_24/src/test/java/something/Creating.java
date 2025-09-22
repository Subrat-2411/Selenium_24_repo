package something;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Creating {
	@Test
	public void demo() {
		WebDriver driver = null;

		String browser = System.getProperty("browser");

		if (browser.equals("chrome"))
			driver = new ChromeDriver();

		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();

		else
			driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.getTitle();
		driver.close();
	}
}
