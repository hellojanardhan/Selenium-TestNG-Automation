package demoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLogin {
	public WebDriver driver;
	@Test
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/V4/");
	}
	@Test
	public void verifyLogin() {
		driver.findElement(By.name("uid")).sendKeys("mngr525834");
		
		driver.findElement(By.name("password")).sendKeys("sAzusUp");
		
		driver.findElement(By.name("btnLogin")).click();
	}
	@Test
	public void tearDown() {
		driver.quit();
	}
}
