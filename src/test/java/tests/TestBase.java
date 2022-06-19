package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	public void StartTest() {
		String Chromepath = System.getProperty("user.dir")+"\\driver\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", Chromepath);
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
	}
	
	
	
	@AfterSuite
	public void EndTest() {
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}
}
