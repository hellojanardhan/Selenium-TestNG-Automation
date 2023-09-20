package dataprovider;

import org.testng.annotations.DataProvider;


public class DataProviderSuplier {
  @DataProvider(name = "names")
  public String[] Test() {
	  String[] names=new String[] {
			  "james",
			  "jhon",
			  "lucifer"
	  };
	  return names;
  }
  @DataProvider(name = "name")
  public String[] Test1() {
	  String[] names=new String[] {
			  "ramesh",
			  "suresh",
			  "jitesh"
	  };
	  return names;
  }
}
