package com.qa.testlayer;

import org.testng.annotations.Test;

import com.qa.pagelayer.LoginPage;
import com.qa.testbase.TestBAse;

public class LoginPageTest extends TestBAse{
	
	@Test
	public void verifyLogin()
	{
		LoginPage login=new LoginPage();
		login.clickOnAccount();
		login.clickOnlogIn();
		login.enterEmailAddress("santanumaity24041996@gmail.com");
		login.enterpassword("SAHADEBpratima24@");
		login.clickOnLogInBtn();
	}

}
