package com.qa.testlayer;

import org.testng.annotations.Test;

import com.qa.pagelayer.ResisterPage;
import com.qa.testbase.TestBAse;

public class ResisterPageTest extends TestBAse{
	
	@Test
	public void verifyResisterPage()
	{
		ResisterPage page=new ResisterPage();
		page.enterFirstName("Ram");
	}

}