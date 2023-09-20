package enabledisabletests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnableDisable {
	WebDriver driver;
	@org.testng.annotations.Parameters("url")
  @BeforeTest
  public void setUp(String url) {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
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
