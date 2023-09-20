package groups;


import org.testng.annotations.Test;

public class Groups1 {
	
	  @Test(groups = {"smoke","regression","functional"})
	  public void test1() {
		  System.out.println("test1");
	  }
	  @Test(groups = {"smoke"})
	  public void test2() {
		  System.out.println("test2");
	  }
	  @Test(groups = {"regression","functional"})
	  public void test3() {
		  System.out.println("test3");
	  }
	  @Test
	  public void test() {
		  System.out.println("test3");
	  }
}
