package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class S11_HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/KIRAN/Desktop/BasentSelenium/Selenium/Dropdown.html");
		   WebElement Droplist= driver.findElement(By.name("country"));
		   Select sel=new Select(Droplist);
		   if(sel.isMultiple()) {
			   System.out.println("It is multiple select list box");
		   }
		   else
		   {
			   System.out.println("It is single select list box");
		   }
		   
		   sel.selectByIndex(1);
		   Thread.sleep(2000);
		   sel.selectByValue("country2");
		   Thread.sleep(2000);
		   sel.selectByVisibleText("Australia");
		   Thread.sleep(2000);
		  // sel.deselectByIndex(0);
		   
		  List<WebElement> options= sel.getOptions();
		  
		  for(WebElement l:options) {
			  String ff=l.getText();
			  System.out.println(ff);
		  }
		
		  
		  WebElement multilelist=driver.findElement(By.name("company"));
		  Select sel1=new Select(multilelist);
		  if(sel1.isMultiple()) {
			  System.out.println("It is multipl select list box");
		  }
		  else 
		  {
			  System.out.println("It is single select list box");
		  }

		  sel1.selectByIndex(0);
		  sel1.selectByValue("company2");
		  sel1.selectByVisibleText("CGI");
		  sel1.deselectAll();
		  Thread.sleep(2000);
		  
		  List<WebElement> options1= sel1.getOptions();
		  
		  for(WebElement dd:options1) {
			   String drop =dd.getText();
			   System.out.println(drop);
		  }
		  driver.close();
		  
	}

}
