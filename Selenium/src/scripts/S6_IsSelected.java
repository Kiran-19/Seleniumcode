package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class S6_IsSelected {

	public static void main(String[] args) {
		  String key="webdriver.chrome.driver";
          String value="./Drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/KIRAN/Desktop/BasentSelenium/Selenium/IdentifyDynamicElement.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		boolean status =driver.findElement(By.xpath("//tr[1]//td/input")).isSelected();
		
		if(status==true)
		{
			System.out.println("Checkbox selected");
		}
		else
		{
			System.out.println("Checkbox unselecred");
	
		}
        
	}

}
