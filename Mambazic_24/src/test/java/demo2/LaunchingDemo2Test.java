package demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingDemo2Test {

	
	@Test
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.close();
	}
}
