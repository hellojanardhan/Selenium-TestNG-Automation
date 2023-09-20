package testpriority;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPriority {
	WebDriver driver;
  @BeforeTest
  public void setUp() {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
  }
  @Test(priority = 1)
  public void launchBrowser() {
	  driver.get("https://demo.guru99.com/v4/");
  }
  @Test(priority = 2)
  public void login() {
	  driver.findElement(By.name("uid")).sendKeys("mngr525834");
	  driver.findElement(By.name("password")).sendKeys("sAzusUp");
	  driver.findElement(By.name("btnLogin")).click();
  }
  @Test(priority = 3)
  public void verifyLogin() {
	  assertEquals("Guru99 Bank Manager HomePage", driver.getTitle());
  }

  @AfterTest
  public void closeBrowser() {
	  driver.quit();
  }
}
