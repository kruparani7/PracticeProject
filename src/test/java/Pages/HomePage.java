package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver ldriver;
	public HomePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[@class='caret']")
	WebElement MyAccountClick;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement LoginClick;
	
	public void clickMyAccount() {
		MyAccountClick.click();
	}
	
	public void clickLogin() {
		LoginClick.click();
	}
	

}
