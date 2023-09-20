package groups;

import org.testng.annotations.Test;

public class RegExpressionGroups {
	@Test(groups = { "windows.checkintest" })
	  public void testWindowsOnly() {
		System.out.println("testwindowsonly");
	  }
	 
	  @Test(groups = {"linux.checkintest"} )
	  public void testLinuxOnly() {
		  System.out.println("testlinuxonly");
	  }
	 
	  @Test(groups = { "windows.functest"})
	  public void testWindowsToo() {
		  System.out.println("testwindowstoo");
	  }

}
