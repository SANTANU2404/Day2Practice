package com.qa.testlayer;

import org.testng.annotations.Test;

import com.qa.pagelayer.DashBoardPage;
import com.qa.testbase.TestBAse;

public class DashboardTest extends TestBAse{
	@Test
	public void verifyDashboard() {
	DashBoardPage dash=new DashBoardPage();
	
	dash.clickOnTV();
	}

}
