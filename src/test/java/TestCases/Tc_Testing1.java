package TestCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.loginPage;
import Utilities.allurelistener;

@Listeners({allurelistener.class})
public class Tc_Testing1 extends BaseClass {
	
	@Test
	public void page() {
		
		logger.info("URL is opened");
		HomePage home=new HomePage(driver);
		verifyURL("Your Store");
		
		
		logger.info("Title is verified");
		
		home.clickMyAccount();
		logger.info("my account clicked");
		home.clickLogin();
		logger.info("log in sclicked");
		verifyURL("Account Login");
		logger.info("entered into caccount login page");
		
		loginPage login=new loginPage(driver);
		
		login.setUserName(uname);
		logger.info("entered email id");
		login.setPwd(pwd);
		logger.info("entered password");
		login.Click();
		logger.info("clicked on login button");
		
		
		
		
		
	}

}
