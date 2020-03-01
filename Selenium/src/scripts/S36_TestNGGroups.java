package scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S36_TestNGGroups {
	
	@BeforeMethod(alwaysRun=true)
public void login() {
		Reporter.log("Login",true);
	}
	@AfterMethod(alwaysRun=true)
	public void logout() {
		Reporter.log("Logout",true);
	}
	
	@Test(groups= {"Customer","Smoke"})
	public void createcustomer() {
		Reporter.log("Create Customer",true);
	}
	
	@Test(enabled=false, groups= {"Customer"})
	public void deletecustomer() {
		Reporter.log("Delete Customer",true);
	}
	
	@Test(groups= {"Project","Smoke"})
	public void createproject() {
		Reporter.log("Create Project",true);
	}
	
	@Test(groups= {"Project"})
	public void deleteproject() {
		Reporter.log("Delete Project",true);
	}
	
}
