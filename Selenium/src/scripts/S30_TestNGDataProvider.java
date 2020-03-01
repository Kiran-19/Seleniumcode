package scripts;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class S30_TestNGDataProvider {
	
	@DataProvider
	public Object[][] getData()//Return type of @DataProvider's method is Object[][](two dimensional object)
	{
		Object a[][]=new Object[3][2];//1st dimension is for row and 2nd for column
		a[0][0]="User1";
		a[0][1]=123;
		a[1][0]="User2";
		a[1][1]=456;
		a[2][0]="User3";
		a[2][1]=789;
		return a;
	}
	@Test(dataProvider="getData")
	public void userDetails(String un, int pw)
	{
		Reporter.log(un+" : "+pw, true);
	}
}


