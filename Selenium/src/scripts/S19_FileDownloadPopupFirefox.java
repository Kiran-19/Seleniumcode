package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S19_FileDownloadPopupFirefox {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver=new FirefoxDriver();
        driver.get("https://selenium.dev/downloads/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String xp="//a[@href='https://bit.ly/2zm3ZzF']";
        driver.findElement(By.xpath(xp)).click();
        Thread.sleep(5000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_S);
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        System.out.println("File dowloaded");
        driver.close();
        
	}

}
