package assertions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertions {
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
		
		String expectedId="Manger Id : "+managerId;
		String actualId=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
		
		System.out.println(actualId);
		
		assertEquals(expectedId, actualId);
		
		String expectedTitle="Guru99 Bank Manager HomePage ";
		String actualTitle=driver.getTitle();
		//hard assertions
		//Hard assertion is an assertion which throws the exception immediately upon failure of assertion
		assertEquals(expectedTitle, actualTitle,"Title is mismatched ");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
