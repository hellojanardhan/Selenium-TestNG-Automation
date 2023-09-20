package parallelExecution;

import org.testng.annotations.Test;

public class Test3 {
	@Test
	  public void test9() {
		  System.out.println("test9	"+Thread.currentThread().getId());
	  }
	  @Test
	  public void test10() {
		  System.out.println("test0	"+Thread.currentThread().getId());
	  }
	  
}
