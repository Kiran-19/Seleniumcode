package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S8_RetrivingInformationFromElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/KIRAN/Desktop/BasentSelenium/Selenium/getAttribute.html");
		
		String tooltiptext=driver.findElement(By.id("a1")).getAttribute("title");
		System.out.println(tooltiptext);
		
		String URL=driver.findElement(By.id("a1")).getAttribute("href");
		System.out.println(URL);
		
		String text=driver.findElement(By.id("a1")).getText();
		System.out.println(text);
		
		String TagName=driver.findElement(By.id("a1")).getTagName();
		System.out.println(TagName);
		Thread.sleep(2000);
		driver.close();

	}

}
