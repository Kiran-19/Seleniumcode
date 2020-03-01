package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class S29_TestNGDemo {
	
	final int i=3;// it should be a constant if you are using this variable for invocationCount
	@Test
	public void test1()
	{
		Reporter.log("My name is Sudeer");//it will write this information only in html repot 
		Reporter.log("Automation trainer",true);//it will write this information in both console and html repot 
		Reporter.log("Selenium WebDriver",false);//it will write this information only in html repot 
	
	}
	@Test(invocationCount=i)
	//@Test(expectedExceptions=Exception)--check it
	public void test2()
	{
		Reporter.log("Test2 method",true);//it will write this information in both console and html repot 	
	}

}
