package demoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNGScript {
	public WebDriver driver;
	@Test
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://amazon.in");
	}
	@Test
	public void launchBrowser() {
		driver.get("https://amazon.in");
	}
	
	@Test
	public void tearDown() {
		driver.quit();
	}
}
