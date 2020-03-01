package scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class S37_CompareResultsTestNG {

	@Test
	public void createUser()
	{
		String eResult="Sudeer Kumar"; //To be taken from excel file
		String aResult="Sudeer Raj";	//To be taken from application
		Assert.assertEquals(aResult, eResult);
        Reporter.log("Done", true);  //This statement will not execute
	}

}
