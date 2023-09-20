package PackageInXML;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingPackageInXML {
	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	@Test
	public void launchBrowser() {
		driver.get("https://amazon.in");
		driver.navigate().refresh();
		
		driver.quit();
	}
	
}
