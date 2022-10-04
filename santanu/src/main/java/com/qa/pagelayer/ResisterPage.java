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

}
