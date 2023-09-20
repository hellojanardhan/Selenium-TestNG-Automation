package dataprovider;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataWithExcel {
	public WebDriver driver;
	  @BeforeTest
	  public void setUp() {
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
	  }
	  @Test(dataProvider = "loginData",dataProviderClass = IntegrationofExcelWithDataProvider.class)
	  public void login(String email,String password) throws InterruptedException {
		  driver.get("https://admin-demo.nopcommerce.com/login?");
		  driver.findElement(By.name("Email")).clear();
		  Thread.sleep(1000);
		  driver.findElement(By.name("Email")).sendKeys(email);
		  Thread.sleep(1000);
		  driver.findElement(By.name("Password")).clear();
		  Thread.sleep(1000);
		  driver.findElement(By.name("Password")).sendKeys(password);
		  
		  driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		  
		 Thread.sleep(3000);
		 
		 assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
	  }
	  @AfterTest
	  public void closeBrowser() {
		  driver.quit();
	  }

}
