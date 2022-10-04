package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBAse;

public class ResisterPage extends TestBAse{
	
	public ResisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstName;
	public void enterFirstName(String name)
	{
		firstName.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastName;
	public void enterlastName(String last)
	{
		lastName.sendKeys(last);
	}
	
	@FindBy(xpath="//input[@id='email_address']")
	private WebElement email_address;
	public void enterEmailAddress(String email)
	{
		email_address.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	@FindBy(xpath="//input[@id='confirmation']")
	private WebElement confirm_password;
	public void enterConfirmPassword(String cpass)
	{
		confirm_password.sendKeys(cpass);
	}
	
	@FindBy(xpath="//span[contains(text(),'Register')]")
	private WebElement resister;
	public void clickOnResisterButton( )
	{
		resister.click();
	}
	
	@FindBy(xpath="//strong[contains(text(),'Hello, Ram Roy!')]")
	private WebElement dashboard;
	public void verifyRegistration()
	{
		dashboard.getText();
	}

}
