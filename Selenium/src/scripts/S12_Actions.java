package scripts;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class S12_Actions {

	public static void main(String[] args) throws InterruptedException {

         WebDriver driver=new FirefoxDriver();
         driver.get("https://www.toolsqa.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         WebElement element = driver.findElement(By.xpath("//span[text()='Tutorial']"));
         Actions act= new Actions(driver);
         act.moveToElement(element).build().perform();
         
         Thread.sleep(2000);
         driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
         Thread.sleep(2000);
         driver.close();
         
         
         

	}

}
