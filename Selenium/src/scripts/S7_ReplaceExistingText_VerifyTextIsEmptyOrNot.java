package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S7_ReplaceExistingText_VerifyTextIsEmptyOrNot {

	public static void main(String[] args) throws InterruptedException {
		
		String key="webdriver.chrome.driver";
        String value="./Drivers/chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/KIRAN/Desktop/BasentSelenium/Selenium/mypage.html");
		Thread.sleep(2000);
		
		WebElement textbox=driver.findElement(By.id("textbox"));
		textbox.clear();
		
		String textboxvalue= textbox.getAttribute("value");
		if(textboxvalue.length()==0) {
			System.out.println("text box is empty");
		}
		else {
			System.out.println("text box is not empty");
		}
		Thread.sleep(2000);
		textbox.sendKeys("Entering new values");
		Thread.sleep(2000);
		
		String textboxvalue1= textbox.getAttribute("value");
		if(textboxvalue1.length()==0) {
			System.out.println("text box is empty");
		}
		else {
			System.out.println("text box is not empty");
		}
        driver.close();
	}

}
