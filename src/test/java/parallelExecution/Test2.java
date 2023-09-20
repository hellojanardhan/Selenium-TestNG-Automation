package parallelExecution;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	  public void test5() {
		  System.out.println("test5	"+Thread.currentThread().getId());
	  }
	  @Test
	  public void test6() {
		  System.out.println("test6	"+Thread.currentThread().getId());
	  }
	  @Test
	  public void test7() {
		  System.out.println("test7	"+Thread.currentThread().getId());
	  }
	  @Test
	  public void test8() {
		  System.out.println("test8	"+Thread.currentThread().getId());
	  }
	  
}
