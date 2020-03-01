package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S40_TestNGDependsOnMethod
{

		@BeforeClass
		public void openApp()
		{
			Reporter.log("Open the Application", true);
		}
		
		@AfterClass
		public void closeApp()
		{
			Reporter.log("Close the Application", true);
		}
		
		@BeforeMethod
		public void login()
		{
			Reporter.log("Login", true);
		}
		
		@AfterMethod
		public void logout()
		{
			Reporter.log("Logout", true);

		}
		
		@Test
		public void test1()
		{
			Reporter.log("test1() method",true);
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.google.com");
			driver.findElement(By.id("invalid")).click();
		}
		
		@Test(dependsOnMethods="test1")//This test2 method will get executed only if the test1 method gets executed
		//If test1 method is failed then testng will skip the test2 method execution
		public void test2()
		{
			Reporter.log("test2() method",true);
		}

}
