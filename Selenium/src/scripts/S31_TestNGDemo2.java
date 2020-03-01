package scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S31_TestNGDemo2 {
	
	@BeforeClass
	public void appOpen() {
		Reporter.log("Application opened",true);
	}
	
	@AfterClass
	public void appClose() {
		Reporter.log("Application closed",true);
		
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login is sucessful",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout is sucessful",true);
	}
	
	@Test
	public void display() {
		Reporter.log("Display user",true);
	}
     @Test(invocationCount=2, priority=1)
	public void createUser() {
    	 Reporter.log("User created",true);
     }
     @Test(priority=2)
 	public void deleteUser() {
     	 Reporter.log("User deleted",true);
      }
}
