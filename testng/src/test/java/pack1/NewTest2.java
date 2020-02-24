package pack1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest2 {
	
	@Test(timeOut=2000)
	  public void f() {
		  System.out.println("Test");
	  }
	  @Test(expectedExceptions=ArithmeticException.class)
	  public void f1() {
		  int a=10/0;
		  System.out.println("Test1");
	  }
	 /* @Parameters({"browser"})
	  @Test
	  public void f2(String browser) {
		  System.out.println("Test2" + browser);
	  }*/
	  @Test(dependsOnMethods="f4")
	  public void f3() {
		  System.out.println("Test3");
	  }
	  @Test
	  public void f4() {
		  System.out.println("Test4");
	  }
}
