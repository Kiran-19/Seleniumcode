package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class S38_CompareResultsTestNG_SoftAssert {

	@Test
	public void createUser()
	{
		SoftAssert s=new SoftAssert();
		String eResult="Vijay Mutalik"; //To be taken from excel file
		String aResult="Vijay";	//To be taken from application
		s.assertEquals(aResult, eResult);
		Reporter.log("Done", true);
		s.assertAll();
		//do not write any statements after assertAll() bcoz those will not get executed
		System.out.println("This will not executed");
	}

}
