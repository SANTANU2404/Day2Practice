package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBAse;

public class DashBoardPage extends TestBAse{
	public DashBoardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//a[contains(text(),'TV')]")
//	private WebElement tv_btn;
//	public void clickOnTV()
//	{
//		tv_btn.click();
//	}
	
	@FindBy(xpath="(//a[(text()='My Wishlist')])[2]")
	private WebElement my_wishlist;
	public void clickOnMyWishlist()
	{
		my_wishlist.click();
	}

}
