package TestCases;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utilities.Readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	Readconfig read=new Readconfig();
	String url=read.getApplicationURL();
	String uname=read.getusername();
	String pwd=read.getpassword();
    public static WebDriver driver;
    
    public static Logger logger;
    
    
    @Parameters("browser")
    @BeforeClass
    public void setUp(String br) {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	
    	 logger=Logger.getLogger("demo project");
    	PropertyConfigurator.configure("log4j.properties");
    	
    	if(br.equals("chrome")){
    		WebDriverManager.chromedriver().setup();
        	driver=new ChromeDriver();
    		
    	}
    	else if(br.equals("firefox")) {
    		
    	}
    	else if(br.equals("ie")) {
    		
    	}
    	driver.get(url);
    }
    
    @AfterClass
    public void tearDown() {
    	driver.quit();
    	
    }
    

	public void verifyURL(String url) {
		if(driver.getTitle().equalsIgnoreCase(url)) {
			Assert.assertTrue(true);
			logger.info("Title is correct");
			
		}
		else {
			Assert.assertTrue(false);
			logger.info("Title is wrong");
		}
	}

}
