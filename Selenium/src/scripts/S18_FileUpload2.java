package scripts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class S18_FileUpload2 {

	public static void main(String[] args) throws InterruptedException {
		
		File f=new File("./Photos/Testing.doxc");
		String path=f.getAbsolutePath();

		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String xp="//input[@value='Post your CV']";
        driver.findElement(By.xpath(xp)).sendKeys(path);
        Thread.sleep(2000);
        System.out.println("This statement is executed after the file is uploaded");
	    Thread.sleep(2000);
	    driver.close();

	}

}
