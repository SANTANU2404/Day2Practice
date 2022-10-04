package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBAse;

public class LoginPage extends TestBAse{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='Account'])[1]")
	private WebElement account;
	public void clickOnAccount( )
	{
		account.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Log In')]")
	private WebElement log_in;
	public void clickOnlogIn()
	{
		log_in.click();
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email_address;
	public void enterEmailAddress(String email)
	{
		email_address.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	@FindBy(xpath="//button[@id='send2']")
	private WebElement log_in_btn;
	public void clickOnLogInBtn()
	{
		log_in_btn.click();
	}
	

}
