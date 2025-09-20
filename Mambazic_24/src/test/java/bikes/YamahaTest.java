package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class YamahaTest {
	@Test
	public void launch() {
		WebDriver driver = null;

		String browser = System.getProperty("browser");
		if (browser.equals("Chrome"))
			driver = new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Reporter.log("Yamaha Launched", true);
		driver.close();

	}
}
