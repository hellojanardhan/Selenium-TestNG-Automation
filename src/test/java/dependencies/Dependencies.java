package dependencies;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependencies {
	String trackingNumber=null;
////	@Ignore
//  @Test(priority = 1)
//  public void createShipment() {
//	  System.out.println("createShipment");
////	  trackingNumber="ABC123";
//  }
  @Test(priority = 2,dependsOnMethods = {"createShipment"},alwaysRun = true)
  public void trackShipment() throws Exception {
	  
	  if(trackingNumber!=null) {
		  System.out.println("trackShipment"+trackingNumber);
	  }
	  else {
		throw new Exception("invalid number");
	}
  }
  @Test(priority = 3,dependsOnMethods = {"trackShipment"},alwaysRun = true,ignoreMissingDependencies = true)
  public void cancelShipment() throws Exception {
	  System.out.println("cancelShipment");
	  if(trackingNumber!=null) {
		  System.out.println("cancelShipment");
	  }
	  else {
		  throw new Exception("invalid number");
	}
  }
}
