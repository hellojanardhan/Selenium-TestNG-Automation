package parameters;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionalParameters {
	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void setUp(@Optional("FireFox") String browserName) {
		switch (browserName) {
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("browser Name is invalid");
		}
	}
	@Parameters("url")
	@Test
	public void launchBrowswer(String url) {
		driver.get(url);
	}
	@org.testng.annotations.Parameters({"uid","password"})
  @Test
  public void login(String uid,String password) {
	  driver.findElement(By.name("uid")).sendKeys(uid);
	  
	  driver.findElement(By.name("password")).sendKeys(password);
	  
	  driver.findElement(By.name("btnLogin")).click();
  }
  @org.testng.annotations.Parameters("expectedTitle")
  @Test
  public void verifyLogin(String expectedTitle) {
	  String actualTitle=driver.getTitle();
	  assertEquals(expectedTitle, actualTitle,"Title is mismatched ");
  }
  @AfterTest
  public void closeBrowser() {
	  driver.quit();
  }
}
