package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S23_WindowPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		//Open the browser
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Robot r=new Robot();
		//Press 'Ctrl+P' to open Print pop-up
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		Thread.sleep(6000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		//Click on 'Cancel' button
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		driver.quit();

	}

}
