package scripts;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class S13_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

         WebDriver driver=new FirefoxDriver();
         driver.get("http://demo.guru99.com/test/drag_drop.html");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         WebElement source = driver.findElement(By.xpath("//li[2][@id='fourth'][@data-id='2']/a"));
         WebElement target = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
         
         Actions act= new Actions(driver);
         Thread.sleep(2000);
         act.dragAndDrop(source, target).build().perform();
         Thread.sleep(2000);
         driver.close();
         
         
         

	}

}
