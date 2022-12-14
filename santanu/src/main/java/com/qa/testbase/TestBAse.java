package com.qa.testbase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pagelayer.DashBoardPage;
import com.qa.pagelayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBAse {
	public static WebDriver driver;
	public DashBoardPage dash;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://live.techpanda.org/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		//click on my account
		//driver.findElement(By.xpath("(//span[@class='label'])[3]")).click();
		//driver.findElement(By.xpath("(//a[text()='My Account'])[1]")).click();
		
		//click on create new account
		//driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();
		
		LoginPage login=new LoginPage();
		login.clickOnAccount();
		login.clickOnlogIn();
		login.enterEmailAddress("santanumaity24041996@gmail.com");
		login.enterpassword("SAHADEBpratima24@");
		login.clickOnLogInBtn();
		
		dash=new DashBoardPage();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}

}
