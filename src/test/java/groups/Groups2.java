package groups;


import org.testng.annotations.Test;
@Test(groups = {"all"})
//any group created at class level,all the methods are belong this group.
public class Groups2 {
	  @Test(groups = {"smoke","regression"})
	  public void test4() {
		  System.out.println("test4");
	  }
	  @Test(groups = {"smoke","functional"})
	  public void test5() {
		  System.out.println("test5");
	  }
	  @Test(groups = {"smoke","regression","functional"})
	  public void test6() {
		  System.out.println("test6");
	  }
}
