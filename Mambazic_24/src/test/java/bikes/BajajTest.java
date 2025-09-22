package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BajajTest {
	@Test
	public void launch()
	{
		WebDriver driver = null; 
		
		String browser = System.getProperty("browser");
		
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
		
		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();
		
		else
			driver = new ChromeDriver();
		
		driver.get("https://www.bajajauto.com/bikes");
		
		Reporter.log("Bajaj Launched", true);
		
		
		driver.close();

	}
}
