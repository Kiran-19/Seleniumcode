package scripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S21_ChildBrowserPopup1 {

	public static void main(String[] args) throws InterruptedException {
 
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.naukri.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
    Set<String> allwindows = driver.getWindowHandles();
    
    for(String wh:allwindows) {
    	System.out.println(wh);
    	driver.switchTo().window(wh).close();
    	Thread.sleep(2000);
    }
      

	}

}
