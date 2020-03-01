package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S15_AlertPopUp {

	public static void main(String[] args) {
		
	    WebDriver driver=new FirefoxDriver();
        driver.get("http://vrlbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("Button1")).click();
        
        Alert a=driver.switchTo().alert();
       String text = a.getText();
       System.out.println(text);
       a.accept();
       driver.close();
        
       
	}

}
