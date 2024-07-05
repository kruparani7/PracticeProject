package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage {
	
	WebDriver ldriver;
	public loginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement userName;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pwd;
	
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbutton;
	
	
	
	
	public void setUserName(String uname) {
		userName.sendKeys(uname);
	}
	
	
	
	public void setPwd(String pswd) {
		pwd.sendKeys(pswd);
	}
	
	
	public void Click() {
		
		loginbutton.click();
	}
	
	
	

}
