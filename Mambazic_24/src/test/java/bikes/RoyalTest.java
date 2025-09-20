package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalTest {
	@Test
	public void launch()
	{
       WebDriver driver = null; 
		
		String browser = System.getProperty("browser");
		if(browser.equals("chrome"))
			driver=new ChromeDriver();		driver.get("https://www.royalenfield.com/");
		Reporter.log("Royal Launched", true);
		driver.close();

	}
}
