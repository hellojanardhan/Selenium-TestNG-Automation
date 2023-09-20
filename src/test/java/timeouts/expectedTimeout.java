package timeouts;

import static org.testng.Assert.assertEquals;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class expectedTimeout {
	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/V4/");
	}
	@Test(timeOut = 1000,expectedExceptions = {NoSuchElementException.class})
	public void verifyLogin() {
		driver.findElement(By.name("uid1")).sendKeys("mngr525834");
		
		driver.findElement(By.name("password")).sendKeys("sAzusUp");
		
		driver.findElement(By.name("btnLogin")).click();
		
		String expectedTitle="Guru99 Bank Manager HomePage";
		String actualTitle=driver.getTitle();
		assertEquals(expectedTitle, actualTitle,"Title is mismatched ");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
