package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S9_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8008/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String script="document.getElementById('username').value='Sudeer'";
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript(script);
        Thread.sleep(2000);
        String script1="document.getElementById('username').value=''";
        js.executeScript(script1);
        Thread.sleep(2000);
        String element="document.getElementById('keepLoggedInCheckBox').click()";
        js.executeScript(element);
        
        driver.close();
	}

}
