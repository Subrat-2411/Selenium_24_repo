package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BMWTest {
	@Test
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bmw.com/");
		Reporter.log("BMW Launched", true);
		driver.close();

	}
}
