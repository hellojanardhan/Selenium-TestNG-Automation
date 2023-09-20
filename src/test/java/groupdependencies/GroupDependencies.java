package groupdependencies;

import org.testng.annotations.Test;

public class GroupDependencies {
  @Test(groups = {"sanity"})
  public void test1() {
	  System.out.println("sanity");
	  
  }
  @Test(groups = {"sanity"})
  public void test2() {
	  System.out.println("sanity");
  }
  @Test(groups = {"sanity"})
  public void test3() {
	  System.out.println("sanity");
//	  System.out.println(5/0);
  }
  
  @Test(groups = {"performnace"})
  public void test4() {
	  System.out.println("performance");
	  
  }
  @Test(groups = {"performance"})
  public void test5() {
	  System.out.println("performance");
  }
  @Test(groups = {"performance"})
  public void test6() {
	  System.out.println("performance");
//	  System.out.println(5/0);
  }
  @Test(dependsOnGroups = {"sanity","performance"},alwaysRun = true)
  public void test0() {
	  System.out.println("main test");
  }
}
