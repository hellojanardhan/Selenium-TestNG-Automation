package parallelExecution;

import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void test1() {
	  System.out.println("test1	"+	Thread.currentThread().getId());
  }
  @Test
  public void test2() {
	  System.out.println("test2	"+	Thread.currentThread().getId());
  }
  @Test
  public void test3() {
	  System.out.println("test3	"+	Thread.currentThread().getId());
  }
  @Test
  public void test4() {
	  System.out.println("test4	"+	Thread.currentThread().getId());
  }
  
}
