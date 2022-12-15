package Velocity_TestNG;

import org.testng.annotations.Test;

public class Sample {
 
	@Test(priority=1,invocationCount = 2)
  public void Setup() 
  {
	  System.out.println("opening browser");
  }
  
  @Test(priority=2)
  public void Login()
  {
	  System.out.println("Login in the application");
  }
  
  @Test(priority = 3)
  public void Closing()
  {
	  System.out.println("Closing the browser");
  }
}
