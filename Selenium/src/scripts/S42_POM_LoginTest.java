package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class S42_POM_LoginTest {
	
	static
	{
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key, value);
	}

	public static void main(String[] args) throws InterruptedException {
		
		String a[][]=new String[2][2];
		a[0][0]="admin";
		a[0][1]="abcd";
		a[1][0]="admin";
		a[1][1]="manager";
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8008/login.do");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		S41_POM_LoginPage l=new S41_POM_LoginPage(driver);
		for(int i=0;i<=1;i++) {
			
			String un=a[i][0];
			String pw=a[i][1];
			System.out.println(un+" "+pw);
			l.setUsername(un);
			Thread.sleep(2000);
			l.setPassword(pw);
			Thread.sleep(2000);
			l.clickLogin();
			Thread.sleep(2000);
			String text=driver.getTitle();
			System.out.println(text);
		}
		driver.quit();
		

	}

}
