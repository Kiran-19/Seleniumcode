package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S10_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8008/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement uname=driver.findElement(By.id("username"));
		WebElement pwd=driver.findElement(By.name("pwd"));
		WebElement login=driver.findElement(By.xpath("//div[.='Login ']"));
		uname.sendKeys("admin");
		pwd.sendKeys("manager");
		login.click();
		
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.titleContains("Enter"));
		String homepage=driver.getTitle();
		System.out.println(homepage);
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.id("logoutLink"));
		String text=logout.getText();
		System.out.println("Got the text of the logout button and tet is :"+text);
		logout.click();
		wait.until(ExpectedConditions.titleContains("Login"));
		String loginpage=driver.getTitle();
		System.out.println(loginpage);
		driver.close();

	}

}
