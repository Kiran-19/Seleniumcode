package scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S22_ChildBrowserPopup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		//Open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		java.util.Set<String> allBrowsers = driver.getWindowHandles();
		for(String wh:allBrowsers)
		{
			WebDriver browser = driver.switchTo().window(wh);
			String title=browser.getTitle();
			System.out.println(title);
			browser.close();
	}

}
}
