package Utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestCases.BaseClass;
import io.qameta.allure.Attachment;


public class allurelistener implements ITestListener {
	
	@Attachment
	public byte[] saveFailureScreenshot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	public void OnStart(ITestContext icontext) {
		System.out.println("I am on starte method"+ icontext.getName());
		icontext.setAttribute("WebDriver",BaseClass.driver);
		
	}
	
	public void OnFinish(ITestContext icontext) {
		System.out.println("I am on finished method"+ icontext.getName());
	}
	
	public void OnFailure(ITestResult result) {
		saveFailureScreenshot(BaseClass.driver);
	}

}
