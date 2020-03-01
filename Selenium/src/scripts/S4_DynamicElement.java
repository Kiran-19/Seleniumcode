package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4_DynamicElement {

	public static void main(String[] args) throws InterruptedException {

		  String key="webdriver.chrome.driver";
          String value="./Drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/KIRAN/Desktop/BasentSelenium/Selenium/IdentifyDynamicElement.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement checkbox = driver.findElement(By.xpath("//tr[td[text()='A2']]/td[2]"));
		checkbox.click();
		Thread.sleep(3000);
		driver.close();

	}

}
