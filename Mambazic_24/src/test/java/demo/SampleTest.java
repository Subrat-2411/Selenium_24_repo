package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		Reporter.log("Something", true);
		driver.close();
	}
}
