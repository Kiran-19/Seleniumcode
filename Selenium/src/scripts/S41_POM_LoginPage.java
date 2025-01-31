package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S41_POM_LoginPage {

	 //Deceleration
	@FindBy(id="username")
      private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement btnClick;
	
	//initialisation
	public S41_POM_LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Utilisation
	public void setUsername(String un) {
		unTB.sendKeys(un);
		
	}
	
	public void setPassword(String pwd) {
		pwTB.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnClick.click();
	}
}
