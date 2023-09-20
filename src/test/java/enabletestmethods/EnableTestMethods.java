package enabletestmethods;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class EnableTestMethods {
	@Ignore
  @Test
  public void test1() {
	  System.out.println("test1");
  }
	@Ignore
  @Test(enabled = true)
  public void test2() {
	  System.out.println("test2");
  }
  @Test
  public void test3() {
	  System.out.println("test3");
  }
 
}
