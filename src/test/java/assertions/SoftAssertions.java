package assertions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertions {
	public WebDriver driver;
	public String managerId="mngr525834";
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/V4/");
	}
	@Test
	public void verifyLogin() {
		driver.findElement(By.name("uid")).sendKeys("mngr525834");;
		
		driver.findElement(By.name("password")).sendKeys("sAzusUp");
		
		driver.findElement(By.name("btnLogin")).click();
		
		
		SoftAssert softAssert=new SoftAssert();
		
		
		
		String expectedTitle="Guru99 Bank Manager HomePage";
		String actualTitle=driver.getTitle();
		
		softAssert.assertEquals(expectedTitle, actualTitle);
		
		String expectedId="Manger Id : "+managerId;
		String actualId=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();

		
		assertEquals(expectedId, actualId);

	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
