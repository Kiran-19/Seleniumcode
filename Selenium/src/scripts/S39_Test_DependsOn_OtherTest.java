package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class S39_Test_DependsOn_OtherTest {
	
	@Test
	public void createuser() {
		
		SoftAssert s=new SoftAssert();
		s.assertEquals("Vijay", "Vijay");
		Reporter.log("Created",true);
        s.assertAll();
		
	}
	@Test(dependsOnMethods="createuser")
	public void deleteuser() {
		
		Reporter.log("Delete",true);
		
	
	}
}
