package scripts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S16_HiddenDivisionPopUp {

	public static void main(String[] args) {
		
		 WebDriver driver=new FirefoxDriver();
	        driver.get("http://vrlbus.in/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.findElement(By.id("TRIPSTARTDATE")).click();
	        driver.findElement(By.linkText("29")).click();
	        
	        driver.findElement(By.id("TRIPSTARTDATE")).clear();
	        DateTimeFormatter DTF=DateTimeFormatter.ofPattern("dd-/MM-/yyyy");
	        LocalDate date=LocalDate.now().plusMonths(1);
	        driver.findElement(By.id("TRIPSTARTDATE")).sendKeys(DTF.format(date));
	        driver.close();
	}

}
