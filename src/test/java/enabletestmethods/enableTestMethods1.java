//create new file for package level ignore and add this package in those files.
package enabletestmethods;

import org.testng.annotations.Test;

public class enableTestMethods1 {
	@Test(enabled = false)
	  public void test1() {
		  System.out.println("test1");
	  }
	  @Test
	  public void test2() {
		  System.out.println("test2");
	  }
	  @Test
	  public void test3() {
		  System.out.println("test3");
	  }
}
