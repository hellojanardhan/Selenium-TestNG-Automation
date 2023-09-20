package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderIndices {
  @Test(dataProvider = "display" )
  public void test(String s) {
	  System.out.println(s);
  }
  @DataProvider(indices = {0,2})
  public String[] display() {
	  String[] names=new String[] {
		  "Jhon",
		  "james",
		  "cloe",
		  "lucifer"
	  };
	  return names;
  }
}
