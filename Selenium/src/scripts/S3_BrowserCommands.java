package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S3_BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

          String key="webdriver.chrome.driver";
          String value="./Drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8008/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement uname=driver.findElement(By.id("username"));
		WebElement pwd=driver.findElement(By.name("pwd"));
		WebElement login=driver.findElement(By.xpath("//div[.='Login ']"));
		
		
		uname.sendKeys("admin");
		pwd.sendKeys("manager");
		login.click();
		Thread.sleep(2000);
		String text= driver.getTitle();
		System.out.println(text);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		WebElement tasks=driver.findElement(By.xpath("//div[text()='TASKS']"));
		tasks.click();
		
		driver.navigate().to("http://google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement logout=driver.findElement(By.id("logoutLink"));
		logout.click();
		Thread.sleep(2000);
		String ltext= driver.getTitle();
		System.out.println(ltext);
		
		driver.close();
		
		

	}

}
