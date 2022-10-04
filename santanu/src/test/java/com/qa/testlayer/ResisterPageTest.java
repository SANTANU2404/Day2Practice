package com.qa.testlayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.pagelayer.ResisterPage;
import com.qa.testbase.TestBAse;

public class ResisterPageTest extends TestBAse{
	
	@Test
	public void verifyResisterPage() throws InterruptedException
	{
		ResisterPage page=new ResisterPage();
		page.enterFirstName("Tom");
		Thread.sleep(2000);
		page.enterlastName("Jerry");
		Thread.sleep(2000);
		page.enterEmailAddress("sahadebpratima24@gmail.com");
		page.enterPassword("SAHADEBpratima24@");
		
		//scroll down
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		page.enterConfirmPassword("SAHADEBpratima24@");
		page.clickOnResisterButton();
		
		page.verifyRegistration();
	}

}
