package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalTest {
	@Test
	public void launch() {
		
		/*Declaring WebDriver reference and initialising it as null*/
		WebDriver driver = null;
		
		/*Receiving browser data from cmd or jenkins*/
		String browser = System.getProperty("browser");
		
		/*Checking the browser value*/

		if (browser.equals("chrome"))
			driver = new ChromeDriver();

		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();
		
		else
			driver = new ChromeDriver();
		
		/*Launching royal enfield bike website*/

		driver.get("https://www.royalenfield.com/");
		
		/*Printing a message in the console*/

		Reporter.log("Royal Launched", true);
		
		/*Closing the browser session*/

		driver.close();

	}
}
