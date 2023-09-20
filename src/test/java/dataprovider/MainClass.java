package dataprovider;

import org.testng.annotations.Test;

public class MainClass {
  @Test(dataProvider = "names",dataProviderClass = DataProviderSuplier.class)
  public void displayName(String s) {
	  System.out.println(s);
  }
}
