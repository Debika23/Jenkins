package pack1;

import org.testng.annotations.Test;

public class NewTest {
	
	@Test(enabled=false)
	  public void f() {
		  System.out.println("Test");
	  }
	  @Test(priority=2)
	  public void f1() {
		  System.out.println("Test1");
	  }
	  @Test(priority=3)
	  public void f2() {
		  System.out.println("Test2");
	  }
	  @Test(priority=1)
	  public void f3() {
		  System.out.println("Test3");
	  }
}
